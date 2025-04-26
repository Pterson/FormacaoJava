/*
Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira
com o método converterDolarParaReal() para converter um valor em dólar para reais.
A classe deve receber o valor em dólar como parâmetro.
*/

package br.com.petMoeda.models;

public class ConversorMoeda implements ConversaoFinanceira {
   double taxaDeCambio = 5;

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * taxaDeCambio;
    }
}