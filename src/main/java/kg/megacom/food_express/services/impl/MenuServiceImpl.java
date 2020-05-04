package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.mappers.MenuMapper;
import kg.megacom.food_express.models.dto.MenuDto;
import kg.megacom.food_express.models.entity.Menu;
import kg.megacom.food_express.services.MenuService;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {
    @Override
    public MenuDto saveMenu(MenuDto menuDto) {

        Menu menu = MenuMapper.INSTANCE.menuDtoToMenu(menuDto);

        menuDto = MenuMapper.INSTANCE.menuToMenuDto(menu);

        return menuDto;
    }
}
