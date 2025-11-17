package pessoas;
public class Gerente extends Funcionario {
    private String setorResponsavel;
    //05.11.2025: criar um array de todos os caixas existentes do sistema, onde eles serao armazenados, 

    public Gerente(String nome, String cpf, double salario, String turno, String setorResponsavel) {
        super(nome, cpf, salario, turno);
        this.setorResponsavel = setorResponsavel;
    }

    public void contratarCaixa() {
        // Lógica para contratar um caixa: verifica se o numero perguntas pra criar um caixa e inseri-lo no array de caixas, na ultima posição do array.
    }
    public void demitirCaixa() {
        // Lógica para demitir um funcionário, quando for demitir um caixa, exibe uma lista associando o nome de acordo com a posição do array. Ex.: 0-joao, 1-bia, 2-ramalho, aí a pessoa digita o numero correspondente para demitir.
    }
    public void gerarRelatorio() {
        // Lógica para gerar um relatório: mostra quantos caixas estão ativos. Exibe os dados do gerente e exibe os dados de todos os caixas ativos.
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
