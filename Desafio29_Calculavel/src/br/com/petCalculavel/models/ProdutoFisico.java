package br.com.petCalculavel.models;

// A classe também implementa a interface Calculavel
public class ProdutoFisico implements Calculavel {

    // Atributos: preço base e taxa (ex: frete)
    private double precoBase;
    private double taxaFrete;

    // Construtor: recebe os dois valores na criação do objeto
    public ProdutoFisico(double precoBase, double taxaFrete) {
        this.precoBase = precoBase;
        this.taxaFrete = taxaFrete;
    }

    // Método obrigatório da interface
    @Override
    public double calcularPrecoFinal() {
        // Retorna o preço total somando o frete
        return precoBase + taxaFrete;
    }
}