package org.example.bytype04.service;

import org.example.bytype04.dao.UserDao04;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl04 implements UserService04 {

    private UserDao04 userDao04;

    public UserServiceImpl04(@Autowired UserDao04 userDao04) {
        this.userDao04 = userDao04;
    }

    @Override
    public void addUserService() {
        System.out.println("Run UserService Method...");

        userDao04.addUserDao();
    }
}
