package pessoas;
public abstract class Pessoa {
    protected String nome;
    protected String cpf;

    public abstract void exibirDados();

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}