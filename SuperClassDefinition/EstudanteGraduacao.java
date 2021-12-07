public class EstudanteGraduacao {
  public String nome, endereco, curso, atividade, CPF;
  public int matricula, qtd_disciplinas, escolha;
  public float ide, renda_familiar, carga_horaria;
  public boolean status = true, bolsista = false;

  public void Selecao() {
    switch (escolha) {
      case 1:
        System.out.println("Bolsista");
        break;
      case 2:
        System.out.println("Auxilio Alimentação");
        break;
      case 3:
        System.out.println("Auxilio Transporte");
        break;
      default:
        System.out.println("Opção não encontrada. Tente novamente");
        break;
    }
  }

  public void Info() {
    System.out.println("Nome do estudante: " + nome);
    System.out.println("Matricula: " + matricula);
    System.out.println("O CPF: " + CPF);
    System.out.println("Endereço: " + endereco);
    System.out.println("Renda familiar: " + renda_familiar);
    System.out.println("Curso: " + curso);
    System.out.println("Indice de Desenvolvimento do Estudante (IDE):" + ide);
    if (status == true) {
      atividade = "Matriculado em todas as cadeiras do semestre";
    } else {
      atividade = "Não matriculado em todas as cadeiras do semestre";
    }
    System.out.println("Status: " + atividade);

    System.out.println("Carga horaria: " + carga_horaria);
  }
}
