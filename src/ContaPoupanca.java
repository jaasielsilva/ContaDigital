public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    // Construtor
    public ContaPoupanca(Cliente cliente, double taxaRendimento) {
        super(cliente);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na Conta Poupança " + numero);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado na Conta Poupança " + numero);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void renderJuros() {
        double juros = saldo * taxaRendimento;
        saldo += juros;
        System.out.println("Rendimento de R$ " + juros + " aplicado na Conta Poupança " + numero);
    }

    // Getter e Setter
    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public String toString() {
        return super.toString() + ", taxaRendimento=" + taxaRendimento + '}';
    }
}
