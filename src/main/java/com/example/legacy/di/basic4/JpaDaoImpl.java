package com.example.legacy.di.basic4;

import org.springframework.stereotype.Component;

@Component
public class JpaDaoImpl implements UserDao {

    @Override
    public void selectAllUser() {
        System.out.println("JpaDaoImp selectAllUser");

    }

    @Override
    public void updateUser() {
        System.out.println("JpaDaoImp updateUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("JpaDaoImp deleteUser");
    }
}
