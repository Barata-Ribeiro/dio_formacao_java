package com.projeto.atribuicaoreferencia;

public class Main {
  public static void main(String[] args) {
    int intA = 1;
    int intB = intA;

    System.out.println("intA=" + intA);
    System.out.println("intB=" + intB);

    System.out.println();

    intA = 2;
    System.out.println("intA=" + intA);
    System.out.println("intB=" + intB);

    System.out.println();
    ///////////////////////////////////

    MeuObj objA = new MeuObj(1);
    MeuObj objB = objA;
    System.out.println("objA=" + objA);
    System.out.println("objB=" + objB);

    objA.setNum(2);
    System.out.println("objA=" + objA);
    System.out.println("objB=" + objB);
  }
}
