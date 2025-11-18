//Beatriz Alonso de Lima Soares
//João Paulo Leal Martins
//Marcos Pedro Maciel Ramalho

package vender;
public class CartaoBanco {
    private String numeroCartao;
    private double limite;
    private double saldoDisponivel;
    private boolean tipoCartao;

    public CartaoBanco(String numeroCartao, double limite, double saldoInicial) {
        this.numeroCartao = numeroCartao;
        this.limite = limite;
        this.saldoDisponivel = saldoInicial;
        this.tipoCartao = true;
    }
    public CartaoBanco(String numeroCartao, double saldoInicial) {
        this.numeroCartao = numeroCartao;
        this.saldoDisponivel = saldoInicial;
        this.limite = 0;
        this.tipoCartao = false;
    }
    
    public boolean autorizarPagamento(double valor) {
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

    public void exibirDados() {
        System.out.println("Número do Cartão: " + this.numeroCartao);
        if (this.tipoCartao) {
            System.out.println("Limite Disponível: R$ " + this.limite);
        } else {
            System.out.println("Saldo Disponível: R$ " + this.saldoDisponivel);
        }
        System.out.println("Tipo de Cartão: " + (this.tipoCartao ? "Crédito" : "Débito"));
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }
    public boolean tipoCartao() {
        return tipoCartao;
    }
}