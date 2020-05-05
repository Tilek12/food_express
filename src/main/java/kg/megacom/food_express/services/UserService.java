package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto saveUser(UserDto userDto);

    List<UserDto> findAllUser();

}
