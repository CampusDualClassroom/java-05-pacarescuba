package com.campusdual.classroom;

public class Exercise05 {
    public static void main(String[] args) {

    }

    public static void checkLessOrGreaterEqual(int n1, int n2) {
        if (n1 < n2) {
            System.out.println("X es menor que Y");
        }
        else {
            System.out.println("X es mayor o igual que Y");
        }
    }

    public static void checkMultiply(int n1, int n2) {
        if (Math.floor((double)n1 / (double)n2) == (double)n1 / (double)n2) {
            System.out.println("X es múltiplo de Y");
        }
        else {
            System.out.println("X no es múltiplo de Y");
        }
    }

    public static void checkPositiveNegative(int num) {
        if (num == Math.abs(num)) {
            System.out.println("X es positivo.");
        }
        else {
            System.out.println("X es negativo.");
        }
    }
}
