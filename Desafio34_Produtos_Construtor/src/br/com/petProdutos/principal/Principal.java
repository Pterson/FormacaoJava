package br.com.petProdutos.principal;

import br.com.petProdutos.model.Produtos;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produtos item01 = new Produtos("Geladeira");
        Produtos item02 = new Produtos("Microondas");
        Produtos item03 = new Produtos("Batedeira");
        Produtos item04 = new Produtos("Fogão");

        System.out.println(item01);
        System.out.println(item02);
        System.out.println(item03);
        System.out.println(item04);
    }
}
