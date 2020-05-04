package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.mappers.RestaurantMapper;
import kg.megacom.food_express.models.dto.RestaurantDto;
import kg.megacom.food_express.models.entity.Restaurant;
import kg.megacom.food_express.services.RestaurantService;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Override
    public RestaurantDto saveRestaurant(RestaurantDto restaurantDto) {

        Restaurant restaurant = RestaurantMapper.INSTANCE.restaurantDtoToRestaurant(restaurantDto);

        restaurantDto = RestaurantMapper.INSTANCE.restaurantToRestaurantDto(restaurant);

        return restaurantDto;
    }
}
