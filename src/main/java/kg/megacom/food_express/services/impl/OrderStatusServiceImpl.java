package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.mappers.OrderStatusMapper;
import kg.megacom.food_express.models.dto.OrderStatusDto;
import kg.megacom.food_express.models.entity.OrderStatus;
import kg.megacom.food_express.services.OrderStatusService;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusServiceImpl implements OrderStatusService {
    @Override
    public OrderStatusDto saveOrderStatus(OrderStatusDto orderStatusDto) {

        OrderStatus orderStatus = OrderStatusMapper.INSTANCE.orderStatusDtoToOrderStatus(orderStatusDto);

        orderStatusDto = OrderStatusMapper.INSTANCE.orderStatusToOrderStatusDto(orderStatus);

        return orderStatusDto;
    }
}
