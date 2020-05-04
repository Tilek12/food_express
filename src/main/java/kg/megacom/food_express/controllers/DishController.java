package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.DishDto;
import kg.megacom.food_express.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dish")
public class DishController {

    @Autowired
    private DishService dishService;

    @PostMapping(value = "/save")
    public DishDto saveDish(@RequestBody DishDto dishDto){

        return dishService.saveDish(dishDto);
    }
}
