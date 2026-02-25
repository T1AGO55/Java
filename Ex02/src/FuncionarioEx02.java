public class FuncionarioEx02 extends PessoaEx02 {

    private double salario;

    public FuncionarioEx02(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }


    @Override
    public int getIdade() {
        return super.getIdade();
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
}
