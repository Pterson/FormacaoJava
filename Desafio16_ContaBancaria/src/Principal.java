public class Principal {
    public static void main(String[] args) {

        ContaBancaria bankAccount = new ContaBancaria();
        bankAccount.setNumeroConta(123456);
        bankAccount.setSaldo(500);
        bankAccount.setTitular("John");

        System.out.println("Numero da conta: " + bankAccount.getNumeroConta());
        System.out.println("Saldo da conta: " + bankAccount.getSaldo());
        System.out.println("Nome o titular: " + bankAccount.getTitular());

    }
}
