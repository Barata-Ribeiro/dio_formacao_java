package br.com.dio.java.io.IOCharacter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//Faça uma cópia do arquivo “recomendacoes.txt” e agora adicione 3 recomendações de livros.
public class Exercicio3IOCaracter {

    public static void copiarArquivo() throws IOException {
        File f = new File(
                "recomendacoes.txt");
        String fileName = f.getName();

        // FileReader r = new FileReader(fileName);
        // BufferedReader br = new BufferedReader(r);
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String readLine = br.readLine();

        String copyFileName = fileName.substring(0, fileName.indexOf(".")).concat("-copy.txt");
        File fCopy = new File(copyFileName);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fCopy.getName()));

        do {
            bw.write(readLine);
            bw.newLine();
            bw.flush();
            readLine = br.readLine();
        } while (!(readLine == null));

        System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho '%d' bytes. \n", f.getName(), f.length());
        System.out.printf("Arquivo \"%s\" criado com sucesso! Com o tamanho '%d' bytes. \n", fCopy.getName(),
                fCopy.length());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 Livros: ");
        pw.flush();

        adicionarRecomendacoesNoArquivo(fCopy.getName());

        pw.println("Ok! Tudo certo. Tamanho do arquivo " + fCopy.length() + " bytes.");

        br.close();
        bw.close();
        pw.close();
    }

    public static void adicionarRecomendacoesNoArquivo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readLine = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        do {
            bw.write(readLine);
            bw.newLine();
            bw.flush();
            readLine = br.readLine();
        } while (!(readLine.equalsIgnoreCase("fim")));

        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}
