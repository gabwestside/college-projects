import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Collections;

public class TesteAlunos {

  public static void main(String[] args) {
    ArrayList<Aluno> list = new ArrayList<Aluno>();
    Scanner dados = new Scanner(System.in);

    System.out.println(
        "\nSeleção de Auxilios e Bolsas UNILAB!\n");

    System.out.print("Entre com o numero de alunos a serem cadastrados: ");
    Scanner numeroArray = new Scanner(System.in);
    int n = numeroArray.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.println("Digite os dados do(a) estudante");

      System.out.println("Nome e/ou nome social do(a) estudante");
      String nome = dados.next();

      System.out.println("Matricula do(a) estudante");
      int matricula = dados.nextInt();

      System.out.println("CPF do(a) estudante");
      String cpf = dados.next();

      // System.out.println("Endereço do(a) estudante");
      // String endereco = dados.next();

      System.out.println("Municipio do(a) estudante");
      String municipio = dados.next();

      System.out.println(
          "Renda familiar do(a) estudante (use virgulas com duas casas decimais)");
      dados = new Scanner(System.in);
      float rendaFamiliar = dados.nextFloat();

      System.out.println("Curso do(a) estudante");
      String curso = dados.next();

      System.out.println("IDE do(a) estudante");
      dados = new Scanner(System.in);
      float ide = dados.nextFloat();

      System.out.println("Carga horaria do curso do estudante (horas)");
      dados = new Scanner(System.in);
      float cargaHoraria = dados.nextFloat();

      System.out.println(
          "Você está matriculado em todas as diciplinas neste semestre?\n digite (true) para sim, ou (false) para não");
      dados = new Scanner(System.in);
      boolean status = dados.nextBoolean();

      System.out.println(
          "Qual programa de incetivo ira participar? Digite o numero da opcao\n" +
              "1 - Bolsista \n" +
              "2 - Auxilio Alimentação \n" +
              "3 - Auxilio Transporte \n");
      dados = new Scanner(System.in);
      int escolha = dados.nextInt();

      list.add(
          new AlunoGrad(nome, matricula, cpf, municipio, rendaFamiliar, curso, ide, cargaHoraria, status, escolha));
    }
    numeroArray.close();
    dados.close();

    for (Aluno aluno : list) {
      System.out.println("\nNome: " + aluno.getNome()
          + "\nCurso: " + aluno.getCurso()
          + "\nCPF: " + aluno.getCPF()
          + "\nMunicipio: " + aluno.getMunicipio());
    }
  }
}
