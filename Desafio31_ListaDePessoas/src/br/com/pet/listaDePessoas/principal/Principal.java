package br.com.pet.listaDePessoas.principal;

import br.com.pet.listaDePessoas.models.Pessoa;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        System.out.println("\n------------------ Lista de Pessoas No Método ------------------");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("John Smith");
        pessoa1.setIdade(31);
        pessoa1.exibirDados();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Clark Ken");
        pessoa2.setIdade(33);
        pessoa2.exibirDados();

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Yori Nakagashi");
        pessoa3.setIdade(36);
        pessoa3.exibirDados();

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa3);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa1);

        System.out.println("\n------------------ Lista de Pessoas No Array ------------------");
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        //System.out.println(listaDePessoas);

        System.out.println();
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
