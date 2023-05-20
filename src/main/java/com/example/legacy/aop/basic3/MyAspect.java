package com.example.legacy.aop.basic3;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
@Slf4j
public class MyAspect {

    @Before("execution(public void com.example.legacy.aop.basic3.Search*.*(..) )")
    public void dataAttributeSearch(JoinPoint jp) {//Before
        Signature signature = jp.getSignature();
        System.out.println("@BeforeAdvice");
        /*
         * String methodName=(signature.getName()); Date date=new Date();
         * System.out.println(date); if(methodName.equals("fileSearch")) {
         * System.out.println("fileSearch Before"); }
         * if(methodName.equals("xmlParsing")) {
         * System.out.println("xmlParsing Before"); }
         * if(methodName.equals("domSaxSerach")) {
         * System.out.println("domSaxSerach Before"); }
         */
    }
//
//    @After("execution(public void com.example.legacy.aop.basic3.Search*.*(..) )")
//    public void afterSearchAdvice(JoinPoint jp) {//Before
//        Signature signature = jp.getSignature();
//        System.out.println("@AfterAdvice");
//    }
//
//    @AfterReturning("execution(public void com.example.legacy.aop.basic3.Search*.*(..) )")
//    public void afterReturningSearchAdvice(JoinPoint jp) {//Before
//        Signature signature = jp.getSignature();
//        System.out.println("@AfterReturning");
//    }
//
//    @AfterThrowing("execution(public void com.example.legacy.aop.basic3.Search*.*(..) )")
//    public void AfterThrowingSearchAdvice(JoinPoint jp) {//Before
//        Signature signature = jp.getSignature();
//        System.out.println("@@AfterThrowing");
//    }

    @Around("@annotation(CustomLogging)")
    public Object testLogging(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = pjp.proceed();
        log.error(pjp.getKind());
        log.error(String.valueOf(System.currentTimeMillis() - start));
        return proceed;
    }
}




