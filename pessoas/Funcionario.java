package pessoas;
public class Funcionario extends Pessoa {

    protected double salario;
    protected String turno;

    public Funcionario(String nome, String cpf, double salario, String turno) {
        super(nome, cpf);
        this.salario = salario;
        this.turno = turno;
    }

    public void registrarPonto() {
        // Lógica para registrar o ponto do funcionário
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: " + this.salario);
        System.out.println("Turno: " + this.turno);
    }

}