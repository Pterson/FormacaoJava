import br.com.petCalculaAreaRetangular.models.CalculadoraSalaRetangular;

public class Principal {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();

        double areaCalculada = calculadoraSalaRetangular.calcularArea(10, 5);

        System.out.printf("\nÁrea calculada: %.2f m²%n", areaCalculada);
    }
}
