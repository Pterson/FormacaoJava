/*
Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos().
Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos.
Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.
*/
package br.com.petCalculos.models;

public class NumerosPrimos {
    protected int numero;

    public NumerosPrimos() {
    }

    public NumerosPrimos(int numero) {
        this.numero = numero;
    }

    public boolean verificarPrimalidade() {
        if (numero <= 1) return false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public void listarPrimosAte(int limite) {
        System.out.println("Números primos até " + limite + ":");
        for (int i = 2; i <= limite; i++) {
            numero = i;
            if (verificarPrimalidade()) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}