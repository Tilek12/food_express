package kg.megacom.food_express.mappers;

import kg.megacom.food_express.models.dto.RestaurantOrderDto;
import kg.megacom.food_express.models.entity.RestaurantOrder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantOrderMapper {

    RestaurantOrderMapper INSTANCE = Mappers.getMapper(RestaurantOrderMapper.class);

    RestaurantOrder restaurantOrderDtoToRestaurantOrder(RestaurantOrderDto restaurantOrderDto);

    RestaurantOrderDto restaurantOrderToRestaurantOrderDto(RestaurantOrder restaurantOrder);
}
