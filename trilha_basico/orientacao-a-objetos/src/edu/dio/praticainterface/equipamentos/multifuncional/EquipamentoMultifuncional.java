package edu.dio.praticainterface.equipamentos.multifuncional;

import edu.dio.praticainterface.equipamentos.copiadora.Copiadora;
import edu.dio.praticainterface.equipamentos.digitalizadora.Digitalizadora;
import edu.dio.praticainterface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

  @Override
  public void copiar() {
    System.out.println("Copiando via Multifuncional...");
  }

  @Override
  public void digitalizar() {
    System.out.println("Digitalizando via Multifuncional...");
  }

  @Override
  public void imprimir() {
    System.out.println("Imprimindo via Multifuncional...");
  }

}
