package state;

import com.example.javaDesignPattern.state.*;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 15:15
 */
@SpringBootTest
public class StateTest {

    @Test
    public void test() {
        TrafficLight trafficLight = new TrafficLight();

        LightState redLightState = new RedLightState();
        LightState yellowLightState = new YellowLightState();
        LightState greenLightState = new GreenLightState();

        trafficLight.setState(redLightState);
        trafficLight.action();

        trafficLight.setState(yellowLightState);
        trafficLight.action();

        trafficLight.setState(greenLightState);
        trafficLight.action();
    }

}
