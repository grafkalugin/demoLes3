package com.example.demoles3.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NegativTest {

    @Tag("simple")
    @Test
    void testNeg1(){
        assertTrue(false);
    }

    @Tag("simple")
    @Test
    void testNeg2(){
        assertTrue(false);
    }

    @Tag("simple")
    @Test
    void testNeg3(){
        assertTrue(false);
    }
}
