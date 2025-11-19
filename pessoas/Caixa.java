//Beatriz Alonso de Lima Soares
//João Paulo Leal Martins
//Marcos Pedro Maciel Ramalho

package pessoas;
import vender.Venda;

public class Caixa extends Pessoa {

    private int numeroCaixa;
    private double valorTotalTotal;

    public Caixa(String telefone, String cpf, int numeroCaixa) {
        super(telefone, cpf);
        this.numeroCaixa = numeroCaixa;
        this.valorTotalTotal = 0;
    }       
    
    public void somarValorTotalTotal(double valor) {
        this.valorTotalTotal += valor;
        System.out.println("Valor R$ " + valor + " adicionado ao lucro total. Lucro atual: R$ " + this.valorTotalTotal);
    }

    public void mostrarLucro() {
        System.out.println("R$ " + this.valorTotalTotal);
    }

    public void emitirRecibo(Venda venda, Cliente cliente, Caixa caixa) {
        venda.gerarNotaFiscal(cliente, caixa);
    }
    
    public void exibirDados() {
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Número do Caixa: " + this.numeroCaixa);
    }
}