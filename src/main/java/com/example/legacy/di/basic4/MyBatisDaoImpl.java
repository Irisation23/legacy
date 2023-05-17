package com.example.legacy.di.basic4;

import org.springframework.stereotype.Component;

@Component(value = "myBatisDao")
public class MyBatisDaoImpl implements UserDao {

    @Override
    public void selectAllUser() {
        System.out.println("MyBatisDaoImpl.selectAllUser");
    }

    @Override
    public void updateUser() {
        System.out.println("MyBatisDaoImpl.updateUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("MyBatisDaoImpl.deleteUser");
    }
}
