package kg.megacom.food_express.models.dto;

import lombok.Data;

import java.util.List;

@Data
public class RestaurantDto {

    private Long id;
    private String name;
    private boolean isActive;

    List<RestaurantOrderDto> restaurantOrderDtoList;

}
