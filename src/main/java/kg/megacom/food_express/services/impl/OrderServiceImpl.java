package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.mappers.OrderMapper;
import kg.megacom.food_express.models.dto.OrderDto;
import kg.megacom.food_express.models.entity.Order;
import kg.megacom.food_express.services.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderDto saveOrder(OrderDto orderDto) {

        Order order = OrderMapper.INSTANCE.orderDtoToOrder(orderDto);

        orderDto = OrderMapper.INSTANCE.orderToOrderDto(order);

        return orderDto;

    }
}
