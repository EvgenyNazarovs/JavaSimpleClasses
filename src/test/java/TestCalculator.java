import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canSum(){
        assertEquals(21, calculator.sum(7, 14));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calculator.subtract(14, 9));
    }

    @Test
    public void canMultiply(){
        assertEquals(77, calculator.multiply(7, 11));
    }

    @Test
    public void canDivide(){
        assertEquals(25.0, calculator.divide(100, 4), 0.0);
    }


}
