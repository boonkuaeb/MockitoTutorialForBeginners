package com.in28minutes.junit.helper;

import org.junit.jupiter.api.*;

class QuickBeforeAfterTest {

    @BeforeAll
    static void beforeAll()
    {
        System.out.println("\n===============================");
        System.out.println("Before All");
        System.out.println("===============================");
    }
    @AfterAll
    static void afterAll()
    {
        System.out.println("\n===============================");
        System.out.println("After All");
        System.out.println("===============================");
    }

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