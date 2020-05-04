package kg.megacom.food_express.mappers;

import kg.megacom.food_express.models.dto.UserDto;
import kg.megacom.food_express.models.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userDtoToUser(UserDto userDto);

    UserDto userToUserDto(User user);
}
