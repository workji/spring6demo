package org.example.controller;

import org.example.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("controller run...");

        userService.addUserService();
    }
}
