package br.com.petAnimal.models;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando os móveis");
    }
}