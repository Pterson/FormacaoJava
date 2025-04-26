/*
Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo().
Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
*/

package br.com.petBanking.models;

public abstract class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;
    private String tipoConta;
    private double tarifaMensal = 5;

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }
    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }



    public abstract void cobrarTarifaMensal();

    public double receberValor(double valorRecebido) {
        saldo = saldo + valorRecebido;
        return saldo;
    }

    public double sacarValor(double valorSacado) {
        saldo = saldo - valorSacado;
        return saldo;
    }
}

