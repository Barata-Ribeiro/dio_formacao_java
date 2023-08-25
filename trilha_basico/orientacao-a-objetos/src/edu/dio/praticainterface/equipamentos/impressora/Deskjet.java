package edu.dio.praticainterface.equipamentos.impressora;

public class Deskjet implements Impressora {

  @Override
  public void imprimir() {
    System.out.println("Imprimindo com Deskjet...");
  }

}
