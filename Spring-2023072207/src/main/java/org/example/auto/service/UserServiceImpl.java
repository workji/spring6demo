package org.example.auto.service;

import org.example.auto.dao.UserDao;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("Run UserService Method...");

        userDao.addUserDao();
    }
}
