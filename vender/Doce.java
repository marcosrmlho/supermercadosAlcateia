package vender;
public class Doce extends Produto {
    private boolean contemAcucar;
    public String tipoDoce;

    public Doce(String nome, double preco, String validade, boolean contemAcucar, String tipoDoce) {
        super(nome, preco, validade);
        this.contemAcucar = contemAcucar;
        this.tipoDoce = tipoDoce;
    }

    public void verificarAlergeno() {
        if (this.contemAcucar) {
            System.out.println("Este doce contém açúcar.");
        } else {
            System.out.println("Este doce não contém açúcar.");
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Validade: " + this.validade);
        System.out.println("Contém Açúcar: " + (contemAcucar ? "Sim" : "Não"));
        System.out.println("Tipo de Doce: " + this.tipoDoce);
    }
}