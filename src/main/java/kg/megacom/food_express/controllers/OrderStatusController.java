package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.OrderStatusDto;
import kg.megacom.food_express.services.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orderStatus")
public class OrderStatusController {

    @Autowired
    private OrderStatusService orderStatusService;

    @PostMapping(value = "/save")
    OrderStatusDto saveOrderStatus(@RequestBody OrderStatusDto orderStatusDto){

        return orderStatusService.saveOrderStatus(orderStatusDto);
    }

    @GetMapping(value = "/list")
    public List<OrderStatusDto> getAllOrderStatus(){

        return orderStatusService.findAllOrderStatus();
    }
}
