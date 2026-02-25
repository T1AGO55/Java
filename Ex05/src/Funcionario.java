public class Funcionario extends Pessoa{
    private double salario;
    private String departamento;

    public Funcionario(int idade, String nome, double salario, String departamento) {
        super(idade, nome);
        this.salario = salario;
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    public String getDepartamento() {
        return departamento;
    }
}
