package v1.domain.realtApiDTO;

public class Place {
    private String zone;
    private String height;

    public Place() {
    }

    public Place(String zone, String height) {
        this.zone = zone;
        this.height = height;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
