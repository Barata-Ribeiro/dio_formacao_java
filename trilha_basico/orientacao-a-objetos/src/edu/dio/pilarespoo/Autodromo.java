package edu.dio.pilarespoo;

public class Autodromo {
  public static void main(String[] args) {
    Carro formulaOne = new Carro();
    formulaOne.setChassi("3cg 4r13jn 9p Za4405");
    // formulaOne.ligar();

    Moto z400 = new Moto();
    z400.setChassi("7rt 609mkk Ra 3H1424");
    // z400.ligar();

    Veiculo coringa = z400; // Ou formulaOne...
    coringa.ligar();
  }
}
