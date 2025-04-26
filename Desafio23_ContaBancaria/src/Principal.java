import br.com.petBanking.models.ContaCorrente;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        F


        ContaCorrente conta = new ContaCorrente();
        conta.setNumeroConta(123456);
        conta.setSaldo(1000.0);
        conta.setTitular("Peter");
        conta.setTitular("Corrente");

        conta.cobrarTarifaMensal(); // Aplica a tarifa

        System.out.println("\nNúmero da conta: " + conta.getNumeroConta());
        System.out.println("Saldo após tarifa: R$" + conta.getSaldo());
        System.out.println("Titular da conta: " + conta.getTitular());
        System.out.println("Tipo de conta: " + conta.getTipoConta());


        System.out.println("\n----------------------------------------------------------------------");

        while (true) {
            System.out.println("\n                           Menu De Operações                            ");
            System.out.println("""
                    \nEscolha uma opção:
                    1. Consultar saldo
                    2. Receber valor
                    3. Sacar valor
                    4. Sair
                    """);

            System.out.println("\nDigite sua opção: ");

            if (!dados.hasNextInt()) { // Valida entrada não numérica
                System.out.println("\nEntrada inválida! As opções disponiveis estão entre 1 e 4.");
                dados.next(); // Limpa entrada inválida
                continue;
            }

            int menu = dados.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n******************************** OPERAÇÃO EFETUADA ********************************");
                    System.out.printf("\nSaldo atual é: R$ %.2f%n", + conta.getSaldo());
                    System.out.println();
                    break;

                case 2:
                    System.out.print("\nDigite o valor do deposito: ");
                    double valorRecebido = dados.nextDouble();
                    conta.receberValor(valorRecebido);

                    System.out.println("\n******************************** OPERAÇÃO EFETUADA ********************************");
                    System.out.printf("\nO depósito de %.2f foi concluído", valorRecebido);
                    System.out.printf("\nSaldo atualizado é: R$ %.2f%n", conta.getSaldo());
                    System.out.println();
                    break;

                case 3:
                    System.out.printf("\nSaldo atual é: R$ %.2f%n", conta.getSaldo());

                    System.out.print("Digite o valor que deseja sacar: ");
                    double valorSacado = dados.nextDouble();

                    if (conta.getSaldo() < valorSacado) {
                        System.out.print("\n**************************** OPERAÇÃO NÃO EFETUADA ********************************");
                        System.out.println("\n                     Saldo insuficiente para essa operação!!!                ");
                        break;
                    }

                    conta.setSaldo(conta.getSaldo() - valorSacado);
                    System.out.print("\n******************************** OPERAÇÃO EFETUADA ********************************");
                    System.out.printf("\nVocê sacou %.2f reais", valorSacado);
                    System.out.printf("\nSaldo atualizado é: R$ %.2f%n: ", conta.getSaldo());
                    System.out.println();
                    break;

                case 4:
                    System.out.println("\nSaindo do programa... Obrigado por utilizar os serviços do Pet Bank!");
                    dados.close(); // Fechamento do scanner
                    return;

                default:
                    System.out.println("\nOpção inválido. Escolha um número entre 1 e 4.");
            }
        }
    }
}