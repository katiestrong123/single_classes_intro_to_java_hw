import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

        Calculator calculator;

        @Before
        public void before(){
            calculator = new Calculator();
        }

        @Test
        public void canAdd(){
            assertEquals(10, calculator.add(7, 3));
        }

        @Test
        public void canSubtract(){
            assertEquals(4, calculator.subtract(7, 3));
        }

        @Test
        public void canMultiply(){
            assertEquals(21, calculator.multiply(7, 3));
        }

        @Test
        public void canDivide(){
            assertEquals(10, calculator.divide(70, 7));
        }

    }


