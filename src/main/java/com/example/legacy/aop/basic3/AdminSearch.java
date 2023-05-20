package com.example.legacy.aop.basic3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AdminSearch implements Search {

    @CustomLogging
    @Override
    public void fileSearch() {//핵심코드
        System.out.println("fileSearch");
    }

    @CustomLogging
    @Override
    public void xmlParsing() {
        System.out.println("xmlParsing");
    }

    @CustomLogging
    @Override
    public void domSaxSerach() {
        System.out.println("domSaxSerach");
    }

    @Override
    public void testLogging() {
        log.error("hello test");
    }
}
