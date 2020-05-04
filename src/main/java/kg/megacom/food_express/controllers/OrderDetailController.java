package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.OrderDetailDto;
import kg.megacom.food_express.services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orderDetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @PostMapping(value = "/save")
    public OrderDetailDto saveOrderDetail(@RequestBody OrderDetailDto orderDetailDto){

        return orderDetailService.saveOrderDetail(orderDetailDto);
    }
}
