package com.example.cratimesheet.controller;

import com.example.cratimesheet.entity.User;
import com.example.cratimesheet.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    ServiceUser su;

    @RequestMapping(value="addUser", method= RequestMethod.POST)
    public void addUser(@RequestBody User user)
    {
        su.addUser(user);

    }


   @RequestMapping(value="info", method= RequestMethod.GET)
    public String addformateur()
    {
       return "application is working";
    }

}
