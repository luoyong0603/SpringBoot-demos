package com.example.springboothttp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients  //启用Feign客户端
@SpringBootApplication
@MapperScan({"com.example.springboothttp.dao"})// 扫描mybatis的映射器
public class SpringbootHttpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHttpApplication.class, args);
    }

}
