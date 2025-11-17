package pessoas;
public class Funcionario extends Pessoa {

    protected double salario;
    protected String turno;
    protected boolean ponto;

    public Funcionario(String nome, String cpf, double salario, String turno) {
        super(nome, cpf);
        this.salario = salario;
        this.turno = turno;
    }

    public void registrarPonto() {
        this.ponto = true;
        System.out.println("Ponto registrado para " + this.nome);
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: " + this.salario);
        System.out.println("Turno: " + this.turno);
    }

}