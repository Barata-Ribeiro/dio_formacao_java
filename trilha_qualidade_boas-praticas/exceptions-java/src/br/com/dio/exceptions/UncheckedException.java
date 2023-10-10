package br.com.dio.exceptions;

import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {
        boolean continuePrograma = true;

        do {

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));

                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

                System.out.println("Resultado: " + resultado);

                continuePrograma = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Entrada inválida. Digite apenas números inteiros! \n\n" + "Exception: " + e.getMessage());
                // e.printStackTrace();
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,
                        "Entrada inválida. Não é possível dividir um número por zero (0)!");
            } finally {
                System.out.println("Chegou no 'finally'...");
            }
        } while (continuePrograma);

        System.out.println("Código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
