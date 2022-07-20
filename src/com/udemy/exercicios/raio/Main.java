package com.udemy.exercicios.raio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;
        double raio = sc.nextDouble();
        double area = PI * Math.pow(raio, 2.0);
        Locale.setDefault(Locale.US);

        System.out.printf("A = %.4f%n", area);
    }
}
