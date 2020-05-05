package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.PriceDto;
import kg.megacom.food_express.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/price")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @PostMapping(value = "/save")
    PriceDto savePrice(@RequestBody PriceDto priceDto){

        return priceService.savePrice(priceDto);
    }

    @GetMapping(value = "/list")
    public List<PriceDto> getAllPrice(){

        return priceService.findAllPrice();
    }
}
