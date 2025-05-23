package br.com.petProdutos.model;

import java.util.Date;

public class Produtos {
    private String nome;
    private int quantidade;
    private double preco;

    public Produtos(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Quantidade: " + quantidade + ", Preço: R$" + preco;
    }

}

/*
Crie uma classe ProdutoPerecivel que herde de Produto.
Adicione um atributo dataValidade e um construtor que
utilize o construtor da classe mãe (super) para inicializar
os atributos herdados. Crie um objeto ProdutoPerecivel e
imprima seus valores.
 */
