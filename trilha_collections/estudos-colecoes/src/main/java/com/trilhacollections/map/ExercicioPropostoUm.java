package com.trilhacollections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

public class ExercicioPropostoUm {

  public static void main(String[] args) {

    System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
    Map<String, Long> estadosNordeste = new HashMap<>() {
      {
        put("PE", 9616621L);
        put("AL", 3351543L);
        put("CE", 9187103L);
        put("RN", 3534265L);
        put("PB", 4039277L);
      }
    };
    System.out.println(estadosNordeste.toString());

    System.out.println();

    System.out.println("Substitua a população do estado RN por : 3.534.165");
    estadosNordeste.put("RN", 3534165L);
    System.out.println(estadosNordeste.toString());

    System.out.println();

    System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " +
        "PB - 4.039.277: ");
    if (!estadosNordeste.containsKey("PB"))
      estadosNordeste.put("PB", 4039277L);
    else
      System.out.println("Estado PB já está no dicionário.");

    System.out.println();

    System.out.println("Exiba a população do estado PE: ");
    System.out.println("População do estado PE: " + estadosNordeste.get("PE"));

    System.out.println();

    System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
    Map<String, Long> estadosNordeste2 = new LinkedHashMap<>() {
      {
        put("PE", 9616621L);
        put("AL", 3351543L);
        put("CE", 9187103L);
        put("RN", 3534265L);
        put("PB", 4039277L);
      }
    };
    System.out.println(estadosNordeste2.toString());

    System.out.println();

    System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
    Map<String, Long> estadosNordesteArvore = new TreeMap<>(estadosNordeste2);
    System.out.println(estadosNordesteArvore.toString());

    System.out.println();

    System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
        Collections.min(estadosNordeste.keySet()), Collections.min(estadosNordeste.values()));

    System.out.println();

    System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
        Collections.max(estadosNordeste.keySet()), Collections.max(estadosNordeste.values()));

    System.out.println();

    System.out.println("Exiba a soma da população desses estados: ");
    long soma = Collections.min(estadosNordeste.values()) + Collections.max(estadosNordeste.values());
    System.out.printf("A soma da população de %s e %s é: %d", Collections.min(estadosNordeste.keySet()),
        Collections.max(estadosNordeste.keySet()), soma);

    System.out.println();
    System.out.println();

    Iterator<Long> iterator = estadosNordeste.values().iterator();
    Long total = 0L;
    while (iterator.hasNext()) {
      total += iterator.next();
    }
    System.out.println("Exiba a soma da população de todos os estados: " + total);

    System.out.println();

    System.out.println("Exiba a média da população deste dicionário de estados: " + (total / estadosNordeste.size()));

    System.out.println();

    System.out.println(estadosNordeste);
    Iterator<Long> iterator2 = estadosNordeste.values().iterator();
    while (iterator2.hasNext()) {
      if (iterator2.next() < 4000000L)
        iterator2.remove();
    }
    System.out.println("Remova os estados com a população menor que 4.000.000: ");
    System.out.println(estadosNordeste);

    System.out.println();

    System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
    estadosNordeste.clear();

    System.out.println("Confira se a lista está vazia: " + estadosNordeste.isEmpty());
  }

}
