package com.trilhacollections.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

  public static void main(String[] args) {
    // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

    System.out.println("Crie um conjunto e adicione as notas: ");
    Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6));
    System.out.println(notas.toString());

    System.out.println();

    // System.out.println("Exiba a posição da nota 5.0: ");
    // NÃO É POSSIVEL COM SET

    // System.out.println();

    // System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
    // NÃO É POSSIVEL COM SET

    // System.out.println();

    // System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
    // NÃO É POSSIVEL COM SET

    // System.out.println();

    System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

    System.out.println();

    // System.out.println("Exiba a terceira nota adicionada: ");
    // NÃO É POSSIVEL COM SET

    System.out.println("Exiba a menor nota: " + Collections.min(notas));

    System.out.println();

    System.out.println("Exiba a maior nota: " + Collections.max(notas));

    System.out.println();

    Iterator<Double> iterator = notas.iterator();
    Double soma = 0.0;
    while (iterator.hasNext()) {
      soma += iterator.next();
    }
    System.out.println("Exiba a soma dos valores: " + soma);

    System.out.println();

    System.out.println("Exiba a média das notas: " + (soma / notas.size()));

    System.out.println();

    System.out.println("Remova a nota 0: ");
    notas.remove(0.0);
    System.out.println(notas.toString());

    System.out.println();

    // System.out.println("Remova a nota da posição 0");
    // NÃO É POSSIVEL COM SET

    // System.out.println();

    System.out.println("Remova as notas menores que 7 e exiba a lista: ");
    Iterator<Double> iterator2 = notas.iterator();
    while (iterator2.hasNext()) {
      if (iterator2.next() < 7)
        iterator2.remove();
    }
    System.out.println(notas.toString());

    System.out.println();

    System.out.println("Exiba todas as notas na ordem em que foram informados: ");
    Set<Double> notas2 = new LinkedHashSet<>();
    notas2.add(7.0);
    notas2.add(8.5);
    notas2.add(9.3);
    notas2.add(5.0);
    notas2.add(7.0);
    notas2.add(0.0);
    notas2.add(3.6);
    System.out.println(notas2.toString());

    System.out.println();

    System.out.println("Exiba todas as notas na ordem crescente: ");
    Set<Double> notas3 = new TreeSet<>(notas2);
    System.out.println(notas3.toString());

    System.out.println();

    System.out.println("Apague todo o conjunto");
    notas.clear();

    System.out.println();

    System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
    System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
    System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

  }

}
