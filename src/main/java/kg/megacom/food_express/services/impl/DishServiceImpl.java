package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.database.DishRepository;
import kg.megacom.food_express.mappers.DishMapper;
import kg.megacom.food_express.models.dto.DishDto;
import kg.megacom.food_express.models.entity.Dish;
import kg.megacom.food_express.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DishServiceImpl implements DishService {

    @Autowired
    DishRepository dishRepository;

    @Override
    public DishDto saveDish(DishDto dishDto) {

        Dish dish = DishMapper.INSTANCE.dishDtoToDish(dishDto);
        dish = dishRepository.save(dish);
        dishDto = DishMapper.INSTANCE.dishToDishDto(dish);

        return dishDto;
    }

    @Override
    public List<DishDto> findAllDishes() {
        return dishRepository.findAll()
                .stream()
                .map(DishMapper.INSTANCE::dishToDishDto)
                .collect(Collectors.toList());
    }
}
