package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.UserDto;
import kg.megacom.food_express.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/save")
    public UserDto saveUser(@RequestBody UserDto userDto){

        return userService.saveUser(userDto);
    }

    @GetMapping(value = "/list")
    public List<UserDto> getAllUser(){

        return userService.findAllUser();
    }
}
