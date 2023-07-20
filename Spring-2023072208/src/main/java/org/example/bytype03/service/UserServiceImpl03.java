package org.example.bytype03.service;

import org.example.byname.dao.UserDao03;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl03 implements UserService03 {

    private UserDao03 userDao03;

    @Autowired
    public UserServiceImpl03(UserDao03 userDao03) {
        this.userDao03 = userDao03;
    }

    @Override
    public void addUserService() {
        System.out.println("Run UserService Method...");

        userDao03.addUserDao();
    }
}
