package com.example.legacy.aop.custom.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.METHOD) // 메서드를 target으로 잡음
@Retention(RetentionPolicy.CLASS) // 이 어노테이션 정보를 얼마나 유지할 것인지 (즉 이 경우, .class 파일까지 유지하겠다는 뜻)
public @interface TimeCheck {

}
