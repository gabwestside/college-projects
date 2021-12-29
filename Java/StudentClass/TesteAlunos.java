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

    for (int i = 1; i <= n; i++) {
      System.out.println("Digite os dados do(a) estudante #" + i);

      System.out.print("Nome e/ou nome social do(a) estudante (somente o primeiro nome): ");
      String nome = dados.next();

      System.out.print("Matricula: ");
      int matricula = dados.nextInt();

      System.out.print("CPF: ");
      String cpf = dados.next();

      System.out.print("Municipio: ");
      String municipio = dados.next();

      System.out.print(
          "Renda familiar do(a) estudante (use virgulas com duas casas decimais): ");
      dados = new Scanner(System.in);
      float rendaFamiliar = dados.nextFloat();

      System.out.print("Curso do(a) estudante: ");
      String curso = dados.next();

      System.out.print("IDE do(a) estudante: ");
      dados = new Scanner(System.in);
      float ide = dados.nextFloat();

      System.out.print("Carga horaria do curso do estudante (horas): ");
      dados = new Scanner(System.in);
      float cargaHoraria = dados.nextFloat();

      System.out.print(
          "Você está matriculado em todas as diciplinas neste semestre?\n digite (true) para sim, ou (false) para não: ");
      dados = new Scanner(System.in);
      boolean status = dados.nextBoolean();

      System.out.print(
          "\nQual programa de incetivo ira participar? Digite o numero da opcao\n" +
              "1 - Bolsista \n" +
              "2 - Auxilio Alimentação \n" +
              "3 - Auxilio Transporte \n" +
              "\nEscolha: ");
      dados = new Scanner(System.in);
      int escolha = dados.nextInt();

      list.add(
          new AlunoGrad(nome, matricula, cpf, municipio, rendaFamiliar, curso, ide, cargaHoraria, status, escolha));
        
      System.out.print("\n");
    }
    numeroArray.close();
    dados.close();

    AlunoGrad concorrentes = new AlunoGrad();
    concorrentes.Concorrentes();

    for (Aluno estudante : list) {
      if (estudante.getEscolha() == 1) {
        estudante.SelecaoIDE();
      } else if (estudante.getEscolha() == 2) {
        estudante.AuxilioAlimentacao();
      } else if (estudante.getEscolha() == 3) {
        estudante.AuxilioTransporte();
      } else {
        System.out.println("Opção não encontrada. Tente novamente");
      }
    }

    for (Aluno aluno : list) {
      System.out.println(
          "\nNome: " + aluno.getNome()
              + "\nMatricula: " + aluno.getMatricula()
              + "\nCPF: " + aluno.getCPF()
              + "\nMunicipio: " + aluno.getMunicipio()
              + "\nRenda Familiar: " + aluno.getRendaFamiliar()
              + "\nCurso: " + aluno.getCurso()
              + "\nIndice de Desenvolvimento do Estudante (IDE): " + aluno.getIde());
      if (aluno.getStatus() == true) {
        System.out.println("Matriculado em todas as cadeiras do semestre");
      } else {
        System.out.println("Não matriculado em todas as cadeiras do semestre");
      }
    }
  }
}