import java.util.List;
import java.util.ArrayList;

public class Estoque {
    // atributos
    private List<Produto> produtos;
    private List<Produto> lixeira;

    // construtor
    public Estoque(){
        this.produtos = new ArrayList<>();
        this.lixeira = new ArrayList<>();
    }
    
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public boolean removerProduto(int id){
        for(Produto p : produtos) {
            if (p.getId() == id) {
                produtos.remove(p);
                lixeira.add(p);
                return true;
            }
        }
        return false;
    }

    public void listarProdutos(){
        for(Produto p : produtos) {
            System.out.println(p.getResumo());
        }
    }

    public Produto buscarProduto(int id){
    for (Produto p : produtos) {
        if (p.getId() == id) {
            return p;
        }
    }
    return null;
    }
}
