package org.example.bytype05.controller;

import org.example.bytype05.service.UserService05;
import org.springframework.stereotype.Controller;

@Controller
public class UserController05 {

    private UserService05 userService05;

    public UserController05(UserService05 userService05) {
        this.userService05 = userService05;
    }

    public void addUser() {
        System.out.println("controller run...");

        userService05.addUserService();
    }
}
