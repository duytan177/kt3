package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrayUtilsTest {

    // Test Case for Path 1: No values in range, expects -999
    @Test
    public void testNoValidNumbers() {
        int[] values = {-999};
        assertEquals(-999, ArrayUtils.average(values, 1, 10));
    }

    // Test Case for Path 2: Some values processed, but none within range
    @Test
    public void testValuesOutsideRange() {
        int[] values = {20, 30, 40, -999};
        assertEquals(-999, ArrayUtils.average(values, 1, 10));
    }

    // Test Case for Path 3: Valid values in range, calculates average
    @Test
    public void testValidNumbersInRange() {
        int[] values = {5, 7, 8, -999};
        assertEquals(6, ArrayUtils.average(values, 5, 10));
    }

    // Test Case for Path 4: Loop termination at 100th element
    @Test
    public void testLoopTerminationAtMaxInputNumber() {
        int[] values = new int[101];
        for (int i = 0; i < 100; i++) {
            values[i] = 5; // Within range
        }
        values[100] = -999;
        assertEquals(5, ArrayUtils.average(values, 1, 10));
    }
}
