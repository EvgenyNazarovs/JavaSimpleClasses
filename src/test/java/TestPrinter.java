import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 150);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void canPrint(){
        printer.print(20, 4);
        assertEquals(20, printer.getPaper());
        assertEquals(70, printer.getToner());
    }

    @Test
    public void printNotEnoughPaper(){
        printer.print(75, 4);
        assertEquals(100, printer.getPaper());
        assertEquals(150, printer.getToner());
    }

    @Test
    public void hasToner(){
        assertEquals(150, printer.getToner());
    }


}
