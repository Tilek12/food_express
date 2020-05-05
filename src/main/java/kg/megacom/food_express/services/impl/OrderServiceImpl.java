package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.database.OrderRepository;
import kg.megacom.food_express.mappers.OrderMapper;
import kg.megacom.food_express.models.dto.OrderDto;
import kg.megacom.food_express.models.entity.Order;
import kg.megacom.food_express.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public OrderDto saveOrder(OrderDto orderDto) {

        Order order = OrderMapper.INSTANCE.orderDtoToOrder(orderDto);
        order = orderRepository.save(order);
        orderDto = OrderMapper.INSTANCE.orderToOrderDto(order);

        return orderDto;

    }

    @Override
    public List<OrderDto> findAllOrder() {

        return orderRepository.findAll()
                .stream()
                .map(OrderMapper.INSTANCE::orderToOrderDto)
                .collect(Collectors.toList());
    }
}
