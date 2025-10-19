package pessoas;
public class Caixa extends Funcionario {

    private int numeroCaixa;

    public Caixa(String nome, String cpf, double salario, String turno, int numeroCaixa) {
        super(nome, cpf, salario, turno);
        this.numeroCaixa = numeroCaixa;
    }

    public void registrarVenda() {
        // Lógica para registrar uma venda
    }
    public void emitirRecibo() {
        // Lógica para emitir um recibo
    }
    
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: " + this.salario);
        System.out.println("Turno: " + this.turno);
        System.out.println("Número do Caixa: " + this.numeroCaixa);
    }
}
