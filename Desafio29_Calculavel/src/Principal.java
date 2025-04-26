/*
Crie uma interface Calculavel com um método double calcularPrecoFinal().
Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando
o preço final considerando descontos ou taxas adicionais.
*/

import br.com.petCalculavel.models.Livro;
import br.com.petCalculavel.models.ProdutoFisico;

public class Principal {
    public static void main(String[] args) {

        // Cria um livro com preço R$100 e 15% de desconto
        Livro livro = new Livro(100.0, 15.0);

        // Cria um produto físico com preço base R$200 e taxa de R$25
        ProdutoFisico produto = new ProdutoFisico(200.0, 25.0);

        // Mostra o preço final do livro (deve dar R$85,00)
        System.out.printf("Preço final do livro: R$ %.2f%n", livro.calcularPrecoFinal());

        // Mostra o preço final do produto físico (deve dar R$225,00)
        System.out.printf("Preço final do produto físico: R$ %.2f%n", produto.calcularPrecoFinal());
    }
}