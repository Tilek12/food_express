package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.OrderDetailDto;

public interface OrderDetailService {

    OrderDetailDto saveOrderDetail(OrderDetailDto orderDetailDto);
}
