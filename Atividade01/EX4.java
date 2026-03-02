package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com a nota da NPA: ");
        int NPA = teclado.nextInt();

        if(NPA >= 60){
            System.out.println("O aluno passou!");
        }

        else if(NPA < 30){
            System.out.println("O aluno reprovou!");
        }

        else{
            System.out.println("O aluno ficou de NP3");
            System.out.println("Entre com a nota da NP3: ");
            int NP3 = teclado.nextInt();

            double NFA = (double) (NPA + NP3) /2;

            if(NFA >= 50){
                System.out.print("A NFA do aluno foi de: " + NFA);
                System.out.println(" O aluno passou");
            }

            else{
                System.out.print("A NFA do aluno foi de: " + NFA);
                System.out.println(" O aluno reprovou");
            }
        }
    }
}
