package by.itacademy.user.controller.dto;

import by.itacademy.user.core.formatter.LongFormat;
import by.itacademy.user.core.formatter.Style;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.time.LocalDateTime;

@EnableWebMvc
public class UserDto {

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String mail;
    private String fio;
    private String role;
    private String status;
    private String uuid;
    private LocalDateTime dtCreate;
    private LocalDateTime dtUpdate;

    public UserDto() {
    }

    public UserDto(String password, String mail, String fio, String role, String status, String uuid, LocalDateTime dtCreate, LocalDateTime dtUpdate) {
        this.password = password;
        this.mail = mail;
        this.fio = fio;
        this.role = role;
        this.status = status;
        this.uuid = uuid;
        this.dtCreate = dtCreate;
        this.dtUpdate = dtUpdate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    @LongFormat(style = Style.FULL)
    public LocalDateTime getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(LocalDateTime dtCreate) {
        this.dtCreate = dtCreate;
    }
    @LongFormat(style = Style.FULL)
    public LocalDateTime getDtUpdate() {
        return dtUpdate;
    }

    public void setDtUpdate(LocalDateTime dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDto userDto = (UserDto) o;

        if (!mail.equals(userDto.mail)) return false;
        if (!fio.equals(userDto.fio)) return false;
        return role.equals(userDto.role);
    }

    @Override
    public int hashCode() {
        int result = mail.hashCode();
        result = 31 * result + fio.hashCode();
        result = 31 * result + role.hashCode();
        return result;
    }
}
