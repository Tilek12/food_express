package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.RestaurantOrderDto;

public interface RestaurantOrderService {

    RestaurantOrderDto saveRestaurantOrder(RestaurantOrderDto restaurantOrderDto);
}
