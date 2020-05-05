package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.OrderDto;
import kg.megacom.food_express.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/save")
    public OrderDto saveOrder(@RequestBody OrderDto orderDto){

        return orderService.saveOrder(orderDto);
    }

    @GetMapping(value = "/list")
    public List<OrderDto> getAllOrder(){
        return orderService.findAllOrder();
    }
}
