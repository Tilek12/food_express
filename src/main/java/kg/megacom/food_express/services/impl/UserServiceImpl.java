package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.mappers.UserMapper;
import kg.megacom.food_express.models.dto.UserDto;
import kg.megacom.food_express.models.entity.User;
import kg.megacom.food_express.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDto saveUser(UserDto userDto) {

        User user = UserMapper.INSTANCE.userDtoToUser(userDto);

        userDto = UserMapper.INSTANCE.userToUserDto(user);

        return userDto;
    }
}
