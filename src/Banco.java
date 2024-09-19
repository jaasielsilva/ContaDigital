import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    // Construtor
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    // Métodos para abrir contas
    public Conta abrirContaCorrente(Cliente cliente, double tarifaMensal) {
        ContaCorrente cc = new ContaCorrente(cliente, tarifaMensal);
        contas.add(cc);
        System.out.println("Conta Corrente aberta: " + cc);
        return cc;
    }

    public Conta abrirContaPoupanca(Cliente cliente, double taxaRendimento) {
        ContaPoupanca cp = new ContaPoupanca(cliente, taxaRendimento);
        contas.add(cp);
        System.out.println("Conta Poupança aberta: " + cp);
        return cp;
    }

    // Método para listar contas
    public void listarContas() {
        System.out.println("Listando contas do banco " + nome + ":");
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    // Outros métodos de gerenciamento podem ser adicionados aqui
}
