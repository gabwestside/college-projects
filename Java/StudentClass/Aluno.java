public abstract class Aluno {
  public String Nome, Endereco, Curso, CPF, Municipio;
  // public int Matricula, QTD_Disciplinas, Escolha;
  // public float Ide, Renda_Familiar, Carga_Horaria;

  // public Aluno(String nome, String endereco, String curso, String CPF, String municipio,
  //     int matricula, int qtd_disciplinas, int escolha,
  //     float ide, float renda_familiar, float carga_horaria) {
  //   setNome(nome);
  //   setEndereco(endereco);
  //   setCurso(curso);
  //   setCPF(CPF);
  //   setMunicipio(municipio);
  //   // setMatricula( matricula );
  //   // setQtdMatricula( qtd_disciplinas );
  //   // setEscolha( escolha );
  //   // setIde( ide );
  //   // setRendaFamiliar( renda_familiar );
  //   // setCargaHoraria( carga_horaria );
  // }
  
  public Aluno(String nome, String endereco, String curso, String cpf, String municipio) {
    setNome(nome);
    setEndereco(endereco);
    setCurso(curso);
    setCPF(cpf);
    setMunicipio(municipio);
  }

  public void setNome(String nome) {
    Nome = nome;
  }

  public String getNome() {
    return Nome;
  }

  public void setEndereco(String endereco) {
    Endereco = endereco;
  }

  public String getEndereco() {
    return Endereco;
  }

  public void setCurso(String curso) {
    Curso = curso;
  }

  public String getCurso() {
    return Curso;
  }

  public void setCPF(String cpf) {
    CPF = cpf;
  }

  public String getCPF() {
    return CPF;
  }

  public void setMunicipio(String municipio) {
    Municipio = municipio;
  }

  public String getMunicipio() {
    return Municipio;
  }

  // public void Selecao() {
  //   switch (Escolha) {
  //     case 1:
  //       System.out.println("Bolsista");
  //       break;
  //     case 2:
  //       System.out.println("Auxilio Alimentação");
  //       break;
  //     case 3:
  //       System.out.println("Auxilio Transporte");
  //       break;
  //     default:
  //       System.out.println("Opção não encontrada. Tente novamente");
  //       break;
  //   }
  // }

  // public void Info() {
  //   System.out.println("Nome do estudante: " + nome);
  //   System.out.println("Matricula: " + matricula);
  //   System.out.println("O CPF: " + CPF);
  //   System.out.println("Endereço: " + endereco);
  //   System.out.println("Renda familiar: " + renda_familiar);
  //   System.out.println("Curso: " + curso);
  //   System.out.println("Indice de Desenvolvimento do Estudante (IDE):" + ide);

  //   System.out.println("Carga horaria: " + carga_horaria);
  // }
}
