package br.com.petProdutos.principal;

import br.com.petProdutos.models.Produtos;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        System.out.println("\n------------------ Lista de Produtos instânciados ------------------");

        Produtos item001 = new Produtos();
        item001.setNome("Caneta");
        item001.setPreco(100.00);
        item001.setQuantidade(100);
        item001.exibirItens();

        Produtos item002 = new Produtos();
        item002.setNome("Lapis");
        item002.setPreco(50.00);
        item002.setQuantidade(100);
        item002.exibirItens();

        Produtos item003 = new Produtos();
        item003.setNome("Borracha");
        item003.setPreco(80.00);
        item003.setQuantidade(100);
        item003.exibirItens();

        Produtos item004 = new Produtos();
        item004.setNome("Caderno Capa Duro");
        item004.setPreco(30.00);
        item004.setQuantidade(50);
        item004.exibirItens();

        ArrayList<Produtos> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(item001);
        listaDeProdutos.add(item002);
        listaDeProdutos.add(item003);
        listaDeProdutos.add(item004);

        System.out.println("\n------------------ Lista de Produtos No Array ------------------");
        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("\nBusca de produto por indice");
        System.out.println("Item:" + listaDeProdutos.get(3));

    }
}
