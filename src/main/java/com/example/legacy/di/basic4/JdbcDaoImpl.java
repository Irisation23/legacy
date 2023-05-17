package com.example.legacy.di.basic4;

import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImpl implements UserDao {

    @Override
    public void selectAllUser() {
        System.out.println("JdbcDaoImp selectAllUser");
    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }
}