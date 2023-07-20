package org.example.bytype04.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao04Impl implements UserDao04 {
    @Override
    public void addUserDao() {
        System.out.println("Run UserDao Method...");
    }
}
