package br.com.dio.java.io.IOCharacter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//Abra o teclado para escrever 3 filmes que você recomendaria e armazene em “recomendacoes.txt”.
public class Exercicio2IOCaracter {

    public static void lerTecladoEscreverDocumento() throws IOException {
        File f = new File("recomendacoes.txt");

        try (
                Scanner scan = new Scanner(System.in);
                PrintWriter pw = new PrintWriter(System.out, true);
                BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {

            pw.println("Digite suas recomendações de filmes. Digite 'fim' para finalizar:");

            while (true) {
                String nextLine = scan.nextLine();

                if (nextLine.equalsIgnoreCase("fim"))
                    break;

                bw.write(nextLine);
                bw.newLine();
            }

            pw.printf("Arquivo \"%s\" foi criado com sucesso!", f.getName());
        }
    }

    public static void main(String[] args) throws IOException {
        lerTecladoEscreverDocumento();
    }

}
