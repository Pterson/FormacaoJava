package br.com.pet.Animais;

import br.com.pet.Animais.models.Cachorro;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Cachorro dog01 = new Cachorro();
        dog01.setCor("Marrom");
        dog01.setRaca("Buldogue");

        Cachorro dog02 = new Cachorro();
        dog02.setCor("Branco e Marrom");
        dog02.setRaca("Beagle");

        Cachorro dog03 = new Cachorro();
        dog03.setCor("Branco");
        dog03.setRaca("Poodle");

        ArrayList<Cachorro> listaDeCachorros = new ArrayList<>();
        listaDeCachorros.add(dog01);
        listaDeCachorros.add(dog02);
        listaDeCachorros.add(dog03);

        System.out.println("\n------------------ Lista de Dogs ------------------");
        System.out.println("Tamanho da lista: " + listaDeCachorros.size());

        //int posicao = 1; // Começamos no 1
        //for (Cachorro dogs : listaDeCachorros) {
        //    System.out.println(posicao + "º Raça: " + dogs.getRaca() + " | Cor: " + dogs.getCor());
        //    posicao++; // Depois de cada animal, aumenta a posição
        //}

        int posicao = 1;
        for (Cachorro cachorro : listaDeCachorros) {
            System.out.println(posicao++ + "º " + cachorro);
        }

    }
}
