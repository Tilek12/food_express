package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.database.RestaurantRepository;
import kg.megacom.food_express.mappers.RestaurantMapper;
import kg.megacom.food_express.models.dto.RestaurantDto;
import kg.megacom.food_express.models.entity.Restaurant;
import kg.megacom.food_express.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Override
    public RestaurantDto saveRestaurant(RestaurantDto restaurantDto) {

        Restaurant restaurant = RestaurantMapper.INSTANCE.restaurantDtoToRestaurant(restaurantDto);
        restaurant = restaurantRepository.save(restaurant);
        restaurantDto = RestaurantMapper.INSTANCE.restaurantToRestaurantDto(restaurant);

        return restaurantDto;
    }

    @Override
    public List<RestaurantDto> findAllRestaurant() {

        return restaurantRepository.findAll()
                .stream()
                .map(RestaurantMapper.INSTANCE::restaurantToRestaurantDto)
                .collect(Collectors.toList());
    }
}
