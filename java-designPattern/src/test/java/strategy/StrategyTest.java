package strategy;

import com.example.javaDesignPattern.strategy.Context;
import com.example.javaDesignPattern.strategy.OperationAdd;
import com.example.javaDesignPattern.strategy.OperationSubtract;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 15:35
 */
@SpringBootTest
public class StrategyTest {

    @Test
    public void testAdd() {
        Context context = new Context(new OperationAdd());
        assertEquals(context.executeStrategy(10, 5), 15);
    }

    @Test
    public void testSubtract() {
        Context context = new Context(new OperationSubtract());
        assertEquals(context.executeStrategy(10, 5), 5);
    }
}
