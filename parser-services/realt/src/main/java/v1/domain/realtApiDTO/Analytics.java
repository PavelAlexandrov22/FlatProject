package v1.domain.realtApiDTO;

public class Analytics {
    private String type;
    private String propertyType;
    private String propertyCategory;

    public Analytics() {
    }

    public Analytics(String type, String propertyType, String propertyCategory) {
        this.type = type;
        this.propertyType = propertyType;
        this.propertyCategory = propertyCategory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyCategory() {
        return propertyCategory;
    }

    public void setPropertyCategory(String propertyCategory) {
        this.propertyCategory = propertyCategory;
    }
}
