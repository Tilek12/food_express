package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.RestaurantOrderDto;
import kg.megacom.food_express.services.RestaurantOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/restaurantOrder")
public class RestaurantOrderController {

    @Autowired
    private RestaurantOrderService restaurantOrderService;

    @PostMapping(value = "/save")
    public RestaurantOrderDto saveRestaurantOrder(@RequestBody RestaurantOrderDto restaurantOrderDto){

        return restaurantOrderService.saveRestaurantOrder(restaurantOrderDto);
    }

    @GetMapping(value = "/list")
    public List<RestaurantOrderDto> getAllRestaurantOrder(){

        return restaurantOrderService.findAllRestaurantOrder();
    }
}
