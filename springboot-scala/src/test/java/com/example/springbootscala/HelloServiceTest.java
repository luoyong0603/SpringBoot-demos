package com.example.springbootscala;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/7 18:05
 */

import com.example.springbootscala.controller.HelloService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void testSayHello() {
        String result = helloService.sayHello();
        assertEquals("Hello, Scala!", result);
    }
}

