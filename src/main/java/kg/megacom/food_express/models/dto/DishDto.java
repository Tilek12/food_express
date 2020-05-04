package kg.megacom.food_express.models.dto;

import lombok.Data;

import java.util.List;

@Data
public class DishDto {

    private Long id;

    private String name;
    private double size;
    private boolean isActive;

    private MenuDto menuDto;

    List<OrderDetailDto> orderDetailDtoList;

}
