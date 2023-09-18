package com.trilhacollections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

public class ExemploOrdenacaoMap {

  public static void main(String[] args) {

    System.out.println("--\tOrdem aleatória\t--");
    Map<String, Livro> meusLivros = new HashMap<>() {
      {
        put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
      }
    };
    for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
      System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    }

    System.out.println();

    System.out.println("--\tOrdem Inserção\t--");
    Map<String, Livro> meusLivros2 = new LinkedHashMap<>() {
      {
        put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
      }
    };
    ;
    for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
      System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    }

    System.out.println();

    System.out.println("--\tOrdem alfabética autores\t--");
    Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
    for (Map.Entry<String, Livro> livro : meusLivros3.entrySet()) {
      System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    }

    System.out.println();

    System.out.println("--\tOrdem alfabética nomes dos livros\t--");
    Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new LivroNomeComparator());
    meusLivros4.addAll(meusLivros.entrySet());
    for (Map.Entry<String, Livro> livro : meusLivros4) {
      System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    }

    System.out.println();

    System.out.println("--\tOrdem número de página\t--"); // Para você
    Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new LivroPaginasComparator());
    meusLivros5.addAll(meusLivros.entrySet());
    for (Map.Entry<String, Livro> livro : meusLivros5) {
      System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    }

  }

}

class Livro {
  private String nome;
  private int numeroPaginas;

  public Livro(String nome, int numeroPaginas) {
    this.nome = nome;
    this.numeroPaginas = numeroPaginas;
  }

  public Livro() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getNumeroPaginas() {
    return numeroPaginas;
  }

  public void setNumeroPaginas(int numeroPaginas) {
    this.numeroPaginas = numeroPaginas;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + numeroPaginas;
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
    Livro other = (Livro) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (numeroPaginas != other.numeroPaginas)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "{nome=" + nome + ", numeroPaginas=" + numeroPaginas + "}";
  }

}

class LivroNomeComparator implements Comparator<Map.Entry<String, Livro>> {

  @Override
  public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
    return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
  }

}

class LivroPaginasComparator implements Comparator<Map.Entry<String, Livro>> {

  @Override
  public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
    return Integer.compare(livro1.getValue().getNumeroPaginas(), livro2.getValue().getNumeroPaginas());
  }

}