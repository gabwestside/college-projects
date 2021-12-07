public class Estudante {
//TODOS OS ATRIBUTOS
String nome, disciplina, atividade, reprovacao;

int matricula, semestre, n_disciplina, n_vagas=1;// se estiver no primeiro semestre não está apto

float ide, nota_da_disciplina;

boolean status = true, bolsista = false;// status ativo ou inativo

	
	void Disciplina() {
		switch(n_disciplina) {
			case 1:
				disciplina = "Ciência dos Materiais";
				break;
			case 2:
				disciplina = "Física I";
				break;
			case 3:
				disciplina = "Química II";
				break;
			case 4:
				disciplina = "Calculo II";
				break;
			case 5:
				disciplina = "Eletromagnetismo";
				break;
			case 6:
				disciplina = "Equações Diferenciais I";
				break;
			case 7:
				disciplina = "Calculo Vetorial";
				break;
			case 8:
				disciplina = "Engenharia do Meio Ambiente";
				break;
			case 9:
				disciplina = "Circuitos Elétricos I";
				break;
			case 10:
				disciplina = "Laboratório DE Circuitos Elétricos I";
				break;
			case 11:
				disciplina = "Laboratório de Ciência dos Materiais";
				break;
			default:
				System.out.println("Disciplina Não encontrada. Tente novamente");
				break;

		}
	}
	
	//Mostrar informações cadastradas do candidato
	void Info() {
	System.out.println("Nome do estudante:" + nome);
	System.out.println("Matricula:"+ matricula);
	System.out.println("A"+semestre+" semestre(s) na instituicao");
	System.out.println("Indice de Desenvolvimento do Estudante (IDE):"+ide);
		if(status == true) {
			atividade = "Ativo";
		}
		else {
			atividade = "Inativo";
		}
		System.out.println("Status:" + atividade);
		System.out.println("Ultima nota na disciplina" + ": " + nota_da_disciplina);
		
	}
}
