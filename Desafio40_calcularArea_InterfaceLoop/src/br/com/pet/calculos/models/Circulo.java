package br.com.pet.calculos.models;
import br.com.pet.calculos.interfaces.Forma;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

// O atributo raio está encapsulado e com construtor, e implementando a interface.
