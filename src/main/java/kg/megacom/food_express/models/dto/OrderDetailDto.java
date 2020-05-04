package kg.megacom.food_express.models.dto;

import lombok.Data;

@Data
public class OrderDetailDto {

    private Long id;
    private double amount;

    private DishDto dishDto;

    private OrderDto orderDto;
}
