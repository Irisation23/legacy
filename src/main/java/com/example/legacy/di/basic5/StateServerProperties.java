package com.example.legacy.di.basic5;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "state-server")
@Getter
@Setter
@NoArgsConstructor
public class StateServerProperties {

    private String serverName;
    private int serverPort;
    private String username;
    private String password;
}
