package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.mappers.RestaurantOrderMapper;
import kg.megacom.food_express.models.dto.RestaurantDto;
import kg.megacom.food_express.models.dto.RestaurantOrderDto;
import kg.megacom.food_express.models.entity.RestaurantOrder;
import kg.megacom.food_express.services.RestaurantOrderService;
import org.springframework.stereotype.Service;

@Service
public class RestaurantOrderServiceImpl implements RestaurantOrderService {
    @Override
    public RestaurantOrderDto saveRestaurantOrder(RestaurantOrderDto restaurantOrderDto) {

        RestaurantOrder restaurantOrder = RestaurantOrderMapper.INSTANCE.restaurantOrderDtoToRestaurantOrder(restaurantOrderDto);

        restaurantOrderDto = RestaurantOrderMapper.INSTANCE.restaurantOrderToRestaurantOrderDto(restaurantOrder);

        return restaurantOrderDto;
    }
}
