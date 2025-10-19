package pessoas;
public class Gerente extends Funcionario {
    private String setorResponsavel;

    public Gerente(String nome, String cpf, double salario, String turno, String setorResponsavel) {
        super(nome, cpf, salario, turno);
        this.setorResponsavel = setorResponsavel;
    }

    public void contratarFuncionario() {
        // Lógica para contratar um funcionário
    }
    public void demitirFuncionario() {
        // Lógica para demitir um funcionário
    }
    public void gerarRelatorio() {
        // Lógica para gerar um relatório
    }
    
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: " + this.salario);
        System.out.println("Turno: " + this.turno);
        System.out.println("Setor Responsável: " + this.setorResponsavel);
    }
}
