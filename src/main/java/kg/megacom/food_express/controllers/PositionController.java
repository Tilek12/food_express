package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.PositionDto;
import kg.megacom.food_express.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PositionController {

    @Autowired
    private PositionService positionService;

    @PostMapping(value = "/save")
    PositionDto savePosition(@RequestBody PositionDto positionDto){

        return positionService.savePosition(positionDto);
    }

    @GetMapping(value = "/list")
    public List<PositionDto> getAllPosition(){

        return positionService.findAllPosition();
    }
}
