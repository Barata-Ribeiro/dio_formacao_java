package com.trilhacollections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class ExercicioPropostoDois {

  public static void main(String[] args) {

    Set<LinguagemFavorita> linguagens = new HashSet<>() {
      {
        add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
        add(new LinguagemFavorita("Python", 1991, "PyCharm"));
        add(new LinguagemFavorita("JavaScript", 1995, "VSCode"));
      }
    };

    System.out.println("Organizando por ordem de inserção: ");
    Set<LinguagemFavorita> ordemInsercaoLinguagem = new LinkedHashSet<>() {
      {
        add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
        add(new LinguagemFavorita("Python", 1991, "PyCharm"));
        add(new LinguagemFavorita("JavaScript", 1995, "VSCode"));
      }
    };
    ;
    for (LinguagemFavorita linguagemFavorita : ordemInsercaoLinguagem) {
      System.out.println(linguagemFavorita);
    }
    System.out.println();

    System.out.println("Organizando por ordem natural(nome): ");
    Set<LinguagemFavorita> ordemPorNomeLinguagem = new TreeSet<>(new ComparePorNome());
    ordemPorNomeLinguagem.addAll(linguagens);
    for (LinguagemFavorita linguagemFavorita : ordemPorNomeLinguagem) {
      System.out.println(linguagemFavorita);
    }
    System.out.println();

    System.out.println("Organizando por IDE: ");
    Set<LinguagemFavorita> ordemPorIdeLinguagem = new TreeSet<>(new ComparePorIde());
    ordemPorIdeLinguagem.addAll(linguagens);
    for (LinguagemFavorita linguagemFavorita : ordemPorIdeLinguagem) {
      System.out.println(linguagemFavorita);
    }
    System.out.println();

    System.out.println("Organizando por Ano de criação e Nome: ");
    Set<LinguagemFavorita> ordemPorAnoCriacaoNomeLinguagem = new TreeSet<>(new ComparePorAnoENome());
    ordemPorAnoCriacaoNomeLinguagem.addAll(linguagens);
    for (LinguagemFavorita linguagemFavorita : ordemPorAnoCriacaoNomeLinguagem) {
      System.out.println(linguagemFavorita);
    }
    System.out.println();

    System.out.println("Organizando por Nome, ano de criação e IDE: ");
    Set<LinguagemFavorita> ordemPorNomeAnoIdeLinguagem = new TreeSet<>(new ComparePorNomeAnoIde());
    ordemPorNomeAnoIdeLinguagem.addAll(linguagens);
    for (LinguagemFavorita linguagemFavorita : ordemPorNomeAnoIdeLinguagem) {
      System.out.println(linguagemFavorita);
    }
    System.out.println();

    System.out.println("Imprimindo as linguagens uma abaixo da outra: ");
    for (LinguagemFavorita linguagemFavorita : linguagens) {
      System.out.println(linguagemFavorita.getNome());
    }

  }

}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
  private String nome;
  private int anoDeCriacao;
  private String ide;

  public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
    this.nome = nome;
    this.anoDeCriacao = anoDeCriacao;
    this.ide = ide;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getAnoDeCriacao() {
    return anoDeCriacao;
  }

  public void setAnoDeCriacao(int anoDeCriacao) {
    this.anoDeCriacao = anoDeCriacao;
  }

  public String getIde() {
    return ide;
  }

  public void setIde(String ide) {
    this.ide = ide;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + anoDeCriacao;
    result = prime * result + ((ide == null) ? 0 : ide.hashCode());
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
    LinguagemFavorita other = (LinguagemFavorita) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (anoDeCriacao != other.anoDeCriacao)
      return false;
    if (ide == null) {
      if (other.ide != null)
        return false;
    } else if (!ide.equals(other.ide))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Nome: " + nome + ", Ano de Criação: " + anoDeCriacao + ", IDE: " + ide;
  }

  @Override
  public int compareTo(LinguagemFavorita linguagem) {
    int nameComparison = this.getNome().compareTo(linguagem.getNome());
    int anoComparison = Integer.compare(this.getAnoDeCriacao(), linguagem.getAnoDeCriacao());
    int ideComparison = this.getIde().compareTo(linguagem.getIde());

    return nameComparison != 0 ? nameComparison : anoComparison != 0 ? anoComparison : ideComparison;
  }

}

class ComparePorNome implements Comparator<LinguagemFavorita> {
  @Override
  public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
    return linguagem1.getNome().compareTo(linguagem2.getNome());
  }
}

class ComparePorIde implements Comparator<LinguagemFavorita> {
  @Override
  public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
    return linguagem1.getIde().compareTo(linguagem2.getIde());
  }
}

class ComparePorAnoENome implements Comparator<LinguagemFavorita> {
  @Override
  public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
    int nomeComparison = linguagem1.getNome().compareTo(linguagem2.getNome());
    int anoComparison = Integer.compare(linguagem1.getAnoDeCriacao(), linguagem2.getAnoDeCriacao());

    return nomeComparison != 0 ? nomeComparison : anoComparison != 0 ? anoComparison : 0;
  }
}

class ComparePorNomeAnoIde implements Comparator<LinguagemFavorita> {
  @Override
  public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
    int nomeComparison = linguagem1.getNome().compareTo(linguagem2.getNome());
    int anoComparison = Integer.compare(linguagem1.getAnoDeCriacao(), linguagem2.getAnoDeCriacao());
    int ideComparison = linguagem1.getIde().compareTo(linguagem2.getIde());

    return nomeComparison != 0 ? nomeComparison : anoComparison != 0 ? anoComparison : ideComparison;
  }
}