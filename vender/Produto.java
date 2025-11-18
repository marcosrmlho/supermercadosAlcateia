//Beatriz Alonso de Lima Soares
//João Paulo Leal Martins
//Marcos Pedro Maciel Ramalho

package vender;
public enum Produto {
    LEITE("Leite", 5.00, 1),
    CHOCOLATE("Chocolate", 10.00, 2),
    CARNE("Carne Moída", 20.00, 3),
    PAO("Pão", 5.00, 4),
    ARROZ("Arroz", 20.00, 5),
    FEIJAO("Feijão", 8.00, 6),
    MIOJO("Miojo", 4.50, 7),
    OVO("Ovo", 12.00, 8),
    QUEIJO("Queijo", 15.00, 9),
    IOGURTE("Iogurte", 6.00, 10),
    SUCO("Suco", 4.00, 11),
    AGUA("Água", 2.50, 12),
    SABAO("Sabão", 3.75, 13),
    SAL("Sal", 3.50, 14),
    MACARRAO("Macarrão", 7.00, 15),
    FRANGO("Frango", 18.00, 16),
    PEIXE("Peixe", 22.00, 17),
    MANTEIGA("Manteiga", 7.50, 18);

    private final String nome;
    private final double preco;
    private final int codigo;

    Produto(String nome, double preco, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public static Produto buscarPorCodigo(int codigo) {
        for (Produto p : Produto.values()) {
            if (p.codigo == codigo) {
                return p;
            }
        }
        return null;
    }

    public static void listarProdutos() {
        System.out.println("\n=== PRODUTOS DISPONÍVEIS ===");
        for (Produto p : Produto.values()) {
            System.out.println(p.codigo + " - " + p.nome + " | R$ " + p.preco);
        }
        System.out.println("============================\n");
    }
}