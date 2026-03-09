package org.Aula5;

public class Main {
    public static void main(String[] args) {
        Pessoa Max = new Pessoa();

        Max.nome = "Maximus Decimus Meridius";
        Max.idade = 35;

        Max.falar();

        Professor POO = new Professor();

        POO.nome = "Justino";
        POO.idade = 70;
        POO.disciplina = "Radio";

        POO.falar();
        POO.ministraAula();
    }
}