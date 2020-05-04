package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.mappers.OrderDetailMapper;
import kg.megacom.food_express.models.dto.OrderDetailDto;
import kg.megacom.food_express.models.entity.OrderDetail;
import kg.megacom.food_express.services.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Override
    public OrderDetailDto saveOrderDetail(OrderDetailDto orderDetailDto) {

        OrderDetail orderDetail = OrderDetailMapper.INSTANCE.orderDetailDtoToOrderDetail(orderDetailDto);

        orderDetailDto = OrderDetailMapper.INSTANCE.orderDetailToOrderDetailDto(orderDetail);

        return orderDetailDto;
    }
}
