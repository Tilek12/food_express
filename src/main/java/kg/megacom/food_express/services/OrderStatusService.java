package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.OrderStatusDto;

public interface OrderStatusService {

    OrderStatusDto saveOrderStatus(OrderStatusDto orderStatusDto);
}
