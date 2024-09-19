public class App {
    public static void main(String[] args) throws Exception {
       // Criando clientes
       Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
       Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

       // Criando banco
       Banco banco = new Banco("Banco Java");

       // Abrindo contas
       Conta cc1 = banco.abrirContaCorrente(cliente1, 10.0);
       Conta cp1 = banco.abrirContaPoupanca(cliente2, 0.05);

       // Realizando operações
       cc1.depositar(500.0);
       cp1.depositar(1000.0);

       cc1.sacar(100.0);
       cp1.sacar(200.0);

       cc1.transferir(cp1, 150.0);

       // Aplicando tarifa e rendimento
       if (cc1 instanceof ContaCorrente) {
           ((ContaCorrente) cc1).cobrarTarifa();
       }

       if (cp1 instanceof ContaPoupanca) {
           ((ContaPoupanca) cp1).renderJuros();
       }

       // Listando contas
       banco.listarContas();
    }
}
