package br.com.petProdutos.model;

public class Produtos {
    private String nome;

    public Produtos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto: " + nome;
    }
}


/*
Modifique a classe Produto para incluir um construtor que aceite parâmetros
para inicializar os atributos. Em seguida, crie objetos Produto utilizando
esse novo construtor.
*/
