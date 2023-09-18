package com.trilhacollections.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

public class ExemploMap {

  public static void main(String[] args) {

    System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
    Map<String, Double> carrosPopulares = new HashMap<>() {
      {
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
      }
    };
    System.out.println(carrosPopulares.toString());

    System.out.println();

    System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
    carrosPopulares.put("gol", 15.2);
    System.out.println(carrosPopulares.toString());

    System.out.println();

    System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

    System.out.println();

    System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

    System.out.println();
    // System.out.println("Exiba o terceiro modelo adicionado: ");

    System.out.println("Exiba os modelos: ");
    Set<String> modelos = carrosPopulares.keySet();
    System.out.println(modelos);

    System.out.println();

    System.out.println("Exiba os consumos dos carros: ");
    Collection<Double> consumos = carrosPopulares.values();
    System.out.println(consumos);

    System.out.println();

    System.out.println("Exiba o modelo mais econômico e seu consumo: ");
    Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
    Set<Entry<String, Double>> entries = carrosPopulares.entrySet();
    String modeloMaisEficiente = "";
    for (Entry<String, Double> entry : entries) {
      if (entry.getValue().equals(consumoMaisEficiente))
        modeloMaisEficiente = entry.getKey();
    }
    System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);

    System.out.println();

    System.out.println("Exiba o modelo menos econômico e seu consumo: ");
    Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
    String modeloMenosEficiente = "";
    for (Entry<String, Double> entry : carrosPopulares.entrySet()) {
      if (entry.getValue().equals(consumoMenosEficiente))
        modeloMenosEficiente = entry.getKey();
    }
    System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);

    System.out.println();

    Iterator<Double> iterator = carrosPopulares.values().iterator();
    Double soma = 0d;
    while (iterator.hasNext()) {
      soma += iterator.next();
    }
    System.out.println("Exiba a soma dos consumos: " + soma);

    System.out.println();

    System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));

    System.out.println();

    System.out.println(carrosPopulares);
    Iterator<Double> iterator2 = carrosPopulares.values().iterator();
    while (iterator2.hasNext()) {
      if (iterator2.next().equals(15.6))
        iterator2.remove();
    }
    System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
    System.out.println(carrosPopulares);

    System.out.println();

    System.out.println("Exiba todos os carros na ordem em que foram informados: ");
    Map<String, Double> carrosPopularesEmOrdem = new LinkedHashMap<>() {
      {
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
      }
    };
    System.out.println(carrosPopularesEmOrdem.toString());

    System.out.println();

    System.out.println("Exiba o dicionário ordenado pelo modelo: ");
    Map<String, Double> carrosPopularesArvore = new TreeMap<>(carrosPopularesEmOrdem);
    System.out.println(carrosPopularesArvore.toString());

    System.out.println();

    System.out.println("Apague o dicionario de carros: ");
    System.out.println("Removendo...");
    carrosPopulares.clear();

    System.out.println();

    System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());

  }

}
