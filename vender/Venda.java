package vender;
public class Venda {
    private String dataHora;
    private double valorTotal;
    private String formaPagamento;

    public Venda(String dataHora, double valorTotal, String formaPagamento) {
        this.dataHora = dataHora;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
    }

    public void calcularTotal(){
        // Lógica para calcular o total da venda
    }
    public void adicionarProduto(){
        // Lógica para adicionar produto à venda
    }
    public void removerProduto(){
        // Lógica para remover produto da venda
    }
    public void gerarNotaFiscal(){
        System.out.println("Data e hora: " + this.dataHora);
        System.out.println("Valor total: " + this.valorTotal);
        System.out.println("Forma de pagamento: " + this.formaPagamento);
        // Lógica para exibir dados dos produtos comprados na venda
    }
}