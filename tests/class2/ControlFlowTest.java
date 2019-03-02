package class2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ControlFlowTest {

    @Test
    public void testSwitchBinaryValues() {

        int[] zerosAndOnes = {1, 1, 0, 0, 1, 0, 1, 0};
        ControlFlow.switchBinaryValues(zerosAndOnes);
        assertEquals(new int[]{0, 0, 1, 1, 0, 1, 0, 1}, zerosAndOnes);
    }

    @Test
    public void testGetItemsMultpleOfThree() {
        assertEquals(new int[]{0, 3, 6, 9, 12, 15, 18, 21}, ControlFlow.getItemsMultpleOfThree());
    }

    @Test
    public void testCreateIdentityMatrix() {
        assertEquals(new int [][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}},
                ControlFlow.createIdentityMatrix(3, 3));
    }

    @Test
    public void testDoubleItemsLessThanSix() {
        int [] items = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        assertEquals(new int []{2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2},
                ControlFlow.doubleItemsLessThanSix(items));
    }

    @Test
    public void testGetMinAndMax() {
        int [] items = {1, -5, 300, 2, 11, 4, 5, 2, 4, 8, 9, 100500};
        assertEquals(new int[]{-5, 100500}, ControlFlow.getMinAndMax(items));
    }
}