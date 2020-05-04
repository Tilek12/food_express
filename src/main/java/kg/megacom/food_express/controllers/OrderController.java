package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.OrderDto;
import kg.megacom.food_express.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/save")
    public OrderDto saveOrder(@RequestBody OrderDto orderDto){

        return orderService.saveOrder(orderDto);
    }
}
