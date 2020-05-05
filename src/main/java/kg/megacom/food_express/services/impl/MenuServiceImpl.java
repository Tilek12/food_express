package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.database.MenuRepository;
import kg.megacom.food_express.mappers.MenuMapper;
import kg.megacom.food_express.models.dto.MenuDto;
import kg.megacom.food_express.models.entity.Menu;
import kg.megacom.food_express.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuRepository menuRepository;

    @Override
    public MenuDto saveMenu(MenuDto menuDto) {

        Menu menu = MenuMapper.INSTANCE.menuDtoToMenu(menuDto);
        menu = menuRepository.save(menu);
        menuDto = MenuMapper.INSTANCE.menuToMenuDto(menu);

        return menuDto;
    }

    @Override
    public List<MenuDto> findAllMenu() {
        return menuRepository.findAll()
                .stream()
                .map(MenuMapper.INSTANCE::menuToMenuDto)
                .collect(Collectors.toList());
    }
}
