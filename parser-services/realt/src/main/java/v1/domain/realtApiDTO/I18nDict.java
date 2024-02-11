package v1.domain.realtApiDTO;

public class I18nDict {
    private ServerError serverError;
    private ServerObject objects;
    private ServerAuth auth;
    private ServerLocation location;
    private ServerCommon common;

    public I18nDict() {
    }

    public I18nDict(ServerError serverError, ServerObject objects, ServerAuth auth, ServerLocation location, ServerCommon common) {
        this.serverError = serverError;
        this.objects = objects;
        this.auth = auth;
        this.location = location;
        this.common = common;
    }

    public ServerError getServerError() {
        return serverError;
    }

    public void setServerError(ServerError serverError) {
        this.serverError = serverError;
    }

    public ServerObject getObjects() {
        return objects;
    }

    public void setObjects(ServerObject objects) {
        this.objects = objects;
    }

    public ServerAuth getAuth() {
        return auth;
    }

    public void setAuth(ServerAuth auth) {
        this.auth = auth;
    }

    public ServerLocation getLocation() {
        return location;
    }

    public void setLocation(ServerLocation location) {
        this.location = location;
    }

    public ServerCommon getCommon() {
        return common;
    }

    public void setCommon(ServerCommon common) {
        this.common = common;
    }
}
