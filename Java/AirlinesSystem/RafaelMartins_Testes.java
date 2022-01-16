import java.util.Scanner;
import java.util.ArrayList;

public class RafaelMartins_Testes {

  public static void main(String[] args) {
    ArrayList<RafaelMartins_Superclasse> list = new ArrayList<RafaelMartins_Superclasse>();
    Scanner dados = new Scanner(System.in);

    System.out.print("Entre com o numero de passagens a serem compradas: ");
    Scanner numeroArray = new Scanner(System.in);
    int n = numeroArray.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println(
          "\nAirlines System\n");

      System.out.print("Destino: ");
      String destino = dados.next();

      System.out.print("Partida: ");
      String partida = dados.next();

      System.out.print("Primeiro Nome: ");
      String nome = dados.next();

      System.out.print("Sobrenome: ");
      String sobrenome = dados.next();

      System.out.print("CPF: ");
      String cpf = dados.next();

      System.out.print(
          "\nQual tipo de passagem a ser comprada?\n" +
              "1 - Economica \n" +
              "2 - Excutiva \n" +
              "\nEscolha: ");
      dados = new Scanner(System.in);
      int escolha = dados.nextInt();

      list.add(new RafaelMartins_Subclasse1(nome, destino, cpf, partida, sobrenome, escolha));
    }

    numeroArray.close();
    dados.close();

    for (RafaelMartins_Superclasse client : list) {
      System.out.println(
          "\nNome: " + client.getNome()
              + "\nSobrenome: " + client.getSobrenome()
              + "\nCPF: " + client.getCPF()
              + "\nDestino: " + client.getDestino()
              + "\nLocal de Partida: " + client.getPartida());

      if (client.getEscolha() == 1) {
        System.out.println("Compra de passagem ECONOMICA");
      } else {
        System.out.println("Compra de passagem EXECUTIVA");
      }
    }
  }
}