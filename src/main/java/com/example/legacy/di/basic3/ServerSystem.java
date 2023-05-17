package com.example.legacy.di.basic3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Component
public class ServerSystem {

    private DbmsSystem dbmsSystem;
}
