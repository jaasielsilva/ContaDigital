public class ContaCorrente extends Conta {
    private double tarifaMensal;

    // Construtor
    public ContaCorrente(Cliente cliente, double tarifaMensal) {
        super(cliente);
        this.tarifaMensal = tarifaMensal;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na Conta Corrente " + numero);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado na Conta Corrente " + numero);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void cobrarTarifa() {
        if (saldo >= tarifaMensal) {
            saldo -= tarifaMensal;
            System.out.println("Tarifa mensal de R$ " + tarifaMensal + " cobrada da Conta Corrente " + numero);
        } else {
            System.out.println("Saldo insuficiente para cobrar tarifa.");
        }
    }

    // Getter e Setter
    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    @Override
    public String toString() {
        return super.toString() + ", tarifaMensal=" + tarifaMensal + '}';
    }
}
