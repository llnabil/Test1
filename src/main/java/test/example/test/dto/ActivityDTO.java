package test.example.test.dto;


import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ActivityDTO {
    private Long id;
    private String name;
    private String description;
    private String location;
    private String date;
    private List<Long> productIds;
    public ActivityDTO() {
    }

    // Parameterized Constructor
    public ActivityDTO(Long id, String title, String description, String date , List<Long> productIds) {
        this.id = id;
        this.name = title;
        this.description = description;
        this.date = date;
        this.productIds = productIds ;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location=location;
    }

}
