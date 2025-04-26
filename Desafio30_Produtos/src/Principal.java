import br.com.petProdutoS.models.Produto;
import br.com.petProdutoS.models.Servico;

public class Principal {
    public static void main(String[] args) {

        // Cria um produto com preço R$500 e 20% de desconto
        Produto produto = new Produto(500.0, 20.0);

        // Cria um produto físico com preço base R$400 e taxa de R$25
        Servico servico = new Servico(400.0, 25.0);

        // Mostra o preço final do produto
        System.out.printf("\nPreço total do produto com desconto: R$ %.2f%n", produto.calcularPrecoTotal());

        // Mostra o preço final do servico
        System.out.printf("Preço final do serviço: R$ %.2f%n", servico.calcularPrecoTotal());
    }
}
