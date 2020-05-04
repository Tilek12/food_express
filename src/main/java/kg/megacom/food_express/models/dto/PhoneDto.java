package kg.megacom.food_express.models.dto;

import lombok.Data;

@Data
public class PhoneDto {

    private Long id;
    private String phone;
    private boolean isActive;

    private UserDto userDto;

}
