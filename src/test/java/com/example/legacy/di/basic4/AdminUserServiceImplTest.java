package com.example.legacy.di.basic4;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class AdminUserServiceImplTest {

    private UserDao myBatisDao;
    private UserDao jdbcDao;
    private UserDao jpaDao;

    @BeforeEach
    void init() {
        ApplicationContext applicationContext = new GenericXmlApplicationContext("basic4.xml");
        myBatisDao = applicationContext.getBean("myBatisDao", UserDao.class);
        jdbcDao = applicationContext.getBean("jdbcDaoImpl", UserDao.class);
        jpaDao = applicationContext.getBean("jpaDaoImpl", UserDao.class);
    }

    @Test
    void checkMyBatisDao() {
        assertThat(myBatisDao).isInstanceOf(MyBatisDaoImpl.class);
    }

    @Test
    void checkJdbcDao() {
        assertThat(jdbcDao).isInstanceOf(JdbcDaoImpl.class);
    }

    @Test
    void checkJpaDao() {
        assertThat(jpaDao).isInstanceOf(JpaDaoImpl.class);
    }
}