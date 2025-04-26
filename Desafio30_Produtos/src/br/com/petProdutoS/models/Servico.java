package br.com.petProdutoS.models;

public class Servico implements Vendavel{
    private double precoBase;
    private double imposto;

    // Construtor: recebe os dois valores na criação do objeto
    public Servico(double precoBase, double imposto) {
        this.precoBase = precoBase;
        this.imposto = imposto;
    }

    // Método obrigatório da interface
    @Override
    public double calcularPrecoTotal() {
        return precoBase + imposto;
    }
}
