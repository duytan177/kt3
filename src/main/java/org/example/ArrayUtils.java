package org.example;

public class ArrayUtils {
    public static int average(int[] value, int minimum, int maximum) {
        int i = 0;
        int inputNumber = 0;
        int validNumber = 0;
        int sum = 0;

        while ((value[i] != -999) && (inputNumber < 100)) {
            inputNumber++;
            if ((value[i] >= minimum) && (value[i] <= maximum)) {
                validNumber++;
                sum += value[i];
            }
            i++;
        }

        if (validNumber > 0) {
            return sum / validNumber;
        } else {
            return -999;
        }
    }
}

