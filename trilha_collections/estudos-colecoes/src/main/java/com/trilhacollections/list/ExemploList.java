package com.trilhacollections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ExemploList {

  public static void main(String[] args) {

    System.out.println("Crie uma lista e adicione as sete notas: ");

    ArrayList<Double> notas = new ArrayList<>();
    notas.add(7.0);
    notas.add(8.5);
    notas.add(9.3);
    notas.add(5.0);
    notas.add(7.0);
    notas.add(0.0);
    notas.add(3.6);

    System.out.println(notas.toString());

    System.out.println();

    System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

    System.out.println();

    System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
    notas.add(4, 8.0);
    System.out.println(notas.toString());

    System.out.println();

    System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
    notas.set(notas.indexOf(5d), 6.0);
    System.out.println(notas.toString());

    System.out.println();

    System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

    System.out.println();

    System.out.println("Exiba todas as notas na ordem em que foram informados: ");
    for (Double nota : notas)
      System.out.print(nota + " -- ");

    System.out.println();
    System.out.println();

    System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
    System.out.println(notas.toString());

    System.out.println();

    System.out.println("Exiba a menor nota: " + Collections.min(notas));
    System.out.println("Exiba a maior nota: " + Collections.max(notas));

    System.out.println();

    Iterator<Double> iterator = notas.iterator();
    Double soma = 0d;
    while (iterator.hasNext()) {
      Double next = iterator.next();
      soma += next;
    }
    System.out.println("Exiba a soma dos valores: " + soma);

    System.out.println("Exiba a média das notas: " + (soma / notas.size()));

    System.out.println();

    System.out.println("Remova a nota 0: ");
    notas.remove(0d);
    System.out.println(notas.toString());

    System.out.println("Remova a nota da posição 0");
    notas.remove(0);
    System.out.println(notas.toString());

    System.out.println();

    System.out.println("Remova as notas menores que 7 e exiba a lista: ");
    Iterator<Double> iterator2 = notas.iterator();
    while (iterator2.hasNext()) {
      Double next = iterator2.next();
      if (next < 7)
        iterator2.remove();
    }
    System.out.println(notas.toString());

    System.out.println();

    // System.out.println("Apague toda a lista");
    // notas.clear();
    // System.out.println(notas.toString());
    System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    System.out.println();

    /*
     * Para você: Resolva esses exercícios utilizando os métodos da implementação
     * LinkedList:
     * 
     * System.out.println("Crie uma lista chamada notas2 " +
     * "e coloque todos os elementos da list Arraylist nessa nova lista: ");
     * 
     * System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
     * 
     * System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
     */

    System.out.println("Crie uma lista chamada notas2 " +
        "e coloque todos os elementos da list Arraylist nessa nova lista: ");
    LinkedList<Double> notas2 = new LinkedList<>();
    notas2.addAll(notas);
    System.out.println(notas2.toString());

    System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
    System.out.println("Primeira nota: " + notas2.getFirst());
    System.out.println(notas2.toString());

    System.out.println();

    System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
    System.out.println("Removendo nota: " + notas2.removeFirst());
    System.out.println(notas2.toString());

  }

}
