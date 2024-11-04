package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrayUtilsTest {

    // Test Case 1: Array contains only the sentinel value, expects -999
    @Test
    public void testNoValuesInArray() {
        int[] values = {-999};
        assertEquals("Expected result when array contains only -999", -999, ArrayUtils.average(values, 1, 10));
    }

    // Test Case 2: Array contains values outside the specified range, expects -999
    @Test
    public void testValuesAllOutsideRange() {
        int[] values = {20, 30, 40, -999};
        assertEquals("Expected result when all values are outside range [1, 10]", -999, ArrayUtils.average(values, 1, 10));
    }

    // Test Case 3: Array contains valid values within range, calculates average
    @Test
    public void testValuesWithinRange() {
        int[] values = {5, 7, 8, -999};
        assertEquals("Expected average of values within range [5, 10]", 6, ArrayUtils.average(values, 5, 10));
    }

    // Test Case 4: Array contains exactly 100 valid values, tests loop termination
    @Test
    public void testLoopTerminationAt100Elements() {
        int[] values = new int[101];
        for (int i = 0; i < 100; i++) {
            values[i] = 5; 
        }
        values[100] = -999;
        assertEquals("Expected average when processing first 100 elements", 5, ArrayUtils.average(values, 1, 10));
    }
}
