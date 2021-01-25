import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(10);
    }

    @Test
    public void testHasPaper(){
        assertEquals(10, printer.hasPaper());
    }

    @Test
    public void testPrint(){
        assertEquals("Printing...", printer.print(3));
    }

}
