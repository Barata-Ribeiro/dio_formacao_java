package br.com.dio.exceptions;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    public static void main(String[] args) {
        int[] numerador = { 4, 5, 8, 10 };
        int[] denominador = { 2, 4, 0, 2, 8 };

        for (int i = 0; i < denominador.length; i += 1) {

            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException(
                            "A divisão de " + numerador[i] + " por " + denominador[i] + " não é exata.", numerador[i],
                            denominador[i]);

                // if (numerador[i] == 0 || denominador[i] == 0)
                //     throw new DivisaoNaoExataException(
                //             "Divisão por zero não é permitida para " + numerador[i] + " / " + denominador[i] + ".",
                //             numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];

                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                e.printStackTrace();
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,
                        "Não é possível dividir " + numerador[i] + " por " + denominador[i] + "!");
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null,
                        "Não há mais números para dividir na iteração " + (i + 1) + " do loop!");
            }
        }

        System.out.println("O programa continua...");
    }
}
