public abstract class Pessoa implements Entidade{
    protected String nome;
    protected int idade;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

}
