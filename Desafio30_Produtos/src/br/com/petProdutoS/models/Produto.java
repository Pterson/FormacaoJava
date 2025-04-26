/*
Crie uma interface Vendavel com métodos para calcular o preço total de um produto
com base na quantidade comprada e aplicar descontos. Implemente essa interface nas
classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de
preço.
 */

package br.com.petProdutoS.models;

public class Produto implements Vendavel{
    private double precoTotal;
    private double desconto;

    // Construtor: usado para criar o produto informando o preço total e o desconto
    public Produto(double precoTotal, double desconto) {
        this.precoTotal = precoTotal;
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoTotal() {
        // Calcula o valor do desconto em reais
        double valorDesconto = (precoTotal * desconto) / 100;
        // Retorna o preço final já com o desconto subtraído
        return precoTotal - valorDesconto;
    }
}
