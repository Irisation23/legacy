package com.example.legacy.aop.basic2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UnitMain {

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("aopBasic2.xml");
        Unit unit = (Unit) context.getBean("marine");
        unit.doCommand();
    }

}
