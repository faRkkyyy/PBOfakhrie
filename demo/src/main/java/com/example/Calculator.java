package com.example;

public class Calculator {
    // Metode untuk penjumlahan
    public int add(int a, int b) {
        return a + b;
    }

    // Metode untuk pengurangan
    public int subtract(int a, int b) {
        return a - b;
    }

    // Metode untuk perkalian
    public int multiply(int a, int b) {
        return a * b;
    }

    // Metode untuk pembagian
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh nol");
        }
        return a / b;
    }
}