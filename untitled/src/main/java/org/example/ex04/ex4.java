package org.example.ex04;

//Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
//a)A idade atual dessa pessoa.
//b)Quantos anos ela terá em 2038

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idadeAtual = anoAtual - anoNascimento;
        int idade2038 = 2038 - anoNascimento;

        System.out.println("A idade atual é: " + idadeAtual);
        System.out.println("Em 2038, você terá: " + idade2038 + " anos.");

        scanner.close();
    }
}
