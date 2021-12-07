import java.util.Scanner;

public class TesteEstudante {
public static void main(String[] args) {
	System.out.println("Seleção de Monitoria para Disciplinas de"
			+ "Engenharia de Energias (use virgula em decimais)\n\n");
		
	Scanner dados;
	Estudante estudante1 = new Estudante();
	
	
	//CADASTRO DO CANDIDATO
	System.out.println("Nome do(a) estudante");
	dados = new Scanner(System.in);
		estudante1.nome = dados.next();
		
	System.out.println("Matricula do(a) estudante");
	dados = new Scanner(System.in);
		estudante1.matricula = dados.nextInt();
	
/*	System.out.println("Reprovou cadeiras no semestre anterior: s/n?");
	dados = new Scanner(System.in);
		estudante1.reprovacao = dados.next();
*/
		
	System.out.println("A quantos semestres o(a) estudante está na instituicao?");	
	dados = new Scanner(System.in);
		estudante1.semestre = dados.nextInt();

	System.out.println("Concorrer a monitoria de qual disciplina? Digite o numero da opcao\n" +
	"1- Ciência dos Materiais (2vagas)\n" + "2- FíSICA I (2vagas)\n" +
	"3- Química II (2vaga)\n" + "4- Calculo II (2vaga)\n" +
	"5- Eletromagnetismo (3vaga)\n" + "6- Equações Diferenciais I (3vaga)\n" +
	"7- Calculo Vetorial (2vaga)\n" + "8- Engenharia do Meio Ambiente (2vaga)\n" +
	"9- Circuitos Elétricos I (4vaga)\n" + "10- Laboratório DE Circuitos Elétricos I (1vaga)\n" +
	"11- Laboratório de Ciência dos Materiais (2vaga)\n" );
	dados = new Scanner(System.in);
		estudante1.n_disciplina = dados.nextInt();
		estudante1.Disciplina();
	
	System.out.println("IDE do(a) estudante:");	
	dados = new Scanner(System.in);
		estudante1.ide = dados.nextFloat();
	
	System.out.println("Nota do(a) estudante na diciplina escolhida:");	
	dados = new Scanner(System.in);
		estudante1.nota_da_disciplina = dados.nextFloat();
	
	System.out.println("Qual o status do(a) estudante?\n digite (true) para ativo, ou (false) para inativo");	
	dados = new Scanner(System.in);
		estudante1.status = dados.nextBoolean();
	
	estudante1.Info();
	System.out.println("\n");
	
	
	//Utilizar o Simulador De seleção
	SimuladorDeSelecao selec = new SimuladorDeSelecao();
	selec.selecao1(estudante1);//primeira etapa de seleção
	selec.concorrentes();//simular concorrentes
	selec.selecao2(estudante1);//segunda etapa de seleção
	}
}
