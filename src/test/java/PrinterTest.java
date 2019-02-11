import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 100);
    }

    @Test
    public void hasSheets(){
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canPrint(){
        assertEquals("Print complete", printer.print(15, 2));
        assertEquals(20, printer.getSheets());
        assertEquals(70, printer.getToner());
    }

    @Test
    public void cannotPrint(){
        assertEquals("Cannot print.", printer.print(100, 6));
        assertEquals(50, printer.getSheets());
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canRefillPaper(){
        printer.refillPaper(25);
        assertEquals(75, printer.getSheets());
    }


}
