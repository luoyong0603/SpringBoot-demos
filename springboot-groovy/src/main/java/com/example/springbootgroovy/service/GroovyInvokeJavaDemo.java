package com.example.springbootgroovy.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/8 15:35
 */
@Service
@Slf4j
public class GroovyInvokeJavaDemo {

    public String groovyInvokeJava() {
        log.info("这是GroovyInvokeJavaDemo bean对象，groovy script invoke this method ...");
        return "这是GroovyInvokeJavaDemo bean对象，groovy script invoke this method ...";
    }

    public String groovyInvokeJavaParam(int a, int b) {
        log.info("这是GroovyInvokeJavaDemo bean对象，groovy script invoke this method ,param is a:{}, b:{}", a, b);
        return "这是GroovyInvokeJavaDemo bean对象，groovy script invoke this method , a:" + a + ", b:" + b;
    }
}