public abstract class Aluno {
  private String nome, curso, cpf, municipio;
  private int matricula, escolha;
  private float ide, rendaFamiliar, cargaHoraria;
  private boolean status = true;


  public Aluno() {
  }

  public Aluno(String nome, String curso,
      String cpf, String municipio, int matricula,
      int escolha, float ide, float rendaFamiliar, float cargaHoraria,
      boolean status) {
    this.nome = nome;
    this.curso = curso;
    this.cpf = cpf;
    this.municipio = municipio;
    this.matricula = matricula;
    this.escolha = escolha;
    this.ide = ide;
    this.rendaFamiliar = rendaFamiliar;
    this.cargaHoraria = cargaHoraria;
    this.status = status;
  }

  public int getMatricula() {
    return this.matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public int getEscolha() {
    return this.escolha;
  }

  public void setEscolha(int escolha) {
    this.escolha = escolha;
  }

  public float getIde() {
    return this.ide;
  }

  public void setIde(float ide) {
    this.ide = ide;
  }

  public float getRendaFamiliar() {
    return this.rendaFamiliar;
  }

  public void setRendaFamiliar(float rendaFamiliar) {
    this.rendaFamiliar = rendaFamiliar;
  }

  public float getCargaHoraria() {
    return this.cargaHoraria;
  }

  public void setCargaHoraria(float cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
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

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getCurso() {
    return curso;
  }

  public void setCPF(String cpf) {
    this.cpf = cpf;
  }

  public String getCPF() {
    return cpf;
  }

  public void setMunicipio(String municipio) {
    this.municipio = municipio;
  }

  public String getMunicipio() {
    return municipio;
  }

  @Override
  public String toString() {
    return "{" +
        " Nome='" + getNome() + "'" +
        ", Curso='" + getCurso() + "'" +
        ", CPF='" + getCPF() + "'" +
        ", Municipio='" + getMunicipio() + "'" +
        ", Matricula='" + getMatricula() + "'" +
        ", Escolha='" + getEscolha() + "'" +
        ", Ide='" + getIde() + "'" +
        ", Renda_Familiar='" + getRendaFamiliar() + "'" +
        ", Carga_Horaria='" + getCargaHoraria() + "'" +
        ", status='" + isStatus() + "'" +
        "}";
  }

  public abstract void SelecaoIDE();

  public abstract void AuxilioAlimentacao();

  public abstract void AuxilioTransporte();
}