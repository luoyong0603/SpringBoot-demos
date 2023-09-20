package com.example.javaDesignPattern.state;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 15:11
 */
public class RedLightState extends LightState{
    @Override
    void action() {
        System.out.println("红灯停");
    }
}
