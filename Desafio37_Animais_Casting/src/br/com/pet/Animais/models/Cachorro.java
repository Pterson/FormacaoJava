package br.com.pet.Animais.models;

public class Cachorro extends Animal {
    private String cor;
    private String raca;

    public Cachorro() {
        super();
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro late!");
    }

    @Override
    public String toString() {
        return "Raça: " + raca + " | Cor: " + cor;
    }
}

/*
Crie uma classe Animal e uma classe Cachorro que herda de Animal.
Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
*/
