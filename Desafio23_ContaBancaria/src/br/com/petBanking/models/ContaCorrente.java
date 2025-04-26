package br.com.petBanking.models;

public class ContaCorrente extends ContaBancaria{

    @Override
    public void cobrarTarifaMensal() {
        double novoSaldo = getSaldo() - getTarifaMensal();
        setSaldo(novoSaldo);
    }

}
