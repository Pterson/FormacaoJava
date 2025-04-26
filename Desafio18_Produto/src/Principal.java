public class Principal {
    public static void main(String[] args) {

        Produto product = new Produto();
        product.setNome("Bola");
        product.setPreco(100);

        product.obterPrecoFinal();

        System.out.println("\nPreço com desconto: "  + product.obterPrecoFinal());


    }
}
