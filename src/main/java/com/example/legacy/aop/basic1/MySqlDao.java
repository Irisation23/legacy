package com.example.legacy.aop.basic1;

public class MySqlDao implements Dao {

    @Override
    public void update() {
        System.out.println("MySqlDao.update");
    }

    @Override
    public void select() {
        System.out.println("MySqlDao.select");
    }
}
