package com.in28minutes.junit.helper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringHelperTest {
    // Given
    StringHelper helper = new StringHelper();

    // AACD => CD ACD => CD CDEF => CDEF CDAA =>CDAA
    @Test
    @DisplayName("Truncate A in first two positions")
    void testTruncateAInFirst2Positions_When_AInFirstTwoPositions() {
        // When and Assert
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    @DisplayName("Truncate A in first one position")
    void testTruncateAInFirst2Positions_When_AInFirstPosition() {
        // When and Assert
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }
}