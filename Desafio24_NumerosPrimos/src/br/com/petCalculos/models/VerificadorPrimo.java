package br.com.petCalculos.models;

public class VerificadorPrimo extends NumerosPrimos {

    public VerificadorPrimo(int numero) {
        super(numero);
    }

    public void verificarSeEhPrimo() {
        if (verificarPrimalidade()) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}