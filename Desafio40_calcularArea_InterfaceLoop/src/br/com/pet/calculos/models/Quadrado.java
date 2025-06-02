package br.com.pet.calculos.models;
import br.com.pet.calculos.interfaces.Forma;

public class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

// O atributo lado está encapsulado e com construtor, e implementando a interface.

