package br.com.dio.exceptions;

import javax.swing.*;
import java.io.*;

//Imprimir um arquivo no console.
public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "romances-blake-crouch.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (NullPointerException e) {
            if (nomeDoArquivo.equals("") || nomeDoArquivo.equals(null)) {
                JOptionPane.showMessageDialog(null,
                        "Caminho do arquivo não fornecido. \n\n" + e.getMessage(), "Erro!",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que você desejar imprimir. \n\n" + e.getMessage(), "Erro!",
                    JOptionPane.ERROR_MESSAGE);
            // e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível abrir o arquivo. \n\n" + e.getMessage() + e.getCause(), "Erro!",
                    JOptionPane.ERROR_MESSAGE);
            // e.printStackTrace();
        } finally {
            System.out.println("Chegou ao fim do programa.");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        if (nomeDoArquivo == null || nomeDoArquivo.isEmpty())
            throw new NullPointerException("Nome do arquivo é nulo ou vazio");

        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    }
}
