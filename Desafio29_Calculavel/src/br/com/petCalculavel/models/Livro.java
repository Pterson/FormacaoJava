package br.com.petCalculavel.models;

// A classe implementa a interface Calculavel
public class Livro implements Calculavel {

    // Atributos que o Livro precisa ter: o preço original e o desconto
    private double precoOriginal;
    private double percentualDesconto;

    // Construtor: usado para criar o livro informando o preço e o desconto
    public Livro(double precoOriginal, double percentualDesconto) {
        this.precoOriginal = precoOriginal;
        this.percentualDesconto = percentualDesconto;
    }

    // Método obrigatório da interface Calculavel
    @Override
    public double calcularPrecoFinal() {
        // Calcula o valor do desconto em reais
        double valorDesconto = (precoOriginal * percentualDesconto) / 100;

        // Retorna o preço final já com o desconto subtraído
        return precoOriginal - valorDesconto;
    }
}