package by.itacademy.mail.error.dto;

public class ResponseDto {
    private String logref;
    private  String message;
    public ResponseDto(String logref, String message) {
        this.logref=logref;
        this.message=message;
    }

    public ResponseDto() {
    }

    public String getLogref() {
        return logref;
    }

    public void setLogref(String logref) {
        this.logref = logref;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
