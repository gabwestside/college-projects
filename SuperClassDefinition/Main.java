import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	System.out.println("Seleção de Bolsistas para Disciplinas de"
			+ "Engenharia de Energias (use virgula em decimais)\n\n");
		
	Scanner dados;
	EstudanteGraduacao estudante1 = new EstudanteGraduacao();
	
	//CADASTRO DO CANDIDATO
	System.out.println("Nome do(a) ou nome social do estudante");
	dados = new Scanner(System.in);
		estudante1.nome = dados.next();
		
	System.out.println("Matricula do(a) estudante");
	dados = new Scanner(System.in);
		estudante1.matricula = dados.nextInt();
	
	System.out.println("CPF do(a) estudante");
	dados = new Scanner(System.in);
		estudante1.CPF = dados.nextInt();

  System.out.println("Endereço do(a) estudante");
	dados = new Scanner(System.in);
		estudante1.endereco = dados.next();

  System.out.println("Renda familiar do(a) estudante");	
	dados = new Scanner(System.in);
		estudante1.renda_familiar = dados.next();
    
  System.out.println("Curso do(a) estudante");	
	dados = new Scanner(System.in);
		estudante1.curso = dados.next();
    
	System.out.println("IDE do(a) estudante:");	
	dados = new Scanner(System.in);
		estudante1.ide = dados.nextFloat();
	
	System.out.println("Carga horaria do curso do estudante:");	
	dados = new Scanner(System.in);
		estudante1.carga_horaria = dados.nextFloat();
	
	System.out.println("Qual o status do(a) estudante?\n digite (true) para ativo, ou (false) para inativo");	
	dados = new Scanner(System.in);
		estudante1.status = dados.nextBoolean();
	
	estudante1.Info();
	System.out.println("\n");
	
	
	//Utilizar o Simulador De seleção
	TestesEstudantes selec = new TestesEstudantes();
	selec.selecao1(estudante1);//primeira etapa de seleção
	selec.concorrentes();//simular concorrentes
	selec.selecao2(estudante1);//segunda etapa de seleção
	}
}
