package org.example.bytype03.controller;

import org.example.bytype03.service.UserService03;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController03 {

    private UserService03 userService03;

    @Autowired
    public UserController03(UserService03 userService03) {
        this.userService03 = userService03;
    }

    public void addUser() {
        System.out.println("controller run...");

        userService03.addUserService();
    }
}
