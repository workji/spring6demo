package org.example.bytype06.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "myUserDaoImpl01")
public class UserDaoImpl implements UserDao {
    @Override
    public void addUserDao() {
        System.out.println("Run UserDao Method...");
    }
}
