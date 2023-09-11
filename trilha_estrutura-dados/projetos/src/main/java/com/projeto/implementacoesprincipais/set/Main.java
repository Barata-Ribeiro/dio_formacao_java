package com.projeto.implementacoesprincipais.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {

    Set<Carro> hashSetCarros = new HashSet<>();

    hashSetCarros.add(new Carro("Mitsubishi"));
    hashSetCarros.add(new Carro("Chevrolet"));
    hashSetCarros.add(new Carro("Alfa Romeo"));
    hashSetCarros.add(new Carro("Ferrari"));
    hashSetCarros.add(new Carro("Zip"));
    hashSetCarros.add(new Carro("Jaguar"));

    System.out.println(hashSetCarros);

    Set<Carro> treeSetCarros = new TreeSet<>();

    treeSetCarros.add(new Carro("Mitsubishi"));
    treeSetCarros.add(new Carro("Chevrolet"));
    treeSetCarros.add(new Carro("Alfa Romeo"));
    treeSetCarros.add(new Carro("Ferrari"));
    treeSetCarros.add(new Carro("Zip"));
    treeSetCarros.add(new Carro("Jaguar"));

    System.out.println(treeSetCarros);

  }

}
