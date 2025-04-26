import br.com.petMoeda.models.ConversorMoeda;

public class Principal {
    public static void main(String[] args) {

        ConversorMoeda conversorMoeda = new ConversorMoeda();

        double valorEmReaisConvertido = conversorMoeda.converterDolarParaReal(50);

        System.out.printf("\nValor convertido: R$ %.2f%n", valorEmReaisConvertido);

    }
}
