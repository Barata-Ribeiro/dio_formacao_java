package edu.dio.praticainterface.equipamentos.impressora;

public class Laserjet implements Impressora {

  @Override
  public void imprimir() {
    System.out.println("Imprimindo com Laserjet...");
  }

}
