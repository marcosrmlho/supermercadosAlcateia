package pessoas;
import java.util.Scanner;
import vender.Venda;
public class Cliente extends Pessoa {
    private String telefone;
    private String email;

    public Cliente(String nome, String cpf, String telefone, String email) {
        super(nome, cpf);
        this.telefone = telefone;
        this.email = email;
    }

    public void realizarCompra(String dataHora, Scanner teclado){
        Venda venda = new Venda(dataHora, teclado);
        //05.11.2025: continuar esse método --ramalho
        
    }

    public void cadastrarCartao(){
        // Lógica para cadastrar um cartão: perguntas simples para cadastro do cartao. no final, adiciona o cartao ao cliente (cria atributo ou nao??)
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);
    }
}
