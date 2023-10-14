package com.example.javase;

import com.example.javase.se.day02.HelloWorld;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/8 17:18
 */
public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World!", helloWorld.getHelloWorld());
    }
}
