package kg.megacom.food_express.mappers;

import kg.megacom.food_express.models.dto.OrderStatusDto;
import kg.megacom.food_express.models.entity.OrderStatus;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderStatusMapper {

    OrderStatusMapper INSTANCE = Mappers.getMapper(OrderStatusMapper.class);

    OrderStatus orderStatusDtoToOrderStatus(OrderStatusDto orderStatusDto);

    OrderStatusDto orderStatusToOrderStatusDto(OrderStatus orderStatus);
}
