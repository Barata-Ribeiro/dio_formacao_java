package edu.barata.operadores;

public class Operadores3 {
  public static void main(String[] args) {
    // Relacionais
    int numero1 = 1;
    int numero2 = 2;

    String dataNome = "Jason";
    String programaNome = new String("Jason");

    boolean simNao = numero1 == numero2;
    System.out.println("numero1 é igual a numero2? " + simNao);

    simNao = numero1 != numero2;
    System.out.println("numero1 é diferente de numero2? " + simNao);

    simNao = numero1 > numero2;
    System.out.println("numero1 é maior que numero2? " + simNao);

    // Só irá escrever a mensagem se numero1 for menor que numero2
    if (numero1 < numero2) {
      System.out.println("numero1 é menor que numero2");
    }

    if (numero1 != numero2) {
      System.out.println("numero1 é diferente de numero2");
    }

    System.out.println(dataNome == programaNome); // false
    System.out.println(dataNome.equals(programaNome)); // true

    System.out.println("///////////////////////////////");

    // Lógicos
    boolean condicao1 = true;
    boolean condicao2 = false;

    if(condicao1 && condicao2) {
      System.out.println("Ambas as condições forem verdadeiras");
    }

    if(condicao1 || condicao2) {
      System.out.println("Uma das condições foi verdadeira");
    }
  }
}
