import br.com.petCalculos.models.VerificadorPrimo;
import br.com.petCalculos.models.GeradorPrimo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é primo: ");
        int num = dados.nextInt();

        VerificadorPrimo verificador = new VerificadorPrimo(num);
        verificador.verificarSeEhPrimo();

        GeradorPrimo gerador = new GeradorPrimo(num);
        int proximo = gerador.gerarProximoPrimo();
        System.out.println("O próximo número primo após " + num + " é " + proximo);
    }
}
