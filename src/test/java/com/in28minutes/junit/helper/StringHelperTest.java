package com.in28minutes.junit.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {
    // AACD => CD ACD => CD CDEF => CDEF CDAA =>CDAA
    @Test
    void test()
    {
        // Given
        StringHelper helper = new StringHelper();
        // When and Assert
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }
}