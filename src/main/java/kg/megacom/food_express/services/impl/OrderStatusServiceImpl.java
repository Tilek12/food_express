package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.database.OrderStatusRepository;
import kg.megacom.food_express.mappers.OrderStatusMapper;
import kg.megacom.food_express.models.dto.OrderStatusDto;
import kg.megacom.food_express.models.entity.OrderStatus;
import kg.megacom.food_express.services.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderStatusServiceImpl implements OrderStatusService {

    @Autowired
    OrderStatusRepository orderStatusRepository;

    @Override
    public OrderStatusDto saveOrderStatus(OrderStatusDto orderStatusDto) {

        OrderStatus orderStatus = OrderStatusMapper.INSTANCE.orderStatusDtoToOrderStatus(orderStatusDto);
        orderStatus = orderStatusRepository.save(orderStatus);
        orderStatusDto = OrderStatusMapper.INSTANCE.orderStatusToOrderStatusDto(orderStatus);

        return orderStatusDto;
    }

    @Override
    public List<OrderStatusDto> findAllOrderStatus() {

        return orderStatusRepository.findAll()
                .stream()
                .map(OrderStatusMapper.INSTANCE::orderStatusToOrderStatusDto)
                .collect(Collectors.toList());
    }
}
