package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.RestaurantDto;
import kg.megacom.food_express.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping(value = "/save")
    public RestaurantDto saveRestaurant(@RequestBody RestaurantDto restaurantDto){
        return restaurantService.saveRestaurant(restaurantDto);
    }
}
