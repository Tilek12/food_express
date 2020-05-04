package kg.megacom.food_express.models.dto;

import lombok.Data;

@Data
public class MenuDto {

    private Long id;
    private String name;

    private RestaurantDto restaurantDto;
}
