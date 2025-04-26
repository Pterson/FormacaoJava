/*
Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com
os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma
sala retangular. A classe deve receber altura e largura como parâmetros.
*/

package br.com.petCalculaAreaRetangular.models;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    //double base = 10;
    //double altura = 5;

    @Override
    public double calcularArea(double base, double altura) {
        return base * altura;
    }
}
