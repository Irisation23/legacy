package com.example.legacy.di.basic4;

import javax.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdminUserServiceImpl implements UserService {

    @Resource(name = "myBatisDao")
    private final UserDao myBatisDao;

    @Override
    public void register() {
        myBatisDao.selectAllUser();
    }

    @Override
    public void findUser() {

    }
}
