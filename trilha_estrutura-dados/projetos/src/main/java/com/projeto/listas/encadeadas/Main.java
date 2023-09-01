package com.projeto.listas.encadeadas;

public class Main {

  public static void main(String[] args) {

    ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

    minhaListaEncadeada.add("Item 1");
    minhaListaEncadeada.add("Item 2");
    minhaListaEncadeada.add("Item 3");
    minhaListaEncadeada.add("Item 4");

    System.out.println(minhaListaEncadeada.get(0));
    System.out.println(minhaListaEncadeada.get(1));
    System.out.println(minhaListaEncadeada.get(2));
    System.out.println(minhaListaEncadeada.get(3));

    System.out.println(minhaListaEncadeada);

    System.out.println("Removendo: " + minhaListaEncadeada.remove(2));

    System.out.println(minhaListaEncadeada);

  }

}
