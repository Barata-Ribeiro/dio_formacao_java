package edu.barata.enums;

public class SistemaIbge {
  public static void main(String[] args) {
    for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
      System.out.println(e.getSigla() + " - " + e.getNome());
    }

    System.out.println();

    EstadoBrasileiro eb = EstadoBrasileiro.SANTA_CATARINA;
    System.out.println("Sigla: " + eb.getSigla() + " - Nome: " + eb.getNome());
    System.out.println(eb.getNomeMaiusculo());
    System.out.println("Código IBGE: " + eb.getIbge());
  }
}
