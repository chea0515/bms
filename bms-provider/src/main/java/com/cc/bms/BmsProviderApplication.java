package com.cc.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Import(DynamicDataSourceRegister.class)
public class BmsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmsProviderApplication.class);
    }
}
