import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        String nome;
        int idade;
        double salario;
        String departamento;
        String escolha;

        do {
            System.out.print("Nome: ");
            nome = scanner.nextLine();

            System.out.print("Idade: ");
            idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Salario: R$");
            salario = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Departamento: ");
            departamento = scanner.nextLine().toUpperCase();

            Funcionario funcionario = new Funcionario(idade, nome, salario, departamento);
            funcionarios.add(funcionario);


            System.out.println("\n+=======================================+");
            System.out.println("Deseja cadastrar outro funcionario?");
            System.out.println("(1 - SIM) (2 - NAO)");
            escolha = scanner.nextLine().trim().toUpperCase();

        } while (escolha.equals("1") || escolha.equals("SIM"));

        Map<String, List<Funcionario>> funcionariosAgrupados = funcionarios.stream().filter(funcionario -> funcionario.getSalario() > 2000 && funcionario.getSalario() < 5000).collect(Collectors.groupingBy(Funcionario::getDepartamento));

        funcionariosAgrupados.forEach((depart, lista) -> {
            System.out.println("\nDepartamento: " + depart);
            lista.forEach(funcionario -> System.out.println("Nome: " + funcionario.getNome() + " | Salario: R$" + funcionario.getSalario()));
        });


        scanner.close();
    }
}