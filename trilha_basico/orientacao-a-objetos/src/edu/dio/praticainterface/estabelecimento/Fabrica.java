package edu.dio.praticainterface.estabelecimento;

import edu.dio.praticainterface.equipamentos.copiadora.Copiadora;
import edu.dio.praticainterface.equipamentos.copiadora.Xerox;
import edu.dio.praticainterface.equipamentos.digitalizadora.Digitalizadora;
import edu.dio.praticainterface.equipamentos.digitalizadora.Scanner;
import edu.dio.praticainterface.equipamentos.impressora.Deskjet;
import edu.dio.praticainterface.equipamentos.impressora.Impressora;
import edu.dio.praticainterface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
  public static void main(String[] args) {
    EquipamentoMultifuncional em = new EquipamentoMultifuncional();

    Deskjet deskjet = new Deskjet();
    Scanner sc = new Scanner();
    Xerox xerox = new Xerox();

    Impressora impressora = deskjet;
    Digitalizadora digitalizadora = sc;
    Copiadora copiadora = xerox;

    em.digitalizar();
    em.copiar();
    em.imprimir();

    impressora.imprimir();
    digitalizadora.digitalizar();
    copiadora.copiar();
  }
}
