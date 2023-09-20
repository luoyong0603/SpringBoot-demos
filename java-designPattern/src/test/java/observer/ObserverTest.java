package observer;

import com.example.javaDesignPattern.observer.OrderObserver;
import com.example.javaDesignPattern.observer.OrderSubject;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 14:57
 */
@SpringBootTest
public class ObserverTest {

    @Test
    public void testObserver() {
        OrderSubject orderSubject = new OrderSubject();
        OrderObserver orderObserver1 = new OrderObserver();
        OrderObserver orderObserver2 = new OrderObserver();
        orderSubject.attach(orderObserver1);
        orderSubject.attach(orderObserver2);

        orderSubject.setState(1);
        assertEquals(orderObserver1.getState(), 1);
        assertEquals(orderObserver2.getState(), 1);

        orderSubject.detach(orderObserver1);
        orderSubject.setState(0);
        assertEquals(orderObserver1.getState(), 1);
        assertEquals(orderObserver2.getState(), 0);
    }
}
