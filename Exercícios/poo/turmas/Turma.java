package br.inatel.poo.turmas;

public class Turma {
    public int quantidadeAlunos = 0;
    public Aluno[] aluno = new Aluno[3];

    public void adicionarAluno(Aluno alunos) {
        aluno[quantidadeAlunos] = alunos;
        quantidadeAlunos++;
    }

    public void listaAlunos(){
        System.out.println("-------Lista de Alunos-------");
        for(int i = 0; i < quantidadeAlunos; i++){
            aluno[i].mostraInfo();
            System.out.println();
        }
    }

    public Aluno buscarMelhorAluno(){
        Aluno melhor = aluno[0];

        for(int i = 0; i < quantidadeAlunos; i++){
            if(aluno[i].calculaMedia() > melhor.calculaMedia()){
                melhor = aluno[i];
            }
        }

        return melhor;
    }
}
