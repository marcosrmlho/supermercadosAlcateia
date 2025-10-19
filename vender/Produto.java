package vender;
public abstract class Produto {
    protected String nome;
    protected double preco;
    protected String validade;
    
    public Produto(String nome, double preco, String validade) {
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }
    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }
    
    public abstract void exibirDados();
}
