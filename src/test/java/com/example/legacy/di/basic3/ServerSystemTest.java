package com.example.legacy.di.basic3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class ServerSystemTest {

    private ServerSystem testedServerSystem;

    @BeforeEach
    void before() {
        DbmsSystem testedDbmsSystem = DbmsSystem.builder()
                                                .serverName("10")
                                                .serverPort(10)
                                                .serverUrl("10")
                                                .connectionCount(10)
                                                .build();

        testedServerSystem = new ServerSystem(testedDbmsSystem);
    }

    @Test
    @DisplayName("ServerSystem 에 등록된 DbmsSystem 필드 빈 객체의 값 체크")
    void checkServerSystemField() {
        ApplicationContext applicationContext = new GenericXmlApplicationContext("basic3.xml");
        DbmsSystem dss = (DbmsSystem) applicationContext.getBean("dss");

        DbmsSystem dbmsSystem = testedServerSystem.getDbmsSystem();

        Assertions.assertThat(dss.getServerName()).isEqualTo(dbmsSystem.getServerName());
    }
}