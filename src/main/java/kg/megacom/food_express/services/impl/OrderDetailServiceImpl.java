package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.database.OrderDetailRepository;
import kg.megacom.food_express.mappers.OrderDetailMapper;
import kg.megacom.food_express.models.dto.OrderDetailDto;
import kg.megacom.food_express.models.entity.OrderDetail;
import kg.megacom.food_express.services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDetailDto saveOrderDetail(OrderDetailDto orderDetailDto) {

        OrderDetail orderDetail = OrderDetailMapper.INSTANCE.orderDetailDtoToOrderDetail(orderDetailDto);
        orderDetail = orderDetailRepository.save(orderDetail);
        orderDetailDto = OrderDetailMapper.INSTANCE.orderDetailToOrderDetailDto(orderDetail);

        return orderDetailDto;
    }

    @Override
    public List<OrderDetailDto> findAllOrderDetail() {

        return orderDetailRepository.findAll()
                .stream()
                .map(OrderDetailMapper.INSTANCE::orderDetailToOrderDetailDto)
                .collect(Collectors.toList());
    }
}
