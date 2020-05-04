package kg.megacom.food_express.mappers;

import kg.megacom.food_express.models.dto.RestaurantDto;
import kg.megacom.food_express.models.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant restaurantDtoToRestaurant(RestaurantDto restaurantDto);

    RestaurantDto restaurantToRestaurantDto(Restaurant restaurant);
}
