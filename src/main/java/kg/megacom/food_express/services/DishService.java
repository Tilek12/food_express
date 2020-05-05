package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.DishDto;

import java.util.List;

public interface DishService {

    DishDto saveDish(DishDto dishDto);

    List<DishDto> findAllDishes();
}
