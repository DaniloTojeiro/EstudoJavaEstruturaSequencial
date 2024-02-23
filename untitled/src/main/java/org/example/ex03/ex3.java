package org.example.ex03;

//Faça um algoritmo que receba o salário-base de um funcionário,
//calcule e mostre o salário a receber, sabendo que esse funcionário
//tem gratificação de 5% sobre o salário-base e paga imposto de 7% sobre o total.

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário: ");
        double salarioBase = scanner.nextDouble();

        double gratificacao = salarioBase * 0.05;
        double salarioTotal = salarioBase + gratificacao;
        double imposto = salarioTotal * 0.07;
        double salarioReceber = salarioTotal - imposto;

        System.out.println("O salário a receber é: " + salarioReceber);

        scanner.close();
    }
}
