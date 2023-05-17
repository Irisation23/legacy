package com.example.legacy.di.basic3;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@RequiredArgsConstructor
public class DbmsSystem {

    private final String serverName;
    private final int serverPort;
    private final String serverUrl;
    private final int connectionCount;
}
