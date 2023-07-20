package org.example.service;


import org.example.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("Run UserService Method...");

        userDao.addUserDao();
    }
}
