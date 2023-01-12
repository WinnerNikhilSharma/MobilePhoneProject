package com.example.Accio.Module.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/phone-user")
public class Controller {

    @Autowired
    Services service;

    @GetMapping("/get-user-name/{number}")
    public String getNumber (@PathVariable String number){
        return service.getPhoneNumber(number);
    }

    @PostMapping("/add-name-number")
    public void addNewUser (@RequestBody Consumer consumer){
        service.addNewUser(consumer);
    }
}
