package br.com.pet.listaDePessoas.models;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("\nNome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " | Idade: " + this.getIdade();
    }
}






/*
Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
Adicione pelo menos três pessoas à lista utilizando o método add.
Imprima o tamanho da lista utilizando o método size.
Imprima a primeira pessoa da lista utilizando o método get.
Imprima a lista completa
*/

