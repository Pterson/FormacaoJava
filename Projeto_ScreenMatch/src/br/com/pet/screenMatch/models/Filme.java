package br.com.pet.screenMatch.models;

import br.com.pet.screenMatch.services.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String diretor;

    public String getDiretor() {
        return this.diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) obterMedia() / 2;
    }

    @Override
    public String toString() {
        return "\nFilme: " + this.getNome() + " (" + this.getAnoDeLancamento()  + ")";
    }
}


