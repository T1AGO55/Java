import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();
        String escolha;
        String nome;
        double preco;
        int quantidadeEstoque;

        do {
            System.out.print("Nome do Produto: ");
            nome = scanner.nextLine();

            System.out.print("Quantidade em estoque: ");
            quantidadeEstoque = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Preco do produto: ");
            preco = scanner.nextDouble();
            scanner.nextLine();


            Produto produto = new Produto(nome, quantidadeEstoque, preco);
            produtos.add(produto);

            System.out.println("\n|=====================================|");
            System.out.println("Deseja cadastrar outro produto?");
            System.out.println("(1 - SIM) (2 - NAO)");
            escolha = scanner.nextLine().trim().toUpperCase();
            System.out.println("\n|=====================================|");
        }while (escolha.equals("1")|| escolha.equals("SIM"));


        List<Produto> produtosComEstoque = produtos.stream().filter(Produto::estaEmEstoque).sorted(Comparator.comparingDouble(Produto::getPreco)).toList();

    produtosComEstoque.forEach(produto -> System.out.println("Nome: "+ produto.getNome()+ " | Quantidade em Estoque: "+ produto.getQuantidadeEstoque()+ " | Preco: R$"+produto.getPreco()));






scanner.close();
}
}