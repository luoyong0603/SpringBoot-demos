package com.example.javase;

import com.example.javase.rabbitEatMoonCake.MainFrame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author bug菌
 * @Date 2023-09-13 21:40
 */
@SpringBootApplication
public class JavaSeApplication {

    public static void main(String[] args) {
        //月兔吃饼游戏启动
        new MainFrame();

        SpringApplication.run(JavaSeApplication.class, args);
    }

}
