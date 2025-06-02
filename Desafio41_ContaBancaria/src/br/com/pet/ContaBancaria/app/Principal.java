package br.com.pet.ContaBancaria.app;

import br.com.pet.ContaBancaria.models.ContaBancaria;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // Criação das contas
        ContaBancaria conta01 = new ContaBancaria(12345, 3000.0, "Corrente", "Peterson");
        //conta01.setNumeroConta(12345);
        //conta01.setSaldo(3000.0);
        //conta01.setTipoConta("Corrente");
        //conta01.setNomeTitular("Peterson");

        ContaBancaria conta02 = new ContaBancaria(54321, 4000.0, "Corrente", "Karoll");
        //conta02.setNumeroConta(54321);
        //conta02.setSaldo(4000.0);
        //conta02.setTipoConta("Corrente");
        //conta02.setNomeTitular("Karoll");

        ContaBancaria conta03 = new ContaBancaria(12365,5000.0,"Corrente", "Nicoly");
        //conta03.setNumeroConta(12365);
        //conta03.setSaldo(5000.0);
        //conta03.setTipoConta("Corrente");
        //conta03.setNomeTitular("Nicoly");

        ContaBancaria conta04 = new ContaBancaria(65412, 6000.0, "Corrente", "Larissa");
        //conta04.setNumeroConta(65412);
        //conta04.setSaldo(6000.0);
        //conta04.setTipoConta("Corrente");
        //conta04.setNomeTitular("Larissa");

        //System.out.println("\nNome do Titular: " + conta01.getNomeTitular());
        //System.out.println("Número da conta: " + conta01.getNumeroConta());
        //System.out.println("Tipo da conta: " + conta01.getTipoConta());
        //System.out.println("Saldo Conta: R$ " + conta01.getSaldo());

        // Lista de contas
        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta01);
        listaDeContas.add(conta02);
        listaDeContas.add(conta03);
        listaDeContas.add(conta04);

        System.out.println();
        System.out.println("--- Saldos das Contas ---");
        // Loop para exibir contas
        for (ContaBancaria conta : listaDeContas) {
            System.out.printf("Titular: %s - Saldo: R$ %.2f%n", conta.getNomeTitular(), conta.getSaldo());
        }

        // Lógica para encontrar a conta com maior saldo
        ContaBancaria contaMaiorSaldo = listaDeContas.get(0); // Assume a primeira como maior inicialmente

        for (ContaBancaria conta : listaDeContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta; // Atualiza se encontrar saldo maior
            }
        }

        // Exibe conta com maior saldo
        System.out.println("\n--- Conta com maior saldo ---");
        System.out.printf("Titular: %s%nNúmero: %d%nSaldo: R$ %.2f%n",
            contaMaiorSaldo.getNomeTitular(),
            contaMaiorSaldo.getNumeroConta(),
            contaMaiorSaldo.getSaldo());
    }
}
