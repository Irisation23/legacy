package com.example.legacy.di.basic5;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StateServerProperties.class)
public class ConfigDemo {

    @Bean
    public StateServer stateServer(StateServerProperties properties) {
        return new StateServer(properties.getServerName(), properties.getServerPort(), properties.getUsername(),
            properties.getPassword());
    }


    @Bean
    public DmlServer dmlServer() {
        return new DmlServer(new StateServer("211.90.0.1:88:oracle", 8888, "bit", "bit1234"));
    }
}
