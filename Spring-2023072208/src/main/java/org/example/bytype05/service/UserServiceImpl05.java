package org.example.bytype05.service;

import org.example.bytype05.dao.UserDao05;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl05 implements UserService05 {

    private UserDao05 userDao05;

    public UserServiceImpl05(UserDao05 userDao05) {
        this.userDao05 = userDao05;
    }

    @Override
    public void addUserService() {
        System.out.println("Run UserService Method...");

        userDao05.addUserDao();
    }
}
