package v1.domain.realtApiDTO;

import java.util.List;

public class ObjectParams {
    private List<String> headerParams;
    private List<String> objectParams;

    public ObjectParams() {
    }
    public ObjectParams(List<String> headerParams, List<String> objectParams) {
        this.headerParams = headerParams;
        this.objectParams = objectParams;
    }

    public List<String> getHeaderParams() {
        return headerParams;
    }

    public void setHeaderParams(List<String> headerParams) {
        this.headerParams = headerParams;
    }

    public List<String> getObjectParams() {
        return objectParams;
    }

    public void setObjectParams(List<String> objectParams) {
        this.objectParams = objectParams;
    }
}
