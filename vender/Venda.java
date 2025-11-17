package vender;

import java.util.Scanner;

public class Venda {
    private String dataHora;
    private double valorTotal;
    private String formaPagamento;
    //05.11.2025: criar um array de produtos --ramalho

    public Venda(String dataHora, Scanner teclado) {
        this.dataHora = dataHora;
        insiraFormaPagamento(teclado);
        //05.11.2025: entender como continuar aqui (pode colocar método com scanner dentro de construtor?) --ramalho

    }
    public void insiraFormaPagamento(Scanner teclado){
        System.out.println("Insira a forma de pagamento (Crédito | Débito): ");
        this.formaPagamento = teclado.nextLine();
    }

    public void calcularTotal(){
        // Lógica para calcular o total da venda: somar os valores (multiplicado pelas quantidades) de cada produto
    }
    public void adicionarProduto(){
        // Lógica para adicionar produto à venda: adicionar um produto e quantidade (digitando o nome e quantidade) no array de produtos.
    }
    public void removerProduto(){
        // Lógica para remover produto da venda: tirar o produto (todas as quantidades) da lista de produtos (retirar pelo nome do produto).
    }
    public void gerarNotaFiscal(){
        System.out.println("Data e hora: " + this.dataHora);
        System.out.println("Valor total: " + this.valorTotal);
        System.out.println("Forma de pagamento: " + this.formaPagamento);
        // Lógica para exibir dados dos produtos comprados na venda (chamar o "exibirDados()" de cada produto.)
    }
}