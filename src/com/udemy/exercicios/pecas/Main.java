package com.udemy.exercicios.pecas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // solicitando o código das peças
        System.out.println("Insira o código da primeira peca: ");
        int codigoPeca1 = sc.nextInt();
        System.out.println("Insira o código da segunda peca: ");
        int codigoPeca2 = sc.nextInt();

        // solicitando a quantidade de cada peça
        System.out.println("Digite a quantidade da primeira peca: ");
        int quantPeca1 = sc.nextInt();
        System.out.println("Digite a quantidade da segunda peca: ");
        int quantPeca2 = sc.nextInt();

        // solicitando o valor unitário de cada peça
        System.out.println("Digite o valor unitário da primeira peca: ");
        double valorPeca1 = sc.nextDouble();
        System.out.println("Digite o valor unitário da segunda peca: ");
        double valorPeca2 = sc.nextDouble();

        double total = (quantPeca1 * valorPeca1) + (quantPeca2 * valorPeca2);

        System.out.printf("Valor total a pagar: R$ %.2f", total);

    }
}
