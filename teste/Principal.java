//Beatriz Alonso de Lima Soares
//João Paulo Leal Martins
//Marcos Pedro Maciel Ramalho

package teste;
import vender.*;
import java.util.Scanner;
import pessoas.*;

public class Principal {
    public static void main(String[] agrs){
        Scanner teclado = new Scanner(System.in);
        Caixa caixa1 = leCriaCaixa(teclado);

        while (true){
            System.out.println("Digite: \n1 - para nova compra\n0 - para sair");
            int opcao = teclado.nextInt();
            teclado.nextLine();
            if (opcao == 0){
                break;
            } else if (opcao == 1){
                Cliente cliente = leCriaCliente(teclado);
                
                System.out.println("Digite a data e hora da compra (formato DD.MM.AAAA HH:MM):");
                String dataHora = teclado.nextLine();
                Venda venda = new Venda(dataHora);
                venda.exibirListaProdutosDisponiveis();

                boolean compraConcluida = adicionarRemoverProdutos(venda, caixa1, cliente, teclado);

                if (compraConcluida) {
                    caixa1.emitirRecibo(venda);
                    caixa1.somarValorTotalTotal(venda.getValorTotal());
                    if (cliente.getCartao().tipoCartao()) {
                        System.out.println("Limite atual do cartão de crédito após a compra: R$ " + cliente.getCartao().getLimite());
                    } else {
                        System.out.println("Saldo disponível do cartão de débito após a compra: R$ " + cliente.getCartao().getSaldoDisponivel());
                    }
                }
            }
        }
        System.out.println("Encerrando o sistema. Lucro total do dia:");
        caixa1.mostrarLucro();
        
        teclado.close();
    }
    
    public static boolean adicionarRemoverProdutos(Venda venda, Caixa caixa1, Cliente cliente, Scanner teclado){
        while (true){
            System.out.println("\n\n\nDigite: \n1 - para adicionar um produto\n2 - para remover um produto\n3 - para ver a lista de produtos disponiveis novamente\n0 para finalizar:");
            int opcao = teclado.nextInt();
            teclado.nextLine();
            if (opcao == 0){
                venda.calcularTotal(); // Garante que o total está atualizado
                if (venda.getValorTotal() > 0) {
                    if (cliente.realizarPagamento(venda.getValorTotal())){
                        System.out.println("Pagamento realizado com sucesso.\n\n");
                        return true; // Compra concluída com sucesso
                    } else {
                        System.out.println("Falha no pagamento. Compra cancelada.");
                        return false; // Compra cancelada
                    }
                } else {
                    System.out.println("Carrinho vazio. Compra cancelada.");
                    return false; // Compra cancelada
                }
            } else if (opcao == 1){
                System.out.println("Digite o código do produto a adicionar:");
                int codigo = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Digite a quantidade do produto:");
                int quantidade = teclado.nextInt();
                teclado.nextLine();
                venda.adicionarProduto(codigo, quantidade);
                venda.exibirCarrinho();
            } else if (opcao == 2){
                venda.exibirCarrinho();
                System.out.println("Digite o código do produto a remover:");
                int codigo = teclado.nextInt();
                teclado.nextLine();
                venda.removerProduto(codigo);
                venda.exibirCarrinho();
            } else if (opcao == 3){
                venda.exibirListaProdutosDisponiveis();
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static Cliente leCriaCliente(Scanner teclado){
        System.out.println("Digite o telefone do cliente:");
        String telefone = teclado.nextLine();
        System.out.println("Digite o CPF do cliente:");
        String cpf = teclado.nextLine();
        System.out.println("Digite o email do cliente:");
        String email = teclado.nextLine();
        System.out.println("\n\n");
        CartaoBanco cartao = leCriaCartaoBanco(teclado);
        
        return new Cliente(telefone, cpf, cartao);
    }
    
    public static Caixa leCriaCaixa(Scanner teclado){
        System.out.println("Digite o telefone do caixa:");
        String telefone = teclado.nextLine();
        System.out.println("Digite o CPF do caixa:");
        String cpf = teclado.nextLine();
        System.out.println("Digite o número do caixa:");
        int numeroCaixa = Integer.parseInt(teclado.nextLine());
        System.out.println("\n\n");
        return new Caixa(telefone, cpf, numeroCaixa);
    }
    
    public static CartaoBanco leCriaCartaoBanco(Scanner teclado){
        System.out.println("Digite o número do cartão:");
        String numeroCartao = teclado.nextLine();
        
        System.out.println("Digite o tipo do cartão (1 para crédito, 0 para débito):");
        int tipoInt = Integer.parseInt(teclado.nextLine());
        boolean tipoCartao = (tipoInt == 1);
        
        if (tipoCartao) {
            System.out.println("Digite o limite do cartão:");
            double limite = Double.parseDouble(teclado.nextLine());
            System.out.println("\n\n");
            return new CartaoBanco(numeroCartao, limite, 0);
        }
        else {
            System.out.println("Digite o saldo inicial do cartão:");
            double saldoInicial = Double.parseDouble(teclado.nextLine());
            System.out.println("\n\n");
            return new CartaoBanco(numeroCartao, saldoInicial);
        }
    }
}