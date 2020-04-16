package com.in28minutes.junit.helper;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayCompareTest {

    @Test
    void testArraySort_RandomArray() {
        // Given
        int[] number = {12, 1, 5, 2, 7};

        // When
        Arrays.sort(number);

        // Assert
        int[] expected = {1, 2, 5, 7, 12};
        assertArrayEquals(expected, number);
        // array contents differ at index [1],
        // expected: <5> but was: <2>

    }

    @Test
    void testArraySort_NullArray5() {
        // Given
        int[] number = null;
        // When
        assertThrows(NullPointerException.class,
                () -> Arrays.sort(number)
        );
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void testArraySort_NullArray4() {
        // Given
        int[] number = null;
        Arrays.sort(number);
    }

    @org.junit.Test(timeout = 100) // milliseconds
    public void testArraySort_Performance4() {
        int[] array = {12, 1, 5, 2, 7};
        ;
        for (int i = 0; i <= 1000000; i++) {
            array[0] = i;
            Arrays.sort(array);
        }
    }

    //    @Test
    @RepeatedTest(10)
    void testArraySort_Performance5() {
        assertTimeout(Duration.ofMillis(30),
                () -> {
                    int[] array = {12, 1, 5, 2, 7};
                    for (int i = 0; i <= 1000000; i++) {
                        array[0] = i;
                        Arrays.sort(array);
                    }
                }
        );
    }


}