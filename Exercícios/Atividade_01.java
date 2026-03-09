package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Entre com a quantidade de ingressos de meia-entrada: ");
        int qtdMeia = teclado.nextInt();
        System.out.println("Entre com a quantidade de ingressos de entrada inteira: ");
        int qtdInteira = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Entre com o valor do ingresso de meia-entrada: ");
        String Meia = teclado.nextLine();

        System.out.println("Agora entre com o valor do ingresso de entrada inteira: ");
        String Inteira = teclado.nextLine();

        String ingM  = Meia.replace(",",".");
        double ingMeia = Double.parseDouble(ingM);

        String ingI  = Inteira.replace(",",".");
        double ingInteira = Double.parseDouble(ingI);

        double totalI = qtdInteira * ingInteira;
        double totalM = qtdMeia * ingMeia;

        double total = totalI + totalM;

        double media = total / (qtdMeia + qtdInteira);

        System.out.print("O valor arrecadado com ingressos de entrada inteira é de: R$");
        System.out.printf("%.2f \n", totalI);

        System.out.print("O valor arrecadado com ingressos de meia-entrada é de: R$");
        System.out.printf("%.2f \n", totalM);

        System.out.print("O valor total arrecadado na sessão é de: R$");
        System.out.printf("%.2f \n", total);

        System.out.print("O valor médio pago por ingresso é de: R$");
        System.out.printf("%.2f \n", media);

        teclado.close();
    }
}
