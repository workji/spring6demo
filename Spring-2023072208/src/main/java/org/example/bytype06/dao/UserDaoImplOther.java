package org.example.bytype06.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImplOther implements UserDao {
    @Override
    public void addUserDao() {
        System.out.println("Run UserDao Method...");
    }
}
