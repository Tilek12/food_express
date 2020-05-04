package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.OrderDto;

public interface OrderService {

    OrderDto saveOrder(OrderDto orderDto);

}
