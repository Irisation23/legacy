package com.example.legacy.aop.basic1;

public class OracleDao implements Dao {

    @Override
    public void update() {
        System.out.println("OracleDao.update");
    }

    @Override
    public void select() {
        System.out.println("OracleDao.select");
    }
}
