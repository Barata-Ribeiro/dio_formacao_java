package com.barata.desafiopoo.dominio;

public class Curso extends Conteudo {
  private int cargaHoraria;

  public Curso() {
  }

  public Curso(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO * cargaHoraria;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "{ \"tipo\": \"Curso\", \"titulo\": \"" + getTitulo() + "\", \"descricao\": \"" + getDescricao()
        + "\", \"cargaHoraria\": " + cargaHoraria + " }";
  }

}
