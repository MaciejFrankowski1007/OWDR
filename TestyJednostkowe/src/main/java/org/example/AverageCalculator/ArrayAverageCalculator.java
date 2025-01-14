package org.example.AverageCalculator;

public class ArrayAverageCalculator {

    public static double calculateAverage(int[] array){
        if (array == null || array.length == 0){
            return 0;
        }
        long sum = 0;
        for (int num : array){
            sum += num;
        }
        return (double) sum / array.length; //Konwersja na double przed dzieleniem, aby zapewnić dokładność
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5}; //Oczekiwana średnia to 3.0
        int[] array2 = {}; // Oczekiwana wartość to 0
        int[] array3 = {-1, -2, -3, -4, -5}; //Oczekiwana średnia -3
        int[] array4 = {100000, 200000, 300000};// Testowanie dużych liczb

        System.out.println("Średnia z tablicy numer 1: " + calculateAverage(array1));
        System.out.println("Średnia z tablicy numer 2: " + calculateAverage(array2));
        System.out.println("Średnia z tablicy numer 3: " + calculateAverage(array3));
        System.out.println("Średnia z tablicy numer 4: " + calculateAverage(array4));
    }
}
