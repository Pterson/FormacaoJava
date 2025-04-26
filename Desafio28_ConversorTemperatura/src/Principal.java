import br.com.petConversorTemperatura.models.ConversorTemperaturaPadrao;

public class Principal {
    public static void main(String[] args) {
        System.out.println("testado");
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();

        double tempCelsius = conversorTemperaturaPadrao.celsiusParaFahrenheit(10);

        double tempFahren = conversorTemperaturaPadrao.fahrenheitParaCelsius(15);

        System.out.printf("\nA temperatura em Fahrenheit é: %.2f", tempCelsius);
        System.out.printf("\nA temperatura em Celsius é: %.2f", tempFahren);
    }
}
