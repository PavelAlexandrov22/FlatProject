package by.itacademy.user.controller.dto;

import by.itacademy.user.dao.Role;
import by.itacademy.user.dao.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserDetailModel implements UserDetails {

    private final String username;
    private final String password;
    private final List<GrantedAuthority> authorities;

    private boolean isAccountNonExpired=false;
    private boolean isAccountNonLocked=false;
    private boolean isCredentialsNonExpired=false;
    private boolean isEnabled=false;

    public UserDetailModel(User user) {
        this.username = user.getMail();
        this.password = user.getPassword();
        this.authorities = Stream.of("ROLE_"+user.getRoleDao().getRole().name()).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
        switch (user.getStatusDao().getStatus()){
            case DEACTIVATED -> isAccountNonLocked = true;
            case ACTIVATED -> isAccountNonExpired=true;
            case WAITING_ACTIVATION -> isEnabled=true;
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        isAccountNonExpired = accountNonExpired;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        isAccountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        isCredentialsNonExpired = credentialsNonExpired;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
