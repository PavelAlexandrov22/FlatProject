package by.itacademy.flat.controller.dto;

import java.util.List;
import java.util.UUID;

public class ResponseFlatDto {

    private String OfferType;
    private String description;
    private int area;
    private int price;

    private int floor;

    private int bedrooms;

    private List<String> photos;

    private String originalUrl;

    private UUID uuid;

    private long dtCreate;

    private long dtUpdate;

    public ResponseFlatDto() {
    }

    public ResponseFlatDto(String offerType, String description, int area, int price, int floor, int bedrooms, List<String> photos, String originalUrl, UUID uuid, long dtCreate, long dtUpdate) {
        OfferType = offerType;
        this.description = description;
        this.area = area;
        this.price = price;
        this.floor = floor;
        this.bedrooms = bedrooms;
        this.photos = photos;
        this.originalUrl = originalUrl;
        this.uuid = uuid;
        this.dtCreate = dtCreate;
        this.dtUpdate = dtUpdate;
    }

    public String getOfferType() {
        return OfferType;
    }

    public void setOfferType(String offerType) {
        OfferType = offerType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public long getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(long dtCreate) {
        this.dtCreate = dtCreate;
    }

    public long getDtUpdate() {
        return dtUpdate;
    }

    public void setDtUpdate(long dtUpdate) {
        this.dtUpdate = dtUpdate;
    }
}
