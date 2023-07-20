package org.example.bytype06.service;

import org.example.bytype06.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplOther implements UserService {

    @Autowired
    @Qualifier("userDaoImplOther")
    private UserDao userDao;

    @Override
    public void addUserService() {
        System.out.println("Run UserService Method...");

        userDao.addUserDao();
    }
}
