package org.example.testy_jednostkowe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddPositiveNumber(){
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAddNegativeNumbers(){
        assertEquals(-5, calculator.add(-2,-3));
    }

    @Test
    public void testAddZeroAndPositiveNumbers(){
        assertEquals(3, calculator.add(0,3));
    }

    @Test
    public void testAddPositiveToNegativeNumbers(){
        assertEquals(2, calculator.add(-11, 13));
    }

    @Test
    public void testMultiplyNumbers(){
        assertEquals(25, calculator.multiply(5,5));
    }

    @Test
    public void testSubtractNumbers(){
        assertEquals(0, calculator.subtract(5,5));
    }

    @Test
    public void testDivNUmbers(){
        assertEquals(4, calculator.div(24,6));
    }

    @Test
    public void testMultiplyByZere(){
        assertEquals(0, calculator.multiply(5,0));
    }

    @Test
    public void testTwoNegativeNumbers(){
        assertEquals(4,calculator.multiply(-2,-2));
    }

}
