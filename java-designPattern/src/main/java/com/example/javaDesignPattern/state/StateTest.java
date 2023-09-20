package com.example.javaDesignPattern.state;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 15:11
 */
public class StateTest {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        LightState redLightState = new RedLightState();
        LightState yellowLightState = new YellowLightState();
        LightState greenLightState = new GreenLightState();

        trafficLight.setState(redLightState);
        trafficLight.action();//红灯停

        trafficLight.setState(yellowLightState);
        trafficLight.action();//黄灯亮

        trafficLight.setState(greenLightState);
        trafficLight.action();//绿灯行
    }
}
