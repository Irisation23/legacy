package com.example.legacy.aop.custom.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class GreeterAspect {

    @Around("@annotation(TimeCheck)")
    public Object greeterTest(ProceedingJoinPoint pjp) throws Throwable {
        Object proceed;
        StopWatch stopWatch = new StopWatch();
        try {
            stopWatch.start();
            proceed = pjp.proceed();
        } finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        }

        return proceed;
    }
}
