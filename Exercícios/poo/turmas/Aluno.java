package br.inatel.poo.turmas;

public class Aluno {
    public String nome;
    public String matricula;
    public double[] notas;

    public double calculaMedia(){
        double media;
        double soma = 0.0;

        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }

        media = soma / notas.length;
        return media;
    }

    public void mostraInfo(){
        System.out.println("Aluno: " +this.nome);
        System.out.println("Matricula: " +this.matricula);
        System.out.println("Média das notas: " +calculaMedia());
    }
}
