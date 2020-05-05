package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.OrderDto;

import java.util.List;

public interface OrderService {

    OrderDto saveOrder(OrderDto orderDto);

    List<OrderDto> findAllOrder();

}
