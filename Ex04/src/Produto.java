public class Produto extends ProdutoBase{
    private double preco;

    public Produto(String nome, int quantidadeEstoque,double preco) {
        super(nome,quantidadeEstoque);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public boolean estaEmEstoque(){
        if (quantidadeEstoque > 0){
            return true;
        }else{
            return false;
        }


    }
}
