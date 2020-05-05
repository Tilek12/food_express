package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.OrderDetailDto;

import java.util.List;

public interface OrderDetailService {

    OrderDetailDto saveOrderDetail(OrderDetailDto orderDetailDto);

    List<OrderDetailDto> findAllOrderDetail();
}
