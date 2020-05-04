package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.OrderStatusDto;
import kg.megacom.food_express.services.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orderStatus")
public class OrderStatusController {

    @Autowired
    private OrderStatusService orderStatusService;

    @PostMapping(value = "/save")
    OrderStatusDto saveOrderStatus(@RequestBody OrderStatusDto orderStatusDto){
        return orderStatusService.saveOrderStatus(orderStatusDto);
    }
}
