package com.cc.bms.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cc.bms")
public class BmsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmsWebApplication.class);
    }
}
