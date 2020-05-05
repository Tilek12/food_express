package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.PhoneDto;
import kg.megacom.food_express.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/phone")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @PostMapping(value = "/save")
    public PhoneDto savePhone(@RequestBody PhoneDto phoneDto){

        return phoneService.savePhone(phoneDto);
    }

    @GetMapping(value = "/list")
    public List<PhoneDto> getAllPhone(){

        return phoneService.findAllPhone();
    }
}
