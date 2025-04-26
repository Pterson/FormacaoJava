/*
Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
*/
package br.com.petkar.models;

import java.util.HashMap;
import java.util.Map;

public class Carro {

    private String nomeDoModelo;
    private int anoDeFabricacao;
    private Map<Integer, Double> precoMedioPorAno = new HashMap<>();

    // Construtor
    public Carro(String nomeDoModelo, int anoDeFabricacao) {
        this.nomeDoModelo = nomeDoModelo;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    // Definir preço médio por ano
    public void definirPrecoMedio(int ano, double preco) {
        precoMedioPorAno.put(ano, preco);
    }

    // Obter preço médio para um ano específico
    public double obterPrecoMedio(int ano) {
        return precoMedioPorAno.getOrDefault(ano, 0.0); // Se o ano não existir, retorna 0
    }

    // Calcular o menor preço
    public double calcularMenorPreco() {
        double menorPreco = Double.MAX_VALUE;
        for (Double preco : precoMedioPorAno.values()) {
            if (preco < menorPreco) {
                menorPreco = preco;
            }
        }
        return menorPreco;
    }

    // Calcular o maior preço
    public double calcularMaiorPreco() {
        double maiorPreco = Double.MIN_VALUE;
        for (Double preco : precoMedioPorAno.values()) {
            if (preco > maiorPreco) {
                maiorPreco = preco;
            }
        }
        return maiorPreco;
    }

    // Exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome do Modelo: " + nomeDoModelo);
        System.out.println("Ano de Fabricação: " + anoDeFabricacao);
        System.out.println("Preços Médios por Ano: " + precoMedioPorAno);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }

    public void setNomeDoModelo(String hondaCivicLxs) {
    }
}
