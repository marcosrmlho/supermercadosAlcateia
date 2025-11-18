package vender;
public class CartaoBanco {
    private String numeroCartao;
    private double limite;
    private double saldoDisponivel;
    private boolean bloqueado;
    private boolean tipoCartao;

    public CartaoBanco(String numeroCartao, double limite, boolean tipoCartao) {
        this.numeroCartao = numeroCartao;
        this.limite = limite;
        this.saldoDisponivel = tipoCartao ? 0 : 1000.0; // Débito começa com saldo
        this.bloqueado = false;
        this.tipoCartao = tipoCartao;
    }
    
    public boolean autorizarPagamento(double valor) {
        if (this.bloqueado) {
            System.out.println("Cartão bloqueado. Pagamento não autorizado.");
            return false;
        }

        if (this.tipoCartao) {
            if (valor <= this.limite) {
                this.limite -= valor;
                System.out.println("Pagamento de R$ " + valor + " autorizado no cartão de crédito.");
                return true;
            } else {
                System.out.println("Limite insuficiente no cartão de crédito. Pagamento não autorizado.");
                return false;
            }
        } else {
            if (valor <= this.saldoDisponivel) {
                this.saldoDisponivel -= valor;
                System.out.println("Pagamento de R$ " + valor + " autorizado no cartão de débito.");
                return true;
            } else {
                System.out.println("Saldo insuficiente no cartão de débito. Pagamento não autorizado.");
                return false;
            }
        }
    }

    public void atualizarLimite(double novoLimite) {
        this.limite = novoLimite;
    }

    public void adicionarSaldo(double valor) {
        if (!this.bloqueado) {
            if (valor > 0) {
                this.saldoDisponivel += valor;
                System.out.println("Saldo adicionado: R$ " + valor);
            }
            else {
                System.out.println("Valor inválido para adicionar saldo.");
            }
        }
        else {
            System.out.println("Cartão bloqueado. Não é possível adicionar saldo.");
        }
    }

    public void bloquear() {
        this.bloqueado = true;
        System.out.println("Cartão bloqueado.");
    }

    public void exibirDados() {
        System.out.println("Número do Cartão: " + this.numeroCartao);
        if (this.tipoCartao) {
            System.out.println("Limite Disponível: R$ " + this.limite);
        } else {
            System.out.println("Saldo Disponível: R$ " + this.saldoDisponivel);
        }
        System.out.println("Bloqueado: " + this.bloqueado);
        System.out.println("Tipo de Cartão: " + (this.tipoCartao ? "Crédito" : "Débito"));
    }
}