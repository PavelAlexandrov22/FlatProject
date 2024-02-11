package v1.domain.realtApiDTO;

import java.util.List;

public class Title {
    private List<String> dealTypeParts;
    private String objectPart;

    public Title() {
    }

    public Title(List<String> dealTypeParts, String objectPart) {
        this.dealTypeParts = dealTypeParts;
        this.objectPart = objectPart;
    }

    public List<String> getDealTypeParts() {
        return dealTypeParts;
    }

    public void setDealTypeParts(List<String> dealTypeParts) {
        this.dealTypeParts = dealTypeParts;
    }

    public String getObjectPart() {
        return objectPart;
    }

    public void setObjectPart(String objectPart) {
        this.objectPart = objectPart;
    }
}
