package br.com.petProdutos.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoPerecivel extends Produtos{

    private LocalDate dataValidade; // Agora está private (encapsulado)

    public ProdutoPerecivel(String nome, int quantidade, double preco, LocalDate dataValidade) {
        super(nome, quantidade, preco); // Chama o construtor da superclasse Produtos
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return super.toString() + ", Validade: " + dataValidade.format(formatter);
    }
}
