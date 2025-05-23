package br.com.petProdutos.principal;

import br.com.petProdutos.model.ProdutoPerecivel;
import br.com.petProdutos.model.Produtos;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {


        ProdutoPerecivel leite = new ProdutoPerecivel("Leite", 10, 4.50, LocalDate.of(2025, 6, 15));
        System.out.println(leite);



    }
}
