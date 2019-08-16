package com.gpmall.admin.bootstrap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.gpmall.admin")
@MapperScan("com.gpmall.admin.dal")
public class AdminProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminProviderApplication.class, args);
    }
}
