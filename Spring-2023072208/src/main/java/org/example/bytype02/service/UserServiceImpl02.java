package org.example.bytype02.service;

import org.example.bytype02.dao.UserDao02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl02 implements UserService02 {

    private UserDao02 userDao02;

    @Autowired
    public void setUserDao(UserDao02 userDao02) {
        this.userDao02 = userDao02;
    }

    @Override
    public void addUserService() {
        System.out.println("Run UserService Method...");

        userDao02.addUserDao();
    }
}
