public abstract class PessoaEx02 implements EntidadeEx02{

    protected String nome;
    protected int idade;

    public PessoaEx02(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    @Override
    public String getNome() {
        return nome;
    }

    public int getIdade(){
    return idade;
    }


}
