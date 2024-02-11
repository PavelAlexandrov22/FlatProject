package v1.domain.realtApiDTO;

public class ProError {
    private String employeeDuplicateEmail;

    public ProError() {
    }

    public ProError(String employeeDuplicateEmail) {
        this.employeeDuplicateEmail = employeeDuplicateEmail;
    }

    public String getEmployeeDuplicateEmail() {
        return employeeDuplicateEmail;
    }

    public void setEmployeeDuplicateEmail(String employeeDuplicateEmail) {
        this.employeeDuplicateEmail = employeeDuplicateEmail;
    }
}
