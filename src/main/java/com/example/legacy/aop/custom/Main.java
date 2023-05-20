package com.example.legacy.aop.custom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(GreeterConfig.class);

        Greeter englishGreeter = applicationContext.getBean("englishGreeter", Greeter.class);
        englishGreeter.sayHello();

        Greeter greeter = applicationContext.getBean("koreanGreeter", Greeter.class);
        greeter.sayHello();
    }
}
