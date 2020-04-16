package com.in28minutes.junit.helper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickBeforeAfterTest {

    @BeforeEach
    void setUp()
    {
        System.out.println("\nBefore execute each test function");
    }

    @AfterEach
    void cleanUp()
    {
        System.out.println("After execute each test function");
    }


    @Test
    void test1()
    {
        System.out.println("execute test 1");
    }

    @Test
    void test2()
    {
        System.out.println("execute test 2");
    }
}