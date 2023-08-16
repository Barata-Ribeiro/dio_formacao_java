package repeticao.edu.barata.forloop;

public class ExemploBreakContinue {
  public static void main(String[] args) {

    for (int numero = 1; numero <= 5; numero++) {
      if (numero == 3)
        continue; // break;

      System.out.println(numero);

    }
    // Qual a saída no console ? -- Resposta com break: 1, 2
    // Qual a saída no console ? -- Resposta com continue: 1, 2, 4, 5

  }
}
