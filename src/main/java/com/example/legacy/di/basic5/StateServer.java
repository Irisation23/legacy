package com.example.legacy.di.basic5;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class StateServer {

    private final String serverUrl;
    private final int port;
    private final String account;
    private final String password;
}
