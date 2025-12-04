package com.exemple;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculatrice;

    @BeforeEach
    void preparer() {
        calculatrice = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(5, calculatrice.addition(2, 3));
        assertEquals(0, calculatrice.addition(-1, 1));
    }

    @Test
    void testSoustraction() {
        assertEquals(2, calculatrice.soustraction(5, 3));
        assertEquals(-2, calculatrice.soustraction(3, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculatrice.multiplication(2, 3));
        assertEquals(0, calculatrice.multiplication(5, 0));
    }

    @Test
    void testDivision() {
        assertEquals(2.5, calculatrice.division(5, 2), 0.001);
        assertEquals(3.0, calculatrice.division(9, 3), 0.001);
    }

    @Test
    void testDivisionParZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculatrice.division(10, 0);
        });
        assertEquals("Division par zéro impossible", exception.getMessage());
    }
}