package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.PriceDto;
import kg.megacom.food_express.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/price")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @PostMapping(value = "/save")
    PriceDto savePrice(@RequestBody PriceDto priceDto){
        return priceService.savePrice(priceDto);
    }
}
