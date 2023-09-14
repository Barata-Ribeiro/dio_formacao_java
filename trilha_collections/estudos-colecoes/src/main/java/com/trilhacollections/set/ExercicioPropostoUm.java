package com.trilhacollections.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ExercicioPropostoUm {

  public static void main(String[] args) {

    Set<String> cores = new HashSet<>() {
      {
        add("Vermelho");
        add("Laranja");
        add("Amarelo");
        add("Verde");
        add("Azul");
        add("Anil");
        add("Violeta");
      }
    };

    List<String> listaCores = new ArrayList<>(cores);

    System.out.println("As cores do arco-íris são: \n" + cores);
    System.out.println("A quantidade de cores é: " + cores.size());
    Collections.sort(listaCores);
    System.out.println("As cores do arco-íris em ordem alfabética são: " + listaCores);
    Collections.reverse(listaCores);
    System.out.println("As cores do arco-íris em ordem inversa são: " + listaCores);
    System.out.println("As cores que começam com a letra v são: ");
    for (String cor : cores) {
      if (cor.toLowerCase().startsWith("v")) {
        System.out.println(cor);
      }
    }
    System.out.println("As cores que não começam com a letra v são: ");
    for (String cor : cores) {
      if (!cor.toLowerCase().startsWith("v")) {
        System.out.println(cor);
      }
    }

    System.out.println("Removendo todas as cores que não começam com a letra v: ");
    cores.removeIf(cor -> !cor.toLowerCase().startsWith("v"));
    System.out.println(cores);

    System.out.println("Limpando o conjunto... ");
    cores.clear();
    System.out.println("O conjunto está vazio? " + cores.isEmpty());

  }

}