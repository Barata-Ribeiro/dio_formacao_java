package edu.barata.terminal;

public class Comentarios {
  // Olá, eu sou um comentário em uma única linha

  /*
   * Olá,
   * Eu sou um comentário
   * que posso ser mais detalhado
   * quando necessário
   */

  /**
   * Estas duas estrelinhas acima
   * é para identificar que você
   * pretende elaborar um comentário
   * a nível de documentação.
   * Que incrível !!!
   */
  public void metodo() {

  }

  /**
   * Metodo main para rodar a aplicação.
   * 
   * @param args
   */
  public static void main(String[] args) {

  }

  /*
   * Este método foi elaborado as pressas
   * por isso eu abrevei o nome das variáveis
   * mas olha, ele tem a finalidade de somar ou multiplicar
   * dois números
   */
  public int somaMultiplica(int n, int x, String m) {
    int r = 0; // r é igual ao resultado
    if (m == "M") { // M= multiplicação
      r = n * x;
    } else {
      // se não soma mesmo
      r = n + x;
    }
    return r;
  }
}
