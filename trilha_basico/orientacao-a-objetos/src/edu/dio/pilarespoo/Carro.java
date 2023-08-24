package edu.dio.pilarespoo;

public class Carro extends Veiculo {
  public void ligar() {
    confereEnergia();
    confereTemperaturaPneus();
    System.out.println("CARRO LIGADO");
  }

  private void confereEnergia() {
    System.out.println("Conferindo energia...");
  }

  private void confereTemperaturaPneus() {
    System.out.println("Conferindo temperatura dos pneus...");
  }
}
