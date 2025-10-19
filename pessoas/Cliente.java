package pessoas;
public class Cliente extends Pessoa {
    private String telefone;
    private String email;

    public Cliente(String nome, String cpf, String telefone, String email) {
        super(nome, cpf);
        this.telefone = telefone;
        this.email = email;
    }

    public void realizarCompra() {
        // Lógica para realizar uma compra
    }

    public void cadastrarCartao(/*talvez entre o numero do cartao aqui, pq ele é atributo de unicidade do cartao*/){
        // Lógica para cadastrar um cartão
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);
    }
}
