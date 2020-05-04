package kg.megacom.food_express.models.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderStatusDto {

    private Long id;
    private Date startDate;
    private Date endDate;

    private List<UserDto> userDtoList;

    private StatusDto statusDto;

    private OrderDto orderDto;

}
