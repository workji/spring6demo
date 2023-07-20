package org.example.bytype02.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl02 implements UserDao02 {
    @Override
    public void addUserDao() {
        System.out.println("Run UserDao Method...");
    }
}
