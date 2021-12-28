public abstract class Aluno {
  private String Nome, Endereco, Curso, CPF, Municipio;
  private int Matricula, QTD_Disciplinas, Escolha;
  private float Ide, Renda_Familiar, Carga_Horaria;
  private boolean status = true, bolsista = false;

  // public Aluno(String nome, String endereco, String curso, String cpf, String municipio,
  //   int matricula, int qtd_disciplinas, int escolha,
  //   float ide, float renda_familiar) {
  //   setNome(nome);
  //   setEndereco(endereco);
  //   setCurso(curso);
  //   setCPF(cpf);
  //   setMunicipio(municipio);
  // }

  public Aluno(String Nome, String Endereco, String Curso, String CPF, String Municipio, int Matricula, int QTD_Disciplinas, int Escolha, float Ide, float Renda_Familiar, float Carga_Horaria, boolean status, boolean bolsista) {
    this.Nome = Nome;
    this.Endereco = Endereco;
    this.Curso = Curso;
    this.CPF = CPF;
    this.Municipio = Municipio;
    this.Matricula = Matricula;
    this.QTD_Disciplinas = QTD_Disciplinas;
    this.Escolha = Escolha;
    this.Ide = Ide;
    this.Renda_Familiar = Renda_Familiar;
    this.Carga_Horaria = Carga_Horaria;
    this.status = status;
    this.bolsista = bolsista;
  }

  public int getMatricula() {
    return this.Matricula;
  }

  public void setMatricula(int Matricula) {
    this.Matricula = Matricula;
  }

  public int getQTD_Disciplinas() {
    return this.QTD_Disciplinas;
  }

  public void setQTD_Disciplinas(int QTD_Disciplinas) {
    this.QTD_Disciplinas = QTD_Disciplinas;
  }

  public int getEscolha() {
    return this.Escolha;
  }

  public void setEscolha(int Escolha) {
    this.Escolha = Escolha;
  }

  public float getIde() {
    return this.Ide;
  }

  public void setIde(float Ide) {
    this.Ide = Ide;
  }

  public float getRenda_Familiar() {
    return this.Renda_Familiar;
  }

  public void setRenda_Familiar(float Renda_Familiar) {
    this.Renda_Familiar = Renda_Familiar;
  }

  public float getCarga_Horaria() {
    return this.Carga_Horaria;
  }

  public void setCarga_Horaria(float Carga_Horaria) {
    this.Carga_Horaria = Carga_Horaria;
  }

  public boolean isStatus() {
    return this.status;
  }

  public boolean getStatus() {
    return this.status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public boolean isBolsista() {
    return this.bolsista;
  }

  public boolean getBolsista() {
    return this.bolsista;
  }

  public void setBolsista(boolean bolsista) {
    this.bolsista = bolsista;
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

  @Override
  public String toString() {
    return "{" +
      " Nome='" + getNome() + "'" +
      ", Endereco='" + getEndereco() + "'" +
      ", Curso='" + getCurso() + "'" +
      ", CPF='" + getCPF() + "'" +
      ", Municipio='" + getMunicipio() + "'" +
      ", Matricula='" + getMatricula() + "'" +
      ", QTD_Disciplinas='" + getQTD_Disciplinas() + "'" +
      ", Escolha='" + getEscolha() + "'" +
      ", Ide='" + getIde() + "'" +
      ", Renda_Familiar='" + getRenda_Familiar() + "'" +
      ", Carga_Horaria='" + getCarga_Horaria() + "'" +
      ", status='" + isStatus() + "'" +
      ", bolsista='" + isBolsista() + "'" +
      "}";
  }

  public abstract void SelecaoIDE();

  public abstract void AuxilioAlimentacao();

  public abstract void AuxilioTransporte();
}