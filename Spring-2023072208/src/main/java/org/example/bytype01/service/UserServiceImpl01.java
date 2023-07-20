package org.example.bytype01.service;

import org.example.bytype01.dao.UserDao01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl01 implements UserService01 {

    @Autowired
    private UserDao01 userDao01;

    @Override
    public void addUserService() {
        System.out.println("Run UserService Method...");

        userDao01.addUserDao();
    }
}
