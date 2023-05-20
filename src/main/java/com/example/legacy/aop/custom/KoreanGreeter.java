package com.example.legacy.aop.custom;

import com.example.legacy.aop.custom.aop.TimeCheck;
import org.springframework.stereotype.Component;

@Component
public class KoreanGreeter implements Greeter {

    @TimeCheck
    @Override
    public void sayHello() {
        // biz logic
        System.out.println("안녕 세상! ");
    }
}
