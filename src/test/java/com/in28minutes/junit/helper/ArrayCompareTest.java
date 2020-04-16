package com.in28minutes.junit.helper;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ArrayCompareTest {

    @Test
    void testArraySort_RandomArray()
    {
        // Given
        int[] number = {12,1,5,2,7};

        // When
        Arrays.sort(number);

        // Assert
        int[] expected = {1,2,5,7,12};
        assertArrayEquals(expected,number);
        // array contents differ at index [1],
        // expected: <5> but was: <2>

    }
}
