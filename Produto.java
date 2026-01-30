public class Produto {
    // atributos
    private int id;
    private String nome;
    private int quantidade;
    private double preco;

    // construtor
    public Produto(int id, String nome, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getResumo() {
        return id + " - " + nome + 
               " | Qtd: " + quantidade + 
               " | Preço: " + preco;
    }

    public void adicionarEstoque(int qtd) {
        this.quantidade += qtd;
    }

    public boolean removerEstoque(int qtd) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
            return true;
        }
        return false;
    }
}
