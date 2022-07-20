package com.udemy.exercicios.areas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado A: ");
        double A = sc.nextDouble();
        System.out.println("Digite o lado B: ");
        double B = sc.nextDouble();
        System.out.println("Digite o lado C: ");
        double C = sc.nextDouble();

        final double PI = 3.14159;

        double areaTriangulo = (A * C)/2;
        double areaCirculo = PI * Math.pow(C, 2);
        double areaTrapezio = ((A + B)/2) * C;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    }
}
