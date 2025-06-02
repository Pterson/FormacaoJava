package br.com.pet.produtos.models;

public class Produto {
    private String nome;
    private double preco;
    private double precoMedio;

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


    public double getPrecoMedio() {
        return precoMedio;
    }

    public void calcularPrecoMedio(){}

    public void exibirProdutos() {
        System.out.println("\nNome: " + nome);
        System.out.println("Preço: " + preco);
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}

/*
Crie uma classe Produto com propriedades como nome e preço. Em seguida,
crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.
*/
