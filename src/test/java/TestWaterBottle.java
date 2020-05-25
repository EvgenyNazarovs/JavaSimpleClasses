import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){ assertEquals(100, waterBottle.getVolume()); }

    @Test
    public void canDrink(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void canFill(){
        waterBottle.empty();
        assertEquals(100, waterBottle.fill());
    }
}
