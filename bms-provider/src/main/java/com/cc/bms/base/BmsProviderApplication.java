package com.cc.bms.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cc.bms")
public class BmsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmsProviderApplication.class);
    }
}
