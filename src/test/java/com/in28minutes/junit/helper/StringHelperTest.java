package com.in28minutes.junit.helper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    @DisplayName("Truncate replaced A when length Less or equals two")
    void testTruncateAInFirst2Positions_When_LenLessOrEqualThanTwo() {
        // When and Assert
        assertEquals("C", helper.truncateAInFirst2Positions("AC"));
    }

    @Test
    @DisplayName("Truncate throws NullPointerException when input is null")
    void testTruncateAInFirst2Positions_When_Null() {
        // When and Assert
        assertThrows(NullPointerException.class,
                () -> helper.truncateAInFirst2Positions(null)
        );
    }

    @Test
    @DisplayName("First two char and Last two char are same")
    void testAreFirstAndLastTwoCharactersTheSame_When_BasicPositiveScenario() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    @DisplayName("First two char and Last two char are not same")
    void testAreFirstAndLastTwoCharactersTheSame_When_BasicNegativeScenario() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABAC"));
    }

    @Test
    @DisplayName("Input 2 character ")
    void testAreFirstAndLastTwoCharactersTheSame_When_TwoCharacters() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    @ParameterizedTest
    @DisplayName("Input only 1 character should be False")
    @ValueSource(strings = {"A", ""})
    void testAreFirstAndLastTwoCharactersTheSame_When_OneCharacters(String str) {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame(str));
    }

    @Test
    @DisplayName("Input is null ")
    void testAreFirstAndLastTwoCharactersTheSame_When_Null() {
        assertThrows(NullPointerException.class,
                () -> helper.areFirstAndLastTwoCharactersTheSame(null)
        );
    }
}