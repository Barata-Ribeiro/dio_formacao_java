package com.projeto.implementacoesprincipais.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Carro> listCarros = new ArrayList<>();

    listCarros.add(new Carro("Fiat"));
    listCarros.add(new Carro("Chevrolet"));
    listCarros.add(new Carro("Ford"));
    listCarros.add(new Carro("Mitsubishi"));

    System.out.println("Carro existe? " + listCarros.contains(new Carro("Mitsubishi")));

    System.out.println(listCarros.get(2));

    System.out.println("Índice: " + listCarros.indexOf(new Carro("Mitsubishi")));

    // remove
    System.out.println(listCarros.remove(2));
    System.out.println(listCarros);

  }

}
