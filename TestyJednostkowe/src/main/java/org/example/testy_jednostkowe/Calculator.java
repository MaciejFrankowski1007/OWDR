package org.example.testy_jednostkowe;

public class Calculator {
    int add (int a, int b) {
        try {
            return Math.addExact(a,b);
        } catch (ArithmeticException e){
            throw new ArithmeticException("Przepełnienie: dodawanie " + a + " + " + b + " wykracza poza zakres typu int");
        }
    }

    int subtract (int a, int b){
        return Math.subtractExact(a, b);
    }

    int multiply (int a, int b){
        return Math.multiplyExact(a, b);
    }

    int div(int a, int b){
        return Math.floorDiv(a,b);
    }

}
