package kg.megacom.food_express.models.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderDto {

    private Long id;
    private Date createDate;
    private double cost;

    private CustomerDto customerDto;

    List<RestaurantOrderDto> restaurantOrderDtoList;

    List<OrderDetailDto> orderDetailDtoList;

    List<OrderStatusDto> orderStatusDtoList;
}
