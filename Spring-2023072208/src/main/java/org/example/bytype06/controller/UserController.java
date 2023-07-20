package org.example.bytype06.controller;

import org.example.bytype06.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller(value = "myController01")
public class UserController {

    @Autowired
    @Qualifier("myUserServiceImpl01")
    private UserService userService;

    public void addUser() {
        System.out.println("controller run...");

        userService.addUserService();
    }
}
