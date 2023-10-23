package br.com.dio.java.io.IOCharacter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Abra o teclado para escrever 3 filmes que você recomendaria e exiba esses filmes no console.
public class Exercicio1IOCaracter {

    public static void receberTecladoImprimirConsole() throws IOException {

        // InputStream is = System.in;
        // InputStreamReader isr = new InputStreamReader(is);
        // BufferedReader br = new BufferedReader(isr);

        System.out.println("Recomende 3 filmes: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readLine = br.readLine();

        // OutputStream os = System.out;
        // OutputStreamWriter osw = new OutputStreamWriter(os);
        // BufferedWriter bw = new BufferedWriter(osw);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(readLine);
            bw.newLine();
            readLine = br.readLine();
        } while (!readLine.isEmpty());

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        receberTecladoImprimirConsole();
    }

}
