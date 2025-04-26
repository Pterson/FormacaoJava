/*
Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o
método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o
número como parâmetro.
*/

package br.com.petTabuadas.models;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i, resultado);
        }
    }
}
