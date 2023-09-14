package com.trilhacollections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);

Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

public class ExemploOrdenacaoSet {

  public static void main(String[] args) {

    Set<Serie> minhasSeries = new HashSet<>() {
      {
        add(new Serie("got", "fantasia", 60));
        add(new Serie("dark", "drama", 60));
        add(new Serie("that '70s show", "comédia", 25));
      }
    };

    System.out.println("--\tOrdem aleatória\t--");
    for (Serie serie : minhasSeries)
      System.out.println(serie);

    System.out.println("--\tOrdem inserção\t--");
    Set<Serie> minhasSeries2 = new LinkedHashSet<>() {
      {
        add(new Serie("got", "fantasia", 60));
        add(new Serie("dark", "drama", 60));
        add(new Serie("that '70s show", "comédia", 25));
      }
    };
    for (Serie serie : minhasSeries2)
      System.out.println(serie);

    System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
    Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
    for (Serie serie : minhasSeries3)
      System.out.println(serie);

    System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
    Set<Serie> minhasSeries4 = new TreeSet<>(new CompareToNomeGeneroTempoEpisodio());
    minhasSeries4.addAll(minhasSeries);
    for (Serie serie : minhasSeries4)
      System.out.println(serie);

    System.out.println("--\tOrdem gênero\t--");
    Set<Serie> minhasSeries5 = new TreeSet<>(new CompareToGenero());
    minhasSeries5.addAll(minhasSeries);
    for (Serie serie : minhasSeries5)
      System.out.println(serie);

    System.out.println("--\tOrdem Tempo Episódio\t--");
    Set<Serie> minhasSeries6 = new TreeSet<>(new CompareToTempoEpisodio());
    minhasSeries6.addAll(minhasSeries);
    for (Serie serie : minhasSeries6)
      System.out.println(serie);

  }

}

class Serie implements Comparable<Serie> {
  private String nome;
  private String genero;
  private int tempoEpisodio;

  public Serie(String nome, String genero, int tempoEpisodio) {
    this.nome = nome;
    this.genero = genero;
    this.tempoEpisodio = tempoEpisodio;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public int getTempoEpisodio() {
    return tempoEpisodio;
  }

  public void setTempoEpisodio(int tempoEpisodio) {
    this.tempoEpisodio = tempoEpisodio;
  }

  @Override
  public String toString() {
    return "[{nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "}]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((genero == null) ? 0 : genero.hashCode());
    result = prime * result + tempoEpisodio;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Serie other = (Serie) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (genero == null) {
      if (other.genero != null)
        return false;
    } else if (!genero.equals(other.genero))
      return false;
    if (tempoEpisodio != other.tempoEpisodio)
      return false;
    return true;
  }

  @Override
  public int compareTo(Serie serie) {
    int nameComparison = this.getNome().compareTo(serie.getNome());
    int generoComparison = this.getGenero().compareTo(serie.getGenero());
    int tempoEpisodioComparison = Integer.compare(this.getTempoEpisodio(), serie.tempoEpisodio);

    return nameComparison != 0 ? nameComparison : generoComparison != 0 ? generoComparison : tempoEpisodioComparison;
  }

}

class CompareToNomeGeneroTempoEpisodio implements Comparator<Serie> {
  @Override
  public int compare(Serie serie1, Serie serie2) {
    int nameComparison = serie1.getNome().compareTo(serie2.getNome());
    int generoComparison = serie1.getGenero().compareTo(serie2.getGenero());
    int tempoEpisodioComparison = Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());

    return nameComparison != 0 ? nameComparison : generoComparison != 0 ? generoComparison : tempoEpisodioComparison;
  }
}

class CompareToGenero implements Comparator<Serie> {
  @Override
  public int compare(Serie serie1, Serie serie2) {
    return serie1.getGenero().compareTo(serie2.getGenero());
  }
}

class CompareToTempoEpisodio implements Comparator<Serie> {
  @Override
  public int compare(Serie serie1, Serie serie2) {
    return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
  }
}