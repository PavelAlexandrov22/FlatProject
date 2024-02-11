package v1.domain.realtApiDTO;

public class Shortcut {
    private String parkingPlaces;
    private String objectType;

    public Shortcut() {
    }

    public Shortcut(String parkingPlaces, String objectType) {
        this.parkingPlaces = parkingPlaces;
        this.objectType = objectType;
    }

    public String getParkingPlaces() {
        return parkingPlaces;
    }

    public void setParkingPlaces(String parkingPlaces) {
        this.parkingPlaces = parkingPlaces;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }
}
