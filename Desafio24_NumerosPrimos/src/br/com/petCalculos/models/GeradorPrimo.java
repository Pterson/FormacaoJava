package br.com.petCalculos.models;

public class GeradorPrimo extends NumerosPrimos {

    public GeradorPrimo(int numero) {
        super(numero);
    }

    public int gerarProximoPrimo() {
        int proximo = numero + 1;
        while (true) {
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(proximo); i++) {
                if (proximo % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) return proximo;
            proximo++;
        }
    }
}