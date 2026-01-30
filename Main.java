import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Estoque est = new Estoque();

        //Produtos de teste
        est.adicionarProduto(new Produto(1, "Teclado", 10, 150.0));
        est.adicionarProduto(new Produto(2, "Mouse", 20, 80.0));
        est.adicionarProduto(new Produto(3, "Monitor", 5, 900.0));

        loop:
        while (true) {
            System.out.println("(1) Listar produtos");
            System.out.println("(2) Buscar produto");
            System.out.println("(3) Remover produto");
            System.out.println("(0) Sair");

            int op = input.nextInt();

            switch (op) {
                case 1:
                    est.listarProdutos();
                    break;

                case 2:
                    System.out.print("Digite o Id:");
                    int idBusca = input.nextInt();
                    Produto produto = est.buscarProduto(idBusca);

                    if (produto != null) {
                        System.out.println(produto.getResumo());
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID: ");
                    int idRemove = input.nextInt();
                    boolean removido = est.removerProduto(idRemove);

                    if (removido) {
                        System.out.println("Produto removido com sucesso.");
                    } else {
                        System.out.println("Erro: produto não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break loop;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        input.close();
    }
}
