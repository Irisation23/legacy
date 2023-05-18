package com.example.legacy.aop.basic1;

public class AfterAdvice implements org.springframework.aop.AfterAdvice {

    public void afterMethod() {
        System.out.println("AfterAdvice.afterMethod");
    }
}
