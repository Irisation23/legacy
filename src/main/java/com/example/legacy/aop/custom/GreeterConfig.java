package com.example.legacy.aop.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.example.legacy.aop.custom")
public class GreeterConfig {

    @Bean
    public Greeter englishGreeter() {
        return new EnglishGreeter();
    }

    @Bean
    public Greeter koreanGreeter() {
        return new KoreanGreeter();
    }
}
