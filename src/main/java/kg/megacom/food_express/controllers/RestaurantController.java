package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.RestaurantDto;
import kg.megacom.food_express.models.dto.RestaurantOrderDto;
import kg.megacom.food_express.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping(value = "/save")
    public RestaurantDto saveRestaurant(@RequestBody RestaurantDto restaurantDto){

        return restaurantService.saveRestaurant(restaurantDto);
    }

    @GetMapping(value = "/list")
    public List<RestaurantDto> getAllRestaurant(){

        return restaurantService.findAllRestaurant();
    }
}
