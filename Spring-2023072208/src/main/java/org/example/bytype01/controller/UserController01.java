package org.example.bytype01.controller;

import org.example.bytype01.service.UserService01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController01 {

    // @Autowired = ByType
    @Autowired
    private UserService01 userService01;

    public void addUser() {
        System.out.println("controller run...");

        userService01.addUserService();
    }
}
