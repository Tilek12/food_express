package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.RestaurantOrderDto;

import java.util.List;

public interface RestaurantOrderService {

    RestaurantOrderDto saveRestaurantOrder(RestaurantOrderDto restaurantOrderDto);

    List<RestaurantOrderDto> findAllRestaurantOrder();
}
