package pessoas;

import vender.CartaoBanco;
public class Cliente extends Pessoa {
    private CartaoBanco cartao;

    public Cliente(String telefone, String cpf, CartaoBanco cartao) {
        super(telefone, cpf);
        this.cartao = cartao;
    }

    public void exibirDados() {
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("CPF: " + this.getCpf());
        cartao.exibirDados();
    }

    public boolean realizarPagamento(double valor) {
        if (cartao.autorizarPagamento(valor)) {
            return true;
        } else {
            return false;
        }
    }
}