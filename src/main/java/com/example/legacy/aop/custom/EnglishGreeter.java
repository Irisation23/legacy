package com.example.legacy.aop.custom;

import com.example.legacy.aop.custom.aop.TimeCheck;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class EnglishGreeter implements Greeter {

    @Override
    @TimeCheck
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
