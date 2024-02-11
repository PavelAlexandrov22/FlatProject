package by.itacademy.flat.controller.dto;

import java.util.List;
import java.util.Map;

public class FlatDto {
    private Map<String,Integer> price;
    private Map<String,Integer> bedrooms;
    private Map<String,Integer> area;
    private List<Integer> floors;
    private Boolean photo;

    public FlatDto() {
    }

    public FlatDto(Map<String, Integer> price, Map<String, Integer> bedrooms, Map<String, Integer> area, List<Integer> floors, Boolean photo) {
        this.price = price;
        this.bedrooms = bedrooms;
        this.area = area;
        this.floors = floors;
        this.photo = photo;
    }

    public Map<String, Integer> getPrice() {
        return price;
    }

    public void setPrice(Map<String, Integer> price) {
        this.price = price;
    }

    public Map<String, Integer> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Map<String, Integer> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Map<String, Integer> getArea() {
        return area;
    }

    public void setArea(Map<String, Integer> area) {
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
