package com.example.legacy.aop.basic1;

import java.lang.reflect.Method;

public class AfterReturningAdviceV1 implements org.springframework.aop.AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Method returned: " + returnValue);
    }
}
