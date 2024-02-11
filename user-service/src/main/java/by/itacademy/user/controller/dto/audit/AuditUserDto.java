package by.itacademy.user.controller.dto.audit;

import java.util.UUID;

public class AuditUserDto {
    private String mail;
    private String fio;
    private String role;

    private String uuid;

    public AuditUserDto() {
    }

    public AuditUserDto(String uuid, String mail, String fio, String role) {
        this.uuid=uuid;
        this.mail = mail;
        this.fio = fio;
        this.role = role;
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
