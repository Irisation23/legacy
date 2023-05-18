package com.example.legacy.di.basic5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigDemoMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigDemo.class);
        StateServer stateServer = applicationContext.getBean("stateServer", StateServer.class);

        System.out.println("stateServer.getServerUrl() = " + stateServer.getServerUrl());
        System.out.println("stateServer.getAccount() = " + stateServer.getAccount());
        System.out.println("stateServer.getPort() = " + stateServer.getPort());

        System.out.println(applicationContext.getBean("stateServer", StateServer.class));
    }
}
