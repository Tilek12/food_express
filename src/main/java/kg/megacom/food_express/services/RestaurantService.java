package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.RestaurantDto;

import java.util.List;

public interface RestaurantService {

    RestaurantDto saveRestaurant(RestaurantDto restaurantDto);

    List<RestaurantDto> findAllRestaurant();
}
