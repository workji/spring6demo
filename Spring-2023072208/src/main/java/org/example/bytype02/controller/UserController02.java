package org.example.bytype02.controller;

import org.example.bytype02.service.UserService02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController02 {

    private UserService02 userService02;

    @Autowired
    public void setUserService(UserService02 userService02) {
        this.userService02 = userService02;
    }

    public void addUser() {
        System.out.println("controller run...");

        userService02.addUserService();
    }
}
