package org.example.bytype04.controller;

import org.example.bytype04.service.UserService04;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController04 {

    private UserService04 userService04;

    public UserController04(@Autowired UserService04 userService04) {
        this.userService04 = userService04;
    }

    public void addUser() {
        System.out.println("controller run...");

        userService04.addUserService();
    }
}
