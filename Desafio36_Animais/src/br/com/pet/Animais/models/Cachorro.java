package br.com.pet.Animais.models;

public class Cachorro {
    private String cor;
    private String raca;

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

    //public void exibirEspecie() {
    //    System.out.println("\nCor: " + getCor());
    //    System.out.println("Raça: " + getRaca());
    //}


}    @Override
public String toString() {
    return "Raça: " + raca + " | Cor: " + cor;
}

/*
Crie um ArrayList de strings e utilize um loop foreach para percorrer
e imprimir cada elemento da lista.
*/
