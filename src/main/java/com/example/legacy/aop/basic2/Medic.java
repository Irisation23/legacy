package com.example.legacy.aop.basic2;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class Medic implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        // TODO Auto-generated method stub
        Marine marine = (Marine) target;//target객체를 의미
        if (marine.getCommand() instanceof CommandAttack) {
            System.out.println("Medic이 병사를 치료한다");
        }
    }


}
