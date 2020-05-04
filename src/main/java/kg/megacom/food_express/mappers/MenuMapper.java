package kg.megacom.food_express.mappers;

import kg.megacom.food_express.models.dto.MenuDto;
import kg.megacom.food_express.models.entity.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MenuMapper {

    MenuMapper INSTANCE = Mappers.getMapper(MenuMapper.class);

    Menu menuDtoToMenu(MenuDto menuDto);

    MenuDto menuToMenuDto(Menu menu);
}
