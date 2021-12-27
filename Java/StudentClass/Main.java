import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println(
      "Seleção de bolsistas para disciplina de Engenharia de Energias!\n"
    );

    Scanner dados;
    AlunoGrad estudante = new AlunoGrad("nome", "endereco", "curso", "cpf", "municipio");

    System.out.println("Nome e/ou nome social do(a) estudante");
    dados = new Scanner(System.in);
    estudante.Nome = dados.next();

    // System.out.println("Matricula do(a) estudante");
    // dados = new Scanner(System.in);
    // estudante.Matricula = dados.nextInt();

    System.out.println("CPF do(a) estudante");
    dados = new Scanner(System.in);
    estudante.CPF = dados.next();

    System.out.println("Endereço do(a) estudante");
    dados = new Scanner(System.in);
    estudante.Endereco = dados.next();

    // System.out.println(
    //   "Renda familiar do(a) estudante (use virgulas com duas casas decimais)"
    // );
    // dados = new Scanner(System.in);
    // estudante.Renda_Familiar = dados.nextFloat();

    System.out.println("Curso do(a) estudante");
    dados = new Scanner(System.in);
    estudante.Curso = dados.next();

    // System.out.println("IDE do(a) estudante");
    // dados = new Scanner(System.in);
    // estudante.ide = dados.nextFloat();

    // System.out.println("Carga horaria do curso do estudante (horas)");
    // dados = new Scanner(System.in);
    // estudante.carga_horaria = dados.nextFloat();

    // System.out.println(
    //   "Você está matriculado em todas as diciplinas?\n digite (true) para sim, ou (false) para não"
    // );
    // dados = new Scanner(System.in);
    // estudante.status = dados.nextBoolean();

    // System.out.println(
    //   "Qual programa de incetivo ira participar? Digite o numero da opcao\n" +
    //   "1 - Bolsista \n" +
    //   "2 - Auxilio Alimentação \n" +
    //   "3 - Auxilio Transporte \n"
    // );
    // dados = new Scanner(System.in);
    // estudante.escolha = dados.nextInt();
    // estudante.Selecao();

    // System.out.println("\n");
    // estudante.Info();
    // System.out.println("\n");
    // System.out.println("Resultado da seleção:");
    // AlunoGrad selec = new AlunoGrad();
    
  }
}
