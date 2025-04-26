/*
Desenvolva uma classe Produto com os atributos privados nome e preco.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
*/

public class Produto {
    private String nome;
    private double preco;
    double percentualDesconto = 10;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto() {
        return (preco * percentualDesconto) / 100;
    }

    public double obterPrecoFinal() {
        return preco - aplicarDesconto();
    }

    //public double calcularPrecoComDesconto() {
    //    return preco * (1 - percentualDesconto / 100);
    //} Preço com 10% de desconto → 1 - 0.10 = 0.90

}
