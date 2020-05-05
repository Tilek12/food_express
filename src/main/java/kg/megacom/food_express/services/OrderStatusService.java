package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.OrderStatusDto;

import java.util.List;

public interface OrderStatusService {

    OrderStatusDto saveOrderStatus(OrderStatusDto orderStatusDto);

    List<OrderStatusDto> findAllOrderStatus();
}
