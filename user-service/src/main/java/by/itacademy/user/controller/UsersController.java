package by.itacademy.user.controller;

import by.itacademy.user.core.formatter.LongFormat;
import by.itacademy.user.core.formatter.Style;
import by.itacademy.user.controller.dto.LoginDto;
import by.itacademy.user.controller.dto.UserDto;
import by.itacademy.user.controller.dto.VerificationDto;
import by.itacademy.user.controller.utils.JwtTokenHandler;
import by.itacademy.user.dao.*;
import by.itacademy.user.error.exception.*;
import by.itacademy.user.service.UserDetailServiceImpl;
import by.itacademy.user.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@EnableWebSecurity
@RequestMapping("/users")
public class UsersController {
    private final UserService userService;
    private final UserDetailServiceImpl userManager;
    private final PasswordEncoder encoder;
    private final JwtTokenHandler jwtHandler;

    public UsersController(UserService userService, UserDetailServiceImpl userManager, PasswordEncoder encoder, JwtTokenHandler jwtHandler
    ) {
        this.userService = userService;
        this.userManager = userManager;
        this.encoder = encoder;
        this.jwtHandler = jwtHandler;

    }

    @PostMapping()
//    @RolesAllowed("ADMIN")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUserByAdmin(@RequestBody UserDto userDto) throws UserDtoValidateException, IllegalStatusException, IllegalRoleException, LoginValidateException {
        LocalDateTime now = LocalDateTime.now();
        userDto.setDtCreate(now);
        userDto.setDtUpdate(now);
        if (userDto.getRole() == null || userDto.getRole().isEmpty()) {
            userDto.setRole(Role.USER.name());
        }
        if (userDto.getStatus() == null || userDto.getStatus().isEmpty()) {
            userDto.setStatus(Status.WAITING_ACTIVATION.name());
        }
        if (userService.validateUserDtoFields(userDto, false)) {
            userService.createByAdmin(userDto);
        } else {
            throw new UserDtoValidateException("The request contains incorrect data. Change the request and send it again");
        }
    }

    @GetMapping
//    @RolesAllowed({"ADMIN", "MANAGER"})
    public Page<UserDto> getAllUsersByAdmin(
            @PageableDefault(value = 20, page = 0)
            @SortDefault(sort = "mail", direction = Sort.Direction.ASC)
            Pageable pageable
    ) {
        return userService.getUsersDtoPage(pageable);
    }

    @GetMapping("/{uuid}")
//    @RolesAllowed({"ADMIN", "MANAGER"})
    public ResponseEntity<?> getCurrentUserByAdmin(@PathVariable(name = "uuid") String uuid) throws IllegalUserUUIDException {
        return ResponseEntity.ok(userService.getUserDtoUsedUUID(uuid));
    }

    @PutMapping("/{uuid}/dt_update/{dt_update}")
//    @RolesAllowed({"ADMIN"})
    @ResponseStatus(HttpStatus.OK)
    public void updateUserByAdmin(@PathVariable(name = "uuid") String uuid,
                                  @PathVariable(name = "dt_update")
                                  @LongFormat(style = Style.FULL)
                                  LocalDateTime dtUpdate,
                                  @RequestBody UserDto userDto
    ) throws IllegalUserUUIDException, LoginValidateException {
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
        SecurityContextHolder.getContext().getAuthentication().getAuthorities().forEach(System.out::println);

        //todo crete isBooleanProperty in UserDetailsManager
        userService.validateUserDtoFields(userDto, true);
        UserDto updateableUserDto = userService.getUserDtoUsedUUID(uuid);
        updateableUserDto.setPassword(encoder.encode(userDto.getPassword()));
        userService.updateUserByUUID(userDto, updateableUserDto, dtUpdate);
    }

    @PostMapping("/registration")
//    @PermitAll
    @ResponseStatus(HttpStatus.CREATED)
    public void registrationOfUserBySelf(@RequestBody UserDto userDto) throws IllegalRoleException, IllegalStatusException, UserDtoValidateException, LoginValidateException {
        LocalDateTime now = LocalDateTime.now();
        userDto.setDtCreate(now);
        userDto.setDtUpdate(now);
        userDto.setRole(Role.USER.name());
        userDto.setStatus(Status.WAITING_ACTIVATION.name());
        if (userService.validateUserDtoFields(userDto, false)) {
            userService.registration(userDto);
        } else {
            throw new UserDtoValidateException("The request contains incorrect data. Change the request and send it again");
        }
    }

    //fixme how to send other code again
    @GetMapping("/verification")
//    @PermitAll
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void getVerification(@RequestParam(name = "code") String code, @RequestParam(name = "mail") String mail) throws IllegalVerificationCodeException, LoginValidateException {
        VerificationDto verificationDto = new VerificationDto(code, mail);
        if (userService.isMailExist(verificationDto.getMail())) {
            if (verificationDto.getCode().length() != 6) {
                throw new IllegalVerificationCodeException("Something wrong, try again later");
            }
            String gettingCode = userService.getValidateCodeOfUser(verificationDto.getMail());
            if (code != null && !code.isEmpty() && code.equalsIgnoreCase(gettingCode)) {
                userService.getVerificaton(verificationDto.getMail());
            } else {
                throw new IllegalVerificationCodeException("Something wrong, try again later");
            }
        } else {
            throw new LoginValidateException("try again later or contact with our support administrator");
        }
    }

    @PostMapping("/login")
//    @PermitAll
    @ResponseBody

    public String loginByUser(@RequestBody LoginDto loginDto) throws LoginValidateException, WaitingAvtivationException, DeactivatedActivationException {
        UserDetails details = userManager.loadUserByUsername(loginDto.getLogin());
        if (!encoder.matches(loginDto.getPassword(), details.getPassword())) {
            throw new LoginValidateException("Ooops.... Something wrong!");
        }
        UserDto userDto = userService.getUserDto(loginDto.getLogin());
        switch (Status.valueOf(userDto.getStatus())) {
            case WAITING_ACTIVATION -> throw new WaitingAvtivationException("please, confirm your account");
            case DEACTIVATED -> throw new DeactivatedActivationException("your account is blocked");
        }
        return jwtHandler.generateAccessToken(details,userDto.getRole());

    }

    @GetMapping("/me")
//    @PermitAll
    public UserDto getUserDetailsBySelf() throws LoginValidateException {
        String self = SecurityContextHolder.getContext().getAuthentication().getName();
        UserDto userDto = userService.getUserDto(self);
        if (userDto != null) {
            return userDto;
        } else {
            throw new LoginValidateException("no information about this user");
        }
    }

}
