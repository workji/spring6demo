package org.example.bytype01.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao01Impl implements UserDao01 {
    @Override
    public void addUserDao() {
        System.out.println("Run UserDao Method...");
    }
}
