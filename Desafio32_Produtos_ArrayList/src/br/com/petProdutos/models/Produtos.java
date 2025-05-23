package br.com.petProdutos.models;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirItens() {
        System.out.println("\nNome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
    }

    @Override
    public String toString() {
        return " " + nome + ", Preço: R$" + preco + ", Quantidade: " + quantidade;
    }
}

/*
Crie uma classe Produto com atributos como nome, preco, e quantidade.
Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.
*/
