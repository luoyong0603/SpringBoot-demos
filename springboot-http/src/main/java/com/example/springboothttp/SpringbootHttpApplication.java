package com.example.springboothttp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.example.springboothttp.dao"})// 扫描mybatis的映射器
public class SpringbootHttpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHttpApplication.class, args);
    }

}
