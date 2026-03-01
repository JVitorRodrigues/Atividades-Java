public class ContaBancaria {

    private double saldo;

    
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    
    public boolean sacar(double valor) {

        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false; 
        }
    }


    public double getSaldo() {
        return saldo;
    }
}
