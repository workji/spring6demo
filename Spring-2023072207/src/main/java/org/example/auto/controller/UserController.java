package org.example.auto.controller;

import org.example.auto.service.UserService;

public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("controller run...");

        userService.addUserService();
    }
}
