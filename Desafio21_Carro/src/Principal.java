import br.com.petkar.models.Carro;

public class Principal {
    public static void main(String[] args) {

        Carro car = new Carro("Honda Civic LXS", 2013);

        car.definirPrecoMedio(2013, 40000.0);
        car.definirPrecoMedio(2014, 50000.0);
        car.definirPrecoMedio(2015, 60000.0);

        car.exibirInformacoes();

    }
}
