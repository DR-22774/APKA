package com.example.myproject;

import com.example.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Przykładowe użycie kalkulatora
        int result = calculator.add(5, 3);
        System.out.println("Wynik dodawania: " + result);
    }
}
