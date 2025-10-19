package vender;
public class Salgado extends Produto {
    private boolean temperatura;
    public String tipoSalgado;

    public Salgado(String nome, double preco, String validade, boolean temperatura, String tipoSalgado) {
        super(nome, preco, validade);
        this.temperatura = temperatura;
        this.tipoSalgado = tipoSalgado;
    }

    public void aquecer() {
        if (!this.temperatura) {
            this.temperatura = true;
            System.out.println("O salgado agora está quente.");
        } else {
            System.out.println("O salgado já está quente.");
        }
    }
    public void resfriar() {
        if (this.temperatura) {
            this.temperatura = false;
            System.out.println("O salgado agora está frio.");
        } else {
            System.out.println("O salgado já está frio.");
        }
    }
    
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Validade: " + this.validade);
        System.out.println("Temperatura: " + (temperatura ? "Quente" : "Frio"));
        System.out.println("Tipo de Salgado: " + this.tipoSalgado);
    }
}
