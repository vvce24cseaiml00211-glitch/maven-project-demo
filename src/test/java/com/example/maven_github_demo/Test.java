package com.example.maven_github_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradecalculatorTest {

    @Test
    void testTotal() {
        assertEquals(225, Gradecalculator.calculatorTotal(75, 68, 82));
    }

    @Test
    void testAverage() {
        assertEquals(75.0, Gradecalculator.calculatorAverage(75, 68, 82));
    }

    @Test
    void testPass() {
        assertTrue(Gradecalculator.isPass(75.0));
    }

    @Test
    void testFail() {
        assertFalse(Gradecalculator.isPass(35.0));
    }
}