import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainFuncionariosEx02 {

     public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        ArrayList<FuncionarioEx02> funcionarios = new ArrayList<>();

        String escolha;
        String nome;
        int idade;
        double salario;


    do {
        System.out.print("Digite o nome do Funcionario: ");
        nome = scanner.nextLine();

        System.out.print("Digite a idade do Funcionario: ");
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o salario do Funcionario: ");
        salario = scanner.nextDouble();
        scanner.nextLine();

        FuncionarioEx02 funcionario = new FuncionarioEx02(nome, idade, salario);
        funcionarios.add(funcionario);

        System.out.println("Deseja cadastrar outro Funcionario?");
        System.out.println("(1-SIM) (2-NAO)");
        escolha = scanner.nextLine().trim().toUpperCase();

    }while(escolha.equals("1")|| escolha.equals("SIM"));

    List<FuncionarioEx02> funcionarios5000 = funcionarios.stream().filter(f -> f.getSalario() > 5000).sorted(Comparator.comparingDouble(FuncionarioEx02::getSalario).reversed()).toList();

    funcionarios5000.forEach(f -> System.out.println("Nome: "+ f.getNome()+ " | Idade: "+ f.getIdade()+ " | Salario: R$"+f.getSalario()));


scanner.close();

    }



}