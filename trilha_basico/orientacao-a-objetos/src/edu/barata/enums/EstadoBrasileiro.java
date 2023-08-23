package edu.barata.enums;

// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
  SAO_PAULO("SP", "São Paulo", 11),
  RIO_JANEIRO("RJ", "Rio de Janeiro", 12),
  PIAUI("PI", "Piauí", 13),
  MARANHAO("MA", "Maranhão", 14),
  SANTA_CATARINA("SC", "Santa Catarina", 15),
  GOIAS("GO", "Goiás", 16),
  MATO_GROSSO("MT", "Mato Grosso", 17),
  MATO_GROSSO_DO_SUL("MS", "Mato Grosso do Sul", 18),
  MINAS_GERAIS("MG", "Minas Gerais", 19),
  PARA("PA", "Pará", 20),;

  private String nome;
  private String sigla;
  private int ibge;

  private EstadoBrasileiro(String sigla, String nome, int ibge) {
    this.sigla = sigla;
    this.nome = nome;
    this.ibge = ibge;
  }

  public int getIbge() {
    return ibge;
  }

  public String getSigla() {
    return sigla;
  }

  public String getNome() {
    return nome;
  }

  public String getNomeMaiusculo() {
    return nome.toUpperCase();
  }

}
