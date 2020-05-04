package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.mappers.DishMapper;
import kg.megacom.food_express.models.dto.DishDto;
import kg.megacom.food_express.models.entity.Dish;
import kg.megacom.food_express.services.DishService;
import org.springframework.stereotype.Service;

@Service
public class DishServiceImpl implements DishService {
    @Override
    public DishDto saveDish(DishDto dishDto) {

        Dish dish = DishMapper.INSTANCE.dishDtoToDish(dishDto);

        dishDto = DishMapper.INSTANCE.dishToDishDto(dish);

        return dishDto;
    }
}
