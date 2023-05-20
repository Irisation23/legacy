package com.example.legacy.aop.basic3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SearchMain {

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("aopBasic3.xml");
        Search search = (Search) context.getBean("adminSearch");
        search.domSaxSerach();
        search.fileSearch();
        search.xmlParsing();
        search.testLogging();
    }

}
