package edu.barata.operadores;

public class Operadores2 {
  public static void main(String[] args) {
    int numero = 5;

    // Negativo
    numero = -numero;
    System.out.println(numero);

    // Positivo
    numero = numero * -1;
    System.out.println(numero);

    // x repetição
    numero = numero + 1; // numero++;
    System.out.println(numero);

    numero = numero - 1; // numero--;
    System.out.println(numero);

    boolean variavel = true;
    variavel = !variavel; // ! negou a variavel, agora é falso
    System.out.println(variavel);

    // Ternário
    int a, b;

    a = 5;
    b = 6;

    // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
    // String resultado = "";
    // if (a == b)
    // resultado = "verdadeiro";
    // else
    // resultado = "falso";

    a++;
    String resultado = a == b ? "verdadeiro" : "falso";
    System.out.println(resultado);
  }
}
