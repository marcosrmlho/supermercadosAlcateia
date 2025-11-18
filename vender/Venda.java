package vender;

public class Venda {
    private String dataHora;
    private double valorTotal;
    private Produto[] carrinho = new Produto[50];
    private int[] quantidades = new int[50];

    public Venda(String dataHora) {
        this.dataHora = dataHora;
        this.valorTotal = 0;
    } 

    public void exibirListaProdutosDisponiveis(){
         Produto.listarProdutos(); 
    }

    public void calcularTotal(){
        double total = 0;
        for (int i = 0; i < carrinho.length; i++){
            if (carrinho[i] != null){
                total += carrinho[i].getPreco() * quantidades[i];
            }
        }
        this.valorTotal = total;
    }
    
    public void adicionarProduto(int codigo, int quantidade){
        Produto produto = Produto.buscarPorCodigo(codigo);
        if (produto == null){
            System.out.println("Produto com código " + codigo + " não encontrado.");
            return;
        }

        for (int i = 0; i < carrinho.length; i++){
            if (carrinho[i] == null){
                carrinho[i] = produto;
                quantidades[i] = quantidade;
                this.valorTotal += produto.getPreco() * quantidade;
                System.out.println("Produto " + produto.getNome() + " adicionado ao carrinho.");
                return;
            }
        }

        System.out.println("Carrinho cheio! Não é possível adicionar mais produtos.");
    }

    public void removerProduto(int codigo){
        for (int i = 0; i < carrinho.length; i++){
            if (carrinho[i] != null && carrinho[i].getCodigo() == codigo){
                this.valorTotal -= carrinho[i].getPreco() * quantidades[i];
                System.out.println("Produto " + carrinho[i].getNome() + " removido do carrinho.");
                carrinho[i] = null;
                quantidades[i] = 0;
                return;
            }
        }

        System.out.println("Produto com código " + codigo + " não encontrado no carrinho.");
    }
    
    public void exibirCarrinho(){
        System.out.println("Conteúdo do carrinho:");
        boolean carrinhoVazio = true;
        for (int i = 0; i < carrinho.length; i++){
            if (carrinho[i] != null){
                System.out.println("Produto " + (i+1) + ": " + carrinho[i].getNome() + 
                                 " | Preço: R$ " + carrinho[i].getPreco() + 
                                 " | Quantidade: " + quantidades[i] +
                                 " | Subtotal: R$ " + (carrinho[i].getPreco() * quantidades[i]));
                carrinhoVazio = false;
            }
        }
        if (carrinhoVazio) {
            System.out.println("Carrinho vazio.");
        }
        System.out.println("Valor total: R$ " + this.valorTotal);
    }
    
    public void gerarNotaFiscal(){
        System.out.println("\n=== NOTA FISCAL ===");
        System.out.println("Data e hora: " + this.dataHora);
        System.out.println("Valor total: R$ " + this.valorTotal);
        System.out.println("Itens:");

        for (int i = 0; i < carrinho.length; i++){
            if (carrinho[i] != null){
                System.out.println("  " + carrinho[i].getNome() + 
                                 " - R$ " + carrinho[i].getPreco() + 
                                 " x " + quantidades[i] + 
                                 " = R$ " + (carrinho[i].getPreco() * quantidades[i]));
            } 
        }
        System.out.println("====================\n");
    }
    
    public double getValorTotal() {
        return valorTotal;
    }
}