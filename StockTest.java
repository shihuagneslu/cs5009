package Stock;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * this is the test class that tests the class Stock.
 */
public class StockTest {
    private Stock Apple;

    /**
     * set the example case.
     */
    @Before
    public void setUp() {
        Apple = new Stock("APPL", "AppleSV", 158.9);
    }

    /**
     * test the method getSymbol().
     */
    @org.junit.Test
    public void getSymbol_test() {
        assertEquals("APPL", Apple.getSymbol());
    }

    /**
     * test the method getName().
     */
    @org.junit.Test
    public void getName_test() {
        assertEquals("AppleSV", Apple.getName());
    }
}