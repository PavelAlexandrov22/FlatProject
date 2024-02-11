package by.itacademy.user.controller.dto;

import java.time.LocalDateTime;

public class VerificationCodeDto {
    private LocalDateTime localDateTime;
    private String code;

    public VerificationCodeDto() {
    }

    public VerificationCodeDto(LocalDateTime localDateTime, String code) {
        this.localDateTime = localDateTime;
        this.code = code;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
