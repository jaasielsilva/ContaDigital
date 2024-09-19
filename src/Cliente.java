public class Cliente {
    private String nome;
    private String cpf;

    // Construtor
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cliente{" +
               "nome='" + nome + '\'' +
               ", cpf='" + cpf + '\'' +
               '}';
    }
}
