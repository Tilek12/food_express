package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.PositionDto;
import kg.megacom.food_express.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PositionController {

    @Autowired
    private PositionService positionService;

    @PostMapping(value = "/save")
    PositionDto savePosition(@RequestBody PositionDto positionDto){
        return positionService.savePosition(positionDto);
    }
}
