public abstract class RafaelMartins_Superclasse {
  private String nome, destino, cpf, partida, sobrenome;
  private int escolha;
  private Long id;

  public RafaelMartins_Superclasse() {
  }

  public RafaelMartins_Superclasse(String nome, String destino,
      String cpf, String partida, String sobrenome,
      int escolha) {
    this.nome = nome;
    this.destino = destino;
    this.cpf = cpf;
    this.partida = partida;
    this.sobrenome = sobrenome;
    this.escolha = escolha;
  }

  public String getSobrenome() {
    return this.sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public int getEscolha() {
    return this.escolha;
  }

  public void setEscolha(int escolha) {
    this.escolha = escolha;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setDestino(String destino) {
    this.destino = destino;
  }

  public String getDestino() {
    return destino;
  }

  public void setCPF(String cpf) {
    this.cpf = cpf;
  }

  public String getCPF() {
    return cpf;
  }

  public void setPartida(String partida) {
    this.partida = partida;
  }

  public String getPartida() {
    return partida;
  }

  @Override
  public String toString() {
    return "{" +
        " Nome='" + getNome() + "'" +
        ", Destino='" + getDestino() + "'" +
        ", CPF='" + getCPF() + "'" +
        ", Partida='" + getPartida() + "'" +
        ", Sobrenome='" + getSobrenome() + "'" +
        ", Escolha='" + getEscolha() + "'" +
        "}";
  }

  public abstract void ClasseEconomica();

  public abstract void ClasseExecutiva();
}