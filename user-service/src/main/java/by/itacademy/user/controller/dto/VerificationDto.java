package by.itacademy.user.controller.dto;

public class VerificationDto {
    private String code;
    private String mail;

    public VerificationDto() {
    }

    public VerificationDto(String code, String mail) {
        this.code = code;
        this.mail = mail;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
