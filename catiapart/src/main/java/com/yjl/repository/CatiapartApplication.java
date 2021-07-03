package com.yjl.repository;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yjl.repository.mapper")
public class CatiapartApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatiapartApplication.class, args);
    }

}
