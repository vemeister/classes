package class1;

import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.*;

public class BasicsTest {

    @Test
    public void testGetExpressionRet() {
        assertEquals(10, Basics.getExpressionRet(2, 3, 10, 5));
        assertThrows(ArithmeticException.class, () -> Basics.getExpressionRet(2, 3, 10, 0));
    }

    @Test
    public void testIsWithinRange() {
        assertTrue(Basics.isWithinRange(5, 10));
        assertFalse(Basics.isWithinRange(20, 10));
    }

    @Test
    public void testIsPositive() {
        assertTrue(Basics.isPositive(10));
        assertFalse(Basics.isPositive(-1));
    }

    @Test
    public void testIsNetagive() {
        assertTrue(Basics.isNegative(-100));
        assertFalse(Basics.isNegative(500));
    }

    @Test
    public void testPrintToConsole() {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);
        PrintStream stdout = System.out;
        System.setOut(printStream);
        Basics.printToConsole("Mark");
        System.out.flush();
        System.setOut(stdout);
        assertEquals(outStream.toString().replace("\n", ""), "Привет, Mark!");
    }

    @Test
    public void testIsLeapYear() {
        assertFalse(Basics.isLeapYear(2019));
        assertTrue(Basics.isLeapYear(1824));
    }

    @Test
    public void testGetMoon() {
        assertFalse(Basics.getMoon().isLivable);
        assertEquals(Basics.getMoon().name, "Moon");
        assertEquals(Basics.getMoon().orbitalPeriod, 27.321661);
    }
}