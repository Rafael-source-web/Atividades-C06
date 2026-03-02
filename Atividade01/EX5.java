package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com a número de alunos de C06: ");
        int alunos = teclado.nextInt();

        switch (alunos){
            case 10:

            case 20:
                System.out.println("A sala usada será I-6!");
                break;

            case 30:
                System.out.println("A sala usada será I-5!");
                break;

            default:
                System.out.println("Esse número de alunos não está correto!");
        }
    }
}
