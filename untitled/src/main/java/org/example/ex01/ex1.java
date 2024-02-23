package org.example.ex01;

//Fazer um algoritmo que leia um número inteiro e escreva o seu antecessor e o se sucessor.

import java.util.Scanner;
public class ex1 {
   public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        int numero = scanner.nextInt();
        int antecessor = numero - 1;

        System.out.println("O número antecessor a " + numero + " é " + antecessor);

        scanner.close();
    }
}
