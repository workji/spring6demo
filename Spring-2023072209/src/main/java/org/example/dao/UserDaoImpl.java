package org.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUserDao() {
        System.out.println("Run UserDao Method...");
    }
}
