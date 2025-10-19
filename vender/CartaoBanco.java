package vender;
public class CartaoBanco {
    private String numeroCartao;
    private String validade;
    private String bandeira;
    private double limite;
    private double saldoDisponivel;
    private boolean bloqueado;

    public CartaoBanco(String numeroCartao, String validade, String bandeira, double limite) {
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.bandeira = bandeira;
        this.limite = limite;
        this.saldoDisponivel = limite;
        this.bloqueado = false;
    }
    public boolean autorizarPagamento() {
        // Logica para autorização de pagamento
        return false; //placeholder
    }

    public void atualizarLimite(double novoLimite) {
        this.limite = novoLimite;
    }

    public void bloquear() {
        this.bloqueado = true;
    }
    public void exibirDados() {
        System.out.println("Número do Cartão: " + this.numeroCartao);
        System.out.println("Validade: " + this.validade);
        System.out.println("Bandeira: " + this.bandeira);
        System.out.println("Limite: " + this.limite);
        System.out.println("Saldo Disponível: " + this.saldoDisponivel);
        System.out.println("Bloqueado: " + this.bloqueado);
    }
}
