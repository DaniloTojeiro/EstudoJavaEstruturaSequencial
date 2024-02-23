package org.example.ex02;

//Ler uma medida em polegadas e imprimir a equivalente em centímetros,
//sabendo que 2.54cm equivale a 1 polegada.

import java.util.Scanner;

public class ex2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a medida em polegadas: ");

        double polegadas = scanner.nextDouble();
        double centimetros = polegadas * 2.54;

        System.out.println(polegadas +" polegadas equivalem a " + centimetros + " cm");
    }
}
