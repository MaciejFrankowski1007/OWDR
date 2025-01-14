package org.example.testy_jednostkowe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoseCalculatorTest {

    DoseCalculator doseCalculator = new DoseCalculator();

    @Test
    public void testCalculateYoungDoseStandardCase(){
        assertEquals(60.0,doseCalculator.calculateYoungDose(200,6),0.01);
    }

    @Test
    public void testCalculateYoungDoseZeroAge(){
        assertEquals(0.0, doseCalculator.calculateYoungDose(200,0),0.01);
    }

    @Test
    public void testCalculateYoungDoseAdultAge(){
        assertEquals(200.0, doseCalculator.calculateYoungDose(200, 18), 0.01);    }

    @Test
    public void testCalculateClarksRule(){
        assertEquals(1.47,doseCalculator.calculateClarksRule(100.0,10),0.01);
        assertEquals(50.0,doseCalculator.calculateClarksRule(340.0, 68.0), 0.01);
    }

    @Test
    public void testCalculateFriedsRule(){
        assertEquals(2.0, doseCalculator.calculateFriedsRure(100.0, 3), 0.01);
        assertEquals(10.0, doseCalculator.calculateFriedsRure(100.0, 15), 0.01);
    }

}