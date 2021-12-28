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
      System.out.println("Nome e/ou nome social do(a) estudante");
      String nome = dados.next();

      System.out.println("Endereço do(a) estudante");
      String endereco = dados.next();

      System.out.println("CPF do(a) estudante");
      String cpf = dados.next();

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
          "Você está matriculado em todas as diciplinas?\n digite (true) para sim, ou (false) para não");
      dados = new Scanner(System.in);
      boolean status = dados.nextBoolean();

      System.out.println(
          "Qual programa de incetivo ira participar? Digite o numero da opcao\n" +
              "1 - Bolsista \n" +
              "2 - Auxilio Alimentação \n" +
              "3 - Auxilio Transporte \n");
      dados = new Scanner(System.in);
      int escolha = dados.nextInt();
      // estudante.Selecao();

      System.out.println("\n");
      // estudante.Info();
      System.out.println("\n");
      System.out.println("Resultado da seleção:");
      // TestesEstudantes selec = new TestesEstudantes();
      // selec.concorrentes();

      // if (estudante.escolha == 1) {
      //   selec.selecaoIDE(estudante);
      // } else if (estudante.escolha == 2) {
      //   selec.AuxilioAlimentacao(estudante);
      // } else if (estudante.escolha == 3) {
      //   selec.AuxilioTransporte(estudante);
      // } else {
      //   System.out.println("Opção não encontrada. Tente novamente");
      // }

      // list.add(new AlunoGrad(Nome, Endereco, Curso, CPF, Municipio));
    }
      numeroArray.close();
      dados.close();

    for(Aluno aluno:list){
        System.out.println("\nNome: " + aluno.getNome()
            + "\nEndereço: " + aluno.getEndereco()
            + "\nCurso: " + aluno.getCurso()
            + "\nCPF: " + aluno.getCPF()
            + "\nMunicipio: " + aluno.getMunicipio());
      }
  }
}
