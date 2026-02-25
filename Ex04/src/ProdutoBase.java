public abstract class ProdutoBase implements Entidade{
    protected  String nome;
    protected int quantidadeEstoque;

    public ProdutoBase(String nome, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeEstoque += quantidadeEstoque;
    }


    @Override
    public String getNome() {
        return nome;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }





}
