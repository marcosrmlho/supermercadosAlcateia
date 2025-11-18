package pessoas;
public abstract class Pessoa {
    protected String telefone;
    protected String cpf;

    public abstract void exibirDados();

    public Pessoa(String telefone, String cpf) {
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public String getCpf() {
        return cpf;
    }
}