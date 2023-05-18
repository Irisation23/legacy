package com.example.legacy.aop.basic1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DaoMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new GenericXmlApplicationContext("aopBasic1.xml");

        Dao oracleDao = applicationContext.getBean("oracleDao", Dao.class);
        oracleDao.select();

        Dao mySqlDao = applicationContext.getBean("mySqlDao", Dao.class);
        mySqlDao.select();
    }
}
