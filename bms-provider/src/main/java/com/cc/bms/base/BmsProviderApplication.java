package com.cc.bms.base;

import com.cc.bms.base.config.db.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan("com.cc.bms")
@Import(DynamicDataSourceRegister.class)
public class BmsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmsProviderApplication.class);
    }
}
