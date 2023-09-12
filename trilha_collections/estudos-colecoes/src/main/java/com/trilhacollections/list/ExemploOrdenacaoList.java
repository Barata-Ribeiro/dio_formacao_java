package com.trilhacollections.list;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {

  public static void main(String[] args) {

    List<Gato> meusGatos = new ArrayList<>() {
      {
        add(new Gato("Jon", 18, "preto"));
        add(new Gato("Simba", 6, "tigrado"));
        add(new Gato("Jon", 12, "amarelo"));
      }
    };

    System.out.println("--\tOrdem de Inserção\t---");
    System.out.println("Gatinhos: " + meusGatos);
    System.out.println();

    System.out.println("--\tOrdem aleatória\t---");
    Collections.shuffle(meusGatos);
    System.out.println("Gatinhos: " + meusGatos);
    System.out.println();

    System.out.println("--\tOrdem Natural (Nome)\t---");
    Collections.sort(meusGatos);
    System.out.println("Gatinhos: " + meusGatos);
    System.out.println();

    System.out.println("--\tOrdem Idade\t---");
    Collections.sort(meusGatos, new ComparatorIdade());
    System.out.println("Gatinhos: " + meusGatos);
    System.out.println();

    System.out.println("--\tOrdem cor\t---");
    Collections.sort(meusGatos, new ComparatorCor());
    System.out.println("Gatinhos: " + meusGatos);
    System.out.println();

    System.out.println("--\tOrdem Nome/Cor/Idade\t---");
    Collections.sort(meusGatos, new ComparatorNomeCorIdade());
    System.out.println("Gatinhos: " + meusGatos);
  }

}

class Gato implements Comparable<Gato> {
  private String nome;
  private int idade;
  private String cor;

  public Gato(String nome, int idade, String cor) {
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  @Override
  public String toString() {
    return "{nome=" + nome + ", idade=" + idade + ", cor=" + cor + "}";
  }

  @Override
  public int compareTo(Gato gatinho) {
    return this.getNome().compareToIgnoreCase(gatinho.getNome());
  }
}

class ComparatorIdade implements Comparator<Gato> {
  @Override
  public int compare(Gato gatinho1, Gato gatinho2) {
    return Integer.compare(gatinho1.getIdade(), gatinho2.getIdade());
  }
}

class ComparatorCor implements Comparator<Gato> {

  @Override
  public int compare(Gato gatinho1, Gato gatinho2) {
    return gatinho1.getCor().compareToIgnoreCase(gatinho2.getCor());
  }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

  @Override
  public int compare(Gato gatinho1, Gato gatinho2) {
    int nomeCompare = gatinho1.getNome().compareToIgnoreCase(gatinho2.getNome());
    if (nomeCompare != 0)
      return nomeCompare;

    int corCompare = gatinho1.getCor().compareToIgnoreCase(gatinho2.getCor());
    if (corCompare != 0)
      return corCompare;

    return Integer.compare(gatinho1.getIdade(), gatinho2.getIdade());
  }
}