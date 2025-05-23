package br.com.pet.screenMatch.models;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }


    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public String getNome() {
        return nome;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibirFichaTecnica() {
        System.out.println("\nNome do filme: " + getNome());
        System.out.println("Ano de Lançamento: " + getAnoDeLancamento());
        System.out.println("Duração: " + getDuracaoEmMinutos() + " minutos");
    }

    public void avaliar(double nota) {
        somaDasAvaliacoes = somaDasAvaliacoes + nota;
        totalDeAvaliacoes++;
    }

    public double obterMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
