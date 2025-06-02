package br.com.pet.produtos;

import br.com.pet.produtos.models.Produto;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        System.out.println("\n------------------ Lista de Produtos instânciados ------------------");

        Produto item001 = new Produto();
        item001.setNome("Caneta");
        item001.setPreco(100.00);

        Produto item002 = new Produto();
        item002.setNome("Lapis");
        item002.setPreco(50.00);

        Produto item003 = new Produto();
        item003.setNome("Borracha");
        item003.setPreco(80.00);

        Produto item004 = new Produto();
        item004.setNome("Caderno Capa Duro");
        item004.setPreco(30.00);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(item001);
        listaDeProdutos.add(item002);
        listaDeProdutos.add(item003);
        listaDeProdutos.add(item004);

        System.out.println("\n----------------------- Lista de Produtos -----------------------");

        double soma = 0;

        for (int i = 0; i < listaDeProdutos.size(); i++) {
            Produto item = listaDeProdutos.get(i);

            System.out.println((i + 1) + "º Produto -> " + item);
            soma += item.getPreco();
        }

        double media = soma / listaDeProdutos.size();
        System.out.printf("\nPreço médio dos produtos: R$ %.2f\n", media);
    }
}
