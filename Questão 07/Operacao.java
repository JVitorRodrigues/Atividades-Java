public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(500.0);

        boolean sucesso = conta.sacar(850.0);

        if (sucesso) {
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
        } else {
            System.out.println("Erro: saldo insuficiente para realizar o saque.");
            System.out.println("Saldo disponível: R$ " + conta.getSaldo());
     }
}
