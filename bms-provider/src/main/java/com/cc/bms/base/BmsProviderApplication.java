package com.cc.bms.base;

import com.cc.bms.base.config.db.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan("com.cc.bms")
@MapperScan("com.cc.bms.*.dao")
@Import(DynamicDataSourceRegister.class)
public class BmsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmsProviderApplication.class);
    }
}
