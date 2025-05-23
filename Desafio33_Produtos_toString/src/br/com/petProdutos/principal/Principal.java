package br.com.petProdutos.principal;

import br.com.petProdutos.model.Produtos;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produtos item01 = new Produtos("Cadeira");
        Produtos item02 = new Produtos("Mesa");
        Produtos item03 = new Produtos("Sofa");
        Produtos item04 = new Produtos("Rack");


        ArrayList<Produtos> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(item01);
        listaDeProdutos.add(item02);
        listaDeProdutos.add(item03);
        listaDeProdutos.add(item04);

        System.out.println("\n------------------ Lista de Produtos No Array ------------------");
        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        //System.out.println("Itens da lista: " + listaDeProdutos);

        System.out.println("Itens da lista:");
        for (Produtos p : listaDeProdutos) {
            System.out.println(p);
        }
    }
}
