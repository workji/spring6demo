package org.example.bytype06.service;

import org.example.bytype06.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "myUserServiceImpl01")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("myUserDaoImpl01")
    private UserDao userDao;

    @Override
    public void addUserService() {
        System.out.println("Run UserService Method...");

        userDao.addUserDao();
    }
}
