package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.MenuDto;

import java.util.List;

public interface MenuService {

    MenuDto saveMenu(MenuDto menuDto);

    List<MenuDto> findAllMenu();
}
