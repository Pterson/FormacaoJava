package br.com.pet.ContaBancaria.models;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String tipoConta;
    private String nomeTitular;

    public ContaBancaria(int numeroConta, double saldo, String tipoConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.nomeTitular = nomeTitular;
    }

    public ContaBancaria() {

    }

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

    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}
