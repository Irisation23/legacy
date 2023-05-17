package com.example.legacy.di.basic4;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class ClientUserServiceImpl implements UserService {

    @Resource(name = "jdbcDaoImpl")
    private UserDao jdbcDao;

    @Override
    public void register() {
        jdbcDao.selectAllUser();
    }

    @Override
    public void findUser() {

    }
}
