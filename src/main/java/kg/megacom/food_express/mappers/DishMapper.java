package kg.megacom.food_express.mappers;

import kg.megacom.food_express.models.dto.DishDto;
import kg.megacom.food_express.models.entity.Dish;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DishMapper {

    DishMapper INSTANCE = Mappers.getMapper(DishMapper.class);

    Dish dishDtoToDish(DishDto dishDto);

    DishDto dishToDishDto(Dish dish);

}
