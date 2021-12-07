import java.util.Random;
import java.util.Scanner;

public class SimuladorDeSelecao {
	
	//informa��es para a sele��o
	float[] notas = new float[8];// vetor que guarda as notas dos concorrentes
	float[] ides = new float [8];//vetor que guarda os ide's dos concorrentes
	boolean candidato = true;//ainda pode ser candidato?? ao longo das selecoes esse boolean pode se tornar false
	
	//primeira etapa da sele��o
	void selecao1(Estudante estudante) {
		if(estudante.semestre == 1){//n�o pode estar no primeiro semestre
			System.out.println("nao podem participar da selecao alunos do primeiro semestre");
			candidato = false;
		}
/*			else if(estudante.reprovacao == "s"){//n�o pode ter reprovado em qualquer disciplina
				System.out.println("Desclassificado");
				candidato = false;
			}
*/
			else if(estudante.status == false){//não pode estar inativo
				System.out.println("Desclassificado");
				candidato = false;
			}
			else if(estudante.nota_da_disciplina < 7){// não pode ter ficado na af da diciplina que concorre
				System.out.println("Desclassificado");
				candidato = false;
			}
	}
	//simular concorrentes
	void concorrentes() {
		if(candidato) {
			Random dados = new Random();
			Estudante estudante2 = new Estudante();
			
			estudante2.ide = dados.nextInt(3);
			estudante2.ide += 7;
			estudante2.ide += dados.nextFloat();
			ides[0] = estudante2.ide;

			estudante2.nota_da_disciplina = dados.nextInt(3);
			estudante2.nota_da_disciplina += 7;
			estudante2.nota_da_disciplina += dados.nextFloat();
			notas[0] = estudante2.nota_da_disciplina;
			
			Estudante estudante3 = new Estudante();
			
			estudante3.ide = dados.nextInt(3);
			estudante3.ide += 7;
			estudante3.ide += dados.nextFloat();
			ides[1] = estudante3.ide;
			
			estudante3.nota_da_disciplina = dados.nextInt(3);
			estudante3.nota_da_disciplina += 7;
			estudante3.nota_da_disciplina += dados.nextFloat();
			notas[1] = estudante3.nota_da_disciplina;

			Estudante estudante4 = new Estudante();
			
			estudante4.ide = dados.nextInt(3);
			estudante4.ide += 6.5;
			estudante4.ide += dados.nextFloat();
			ides[2] = estudante4.ide;
			
			estudante4.nota_da_disciplina = dados.nextInt(3);
			estudante4.nota_da_disciplina += 6.5;
			estudante4.nota_da_disciplina += dados.nextFloat();
			notas[2] = estudante4.nota_da_disciplina;
			
			Estudante estudante5 = new Estudante();
			
			estudante5.ide = dados.nextInt(3);
			estudante5.ide += 6;
			estudante5.ide += dados.nextFloat();
			ides[3] = estudante5.ide;
			
			estudante5.nota_da_disciplina = dados.nextInt(3);
			estudante5.nota_da_disciplina += 6;
			estudante5.nota_da_disciplina += dados.nextFloat();
			notas[3] = estudante5.nota_da_disciplina;
		}
	}
	//segunda etapa da sele��o
	void selecao2(Estudante estudante) {
		if(estudante.n_vagas == 1) {
			for(int i=0; i<8; i++) {
				if(estudante.nota_da_disciplina < notas[i]) {//se um concorrente tiver nota maior que o candidato
					System.out.println("Nao foi selecionado(a)");
					break;
				}
					else if(estudante.nota_da_disciplina == notas[i]) {//se as notas empatarem
						if(estudante.ide < ides[i]) {//se um concorrente tiver ide maior que o candidato
							System.out.println("Nao foi selecionado(a)");
							break;
						}
					}
					else if(i==7) {// se no final não ouve alguem melhor que o candidato
						System.out.println("\nSelecionado(a)! para 1 de 1 vaga(s)");
						estudante.bolsista = true;//candidato bolsista!
					}
				}//fim do for
			}//fim so if
		else{
			int sel = 0;//numero de concorrentes a frente do candidato
			for(int i=0; i<8; i++) {
				if(estudante.nota_da_disciplina < notas[i]) {// se um concorrente tiver nota melhor que o candidato
					sel++;// + um concorrente a frente

				}
					else if(estudante.nota_da_disciplina == notas[i]) {// se a nota empatar
						if(estudante.ide < ides[i]) {//se um concorrente tiver ide melhor que o candidato
							sel ++;// + um concorrente a frente
	
						}
					}
				}//fim do for
			
			if(sel < 2) {//se houver no m�ximo um concorrente a frente
			System.out.println("\nSelecionado(a)! para 1 de 2 vaga(s)");
			estudante.bolsista = true;//candidato bolsista!
			}
			else {//se houver mais de um concorrente a frente
			System.out.println("O(A) canidato(a) nao foi selecionado(a).");
			}
		}
	}

}