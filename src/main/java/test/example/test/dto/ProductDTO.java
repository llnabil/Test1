package test.example.test.dto;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Data
@Setter
@Getter
public class ProductDTO {
        private Long id;
        private String name;
        private String description;
        private Double price;
        private Long activityId;

        public ProductDTO() {
        }

        // Parameterized Constructor
        public ProductDTO(Long id, String name, String description, Double price, Long activityId) {
                this.id = id;
                this.name = name;
                this.description = description;
                this.price = price;
                this.activityId = activityId;
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

        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public Double getPrice() {
                return price;
        }

        public void setPrice(Double price) {
                this.price = price;
        }

        public Long getActivityId() {
                return activityId;
        }

        public void setActivityId(Long activityId) {
                this.activityId = activityId;
        }
}


