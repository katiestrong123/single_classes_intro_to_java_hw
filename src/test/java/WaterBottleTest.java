import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100, 10);
    }

    @Test
    public void testStartsAt100(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void testDrink(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void testThurssty(){
        assertEquals(0, waterBottle.thurssty());
    }

    @Test
    public void testRefill(){
        assertEquals(100, waterBottle.refill());
    }

}
