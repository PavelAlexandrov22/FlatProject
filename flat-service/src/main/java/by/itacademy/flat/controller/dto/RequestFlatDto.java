package by.itacademy.flat.controller.dto;

import java.util.List;

public class RequestFlatDto {
    private List<String> price;
    private List<String> bedrooms;
    private List<String> area;
    private List<Integer> floors;
    private Boolean photo;

    public RequestFlatDto() {
    }

    public RequestFlatDto(List<String> price, List<String> bedrooms, List<String> area, List<Integer> floors, Boolean photo) {
        this.price = price;
        this.bedrooms = bedrooms;
        this.area = area;
        this.floors = floors;
        this.photo = photo;
    }

    public List<String> getPrice() {
        return price;
    }

    public void setPrice(List<String> price) {
        this.price = price;
    }

    public List<String> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(List<String> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public List<String> getArea() {
        return area;
    }

    public void setArea(List<String> area) {
        this.area = area;
    }

    public List<Integer> getFloors() {
        return floors;
    }

    public void setFloors(List<Integer> floors) {
        this.floors = floors;
    }

    public Boolean getPhoto() {
        return photo;
    }

    public void setPhoto(Boolean photo) {
        this.photo = photo;
    }
}
