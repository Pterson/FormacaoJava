package br.com.pet.calculos.app;

import br.com.pet.calculos.interfaces.Forma;
import br.com.pet.calculos.models.Circulo;
import br.com.pet.calculos.models.Quadrado;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        //Forma Quadrada
        Quadrado quadrado = new Quadrado(5);
        double calcularAreaQuadrada = quadrado.calcularArea();
        System.out.printf("\nÁrea Quadrada calculada: %.2f m²%n", calcularAreaQuadrada);

        //Forma Circular
        Circulo circulo = new Circulo(3);
        double calcularAreaCircular = circulo.calcularArea();
        System.out.printf("Área Circular calculada: %.2f m²%n", calcularAreaCircular);

        System.out.println();

        // Lista com formas polimórficas
        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(quadrado);
        listaDeFormas.add(circulo);

        // Loop para exibir áreas
        for (Forma forma : listaDeFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
