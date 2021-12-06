public class EstudanteGraduacao {
  // TODOS OS ATRIBUTOS
  String nome, endereco, atividade, curso;

  int matricula, CPF;// se estiver no primeiro semestre não está apto

  float ide, renda_familiar, carga_horaria;

  boolean status = true, bolsista = false;// status ativo ou inativo

  // Mostrar informações cadastradas do candidato
  void Info() {
    System.out.println("Nome do estudante: " + nome);
    System.out.println("Matricula: " + matricula);
    // System.out.println("O CPF: " + CPF);
    System.out.println("Endereço: " + endereco);
    System.out.println("Renda familiar: " + renda_familiar);
    System.out.println("Curso: " + curso);
    System.out.println("Indice de Desenvolvimento do Estudante (IDE):" + ide);
    System.out.println("Carga horaria: " + carga_horaria);
  }
}
