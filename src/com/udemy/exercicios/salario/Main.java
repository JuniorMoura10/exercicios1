package com.udemy.exercicios.salario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero do funcionario: ");
        int numeroFuncionario = sc.nextInt();

        System.out.println("Entre com o numero de horas: ");
        int horas = sc.nextInt();

        System.out.println("Entre com o valor da hora trabalhada: ");
        double valorHora = sc.nextDouble();

        double salario = horas * valorHora;

        System.out.println("Funcionario: " + numeroFuncionario);
        System.out.printf("Salario: R$ %.2f", salario);
    }
}
