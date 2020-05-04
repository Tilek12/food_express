package kg.megacom.food_express.mappers;

import kg.megacom.food_express.models.dto.OrderDetailDto;
import kg.megacom.food_express.models.entity.OrderDetail;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderDetailMapper {

    OrderDetailMapper INSTANCE = Mappers.getMapper(OrderDetailMapper.class);

    OrderDetail orderDetailDtoToOrderDetail(OrderDetailDto orderDetailDto);

    OrderDetailDto orderDetailToOrderDetailDto(OrderDetail orderDetail);
}
