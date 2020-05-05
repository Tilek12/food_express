package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.database.RestaurantOrderRepository;
import kg.megacom.food_express.mappers.RestaurantOrderMapper;
import kg.megacom.food_express.models.dto.RestaurantDto;
import kg.megacom.food_express.models.dto.RestaurantOrderDto;
import kg.megacom.food_express.models.entity.RestaurantOrder;
import kg.megacom.food_express.services.RestaurantOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantOrderServiceImpl implements RestaurantOrderService {

    @Autowired
    RestaurantOrderRepository restaurantOrderRepository;

    @Override
    public RestaurantOrderDto saveRestaurantOrder(RestaurantOrderDto restaurantOrderDto) {

        RestaurantOrder restaurantOrder = RestaurantOrderMapper.INSTANCE.restaurantOrderDtoToRestaurantOrder(restaurantOrderDto);
        restaurantOrder = restaurantOrderRepository.save(restaurantOrder);
        restaurantOrderDto = RestaurantOrderMapper.INSTANCE.restaurantOrderToRestaurantOrderDto(restaurantOrder);

        return restaurantOrderDto;
    }

    @Override
    public List<RestaurantOrderDto> findAllRestaurantOrder() {

        return restaurantOrderRepository.findAll()
                .stream()
                .map(RestaurantOrderMapper.INSTANCE::restaurantOrderToRestaurantOrderDto)
                .collect(Collectors.toList());
    }
}
