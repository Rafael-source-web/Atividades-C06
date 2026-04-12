package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.nome = "Max Verstapen";
        a2.nome = "Lady gaga";
        a3.nome = "Mike Shinoda";

        a1.matricula = "001";
        a2.matricula = "501";
        a3.matricula = "101";

        a1.notas = new double[]{60, 35, 75};
        a2.notas = new double[]{45, 58, 70};
        a3.notas = new double[]{70, 68, 65};

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);
        turma.adicionarAluno(a3);

        turma.listaAlunos();

        System.out.println("Melhor aluno: " +turma.buscarMelhorAluno().nome + ", com média de: " +turma.buscarMelhorAluno().calculaMedia());
    }
}