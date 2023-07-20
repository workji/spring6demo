package org.example.bytype03.dao;

import org.example.byname.dao.UserDao03;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl03 implements UserDao03 {
    @Override
    public void addUserDao() {
        System.out.println("Run UserDao Method...");
    }
}
