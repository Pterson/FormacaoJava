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

    public void exibirItens() {
        System.out.println("\nNome: " + getNome());
    }

    @Override
    public String toString() {
        return "Produto: " + nome;
    }
}


/*
Implemente o método toString() na classe Produto para retornar
uma representação em texto do objeto. Em seguida, imprima a lista
de produtos utilizando o método System.out.println().
*/
