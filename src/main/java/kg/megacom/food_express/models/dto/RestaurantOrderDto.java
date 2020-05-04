package kg.megacom.food_express.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class RestaurantOrderDto {

    private Long id;
    private boolean isReady;
    private Date startDate;
    private Date endDate;

    private RestaurantDto restaurantDto;

    private OrderDto orderDto;

}
