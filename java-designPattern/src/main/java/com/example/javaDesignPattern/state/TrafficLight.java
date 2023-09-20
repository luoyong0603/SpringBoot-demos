package com.example.javaDesignPattern.state;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 15:11
 */
public class TrafficLight {
    private LightState state;

    public void setState(LightState state) {
        this.state = state;
    }

    public void action(){
        state.action();
    }
}
