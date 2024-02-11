package v1.domain.realtApiDTO;

public class ServerError {
    private UserError user;
    private CommonError common;
    private ProError pro;

    public ServerError() {
    }

    public ServerError(UserError user, CommonError common, ProError pro) {
        this.user = user;
        this.common = common;
        this.pro = pro;
    }

    public UserError getUser() {
        return user;
    }

    public void setUser(UserError user) {
        this.user = user;
    }

    public CommonError getCommon() {
        return common;
    }

    public void setCommon(CommonError common) {
        this.common = common;
    }

    public ProError getPro() {
        return pro;
    }

    public void setPro(ProError pro) {
        this.pro = pro;
    }
}
