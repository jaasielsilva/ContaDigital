public abstract class Conta {
    private static int contador = 1;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    // Construtor
    public Conta(Cliente cliente) {
        this.numero = contador++;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    // Métodos abstratos
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);

    // Métodos comuns
    public void transferir(Conta destino, double valor) {
        if (this.saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Método toString
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
               "numero=" + numero +
               ", saldo=" + saldo +
               ", cliente=" + cliente +
               '}';
    }
}
