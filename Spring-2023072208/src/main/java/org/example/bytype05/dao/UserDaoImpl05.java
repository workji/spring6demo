package org.example.bytype05.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl05 implements UserDao05 {
    @Override
    public void addUserDao() {
        System.out.println("Run UserDao Method...");
    }
}
