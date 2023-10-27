package br.com.dio.java.io.IOBytes.IOData;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
Crie um arquivo “peca-de-roupa.bin” e armazene:
1. Nome do produto, tamanho (P/M/G/U),quantidade e preço.
2. Leia este arquivo e imprima no console.
*/
public class ExemploIOData {

    public static void incluirProduto() throws IOException {

        File f = new File("D:\\Armazenamento\\Documentos\\peca-de-roupa.bin");

        // OutputStream os = new FileOutputStream(f.getPath());
        // DataOutputStream dos = new DataOutputStream(os);

        try (PrintStream ps = new PrintStream(System.out);
                DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));
                Scanner scan = new Scanner(System.in)) {

            scan.useLocale(Locale.US);

            ps.print("Nome da peça: ");
            String nome = scan.nextLine();
            dos.writeUTF(nome);

            ps.print("Tamanho da peça (P/M/G/U): ");
            char tamanho = scan.next().charAt(0);
            dos.writeChar(tamanho);

            boolean validInput;

            do {
                ps.print("Quantidade: ");
                try {
                    int quantidade = scan.nextInt();
                    dos.writeInt(quantidade);
                    validInput = true;
                } catch (InputMismatchException e) {
                    ps.println("Por favor, insira um número inteiro para a quantidade.");
                    scan.next();
                    validInput = false;
                }
            } while (!validInput);

            do {
                ps.print("Preço unitário: ");
                try {
                    double preco = scan.nextDouble();
                    dos.writeDouble(preco);
                    validInput = true;
                } catch (InputMismatchException e) {
                    ps.println("Por favor, insira um número correto para o preço. Exemplo: '49.99'");
                    scan.next();
                    validInput = false;
                }
            } while (!validInput);

            ps.println("Produto incluído com sucesso!");

            ps.printf("O arquivo %s foi criado/editado. Possui %d bytes e está no diretório '%s'.\n",
                    f.getName(), f.length(), f.getAbsolutePath());

            lerProduto(f.getPath());

            dos.close();
            scan.close();
            ps.close();
        }
    }

    public static void lerProduto(String caminhoDoArquivo) throws FileNotFoundException, IOException {

        File f = new File(caminhoDoArquivo);

        // InputStream is = new FileInputStream(f.getPath());
        // DataInputStream dis = new DataInputStream(is);

        try (PrintStream ps = new PrintStream(System.out);
                DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()))) {

            String nome = dis.readUTF();
            char tamanho = dis.readChar();
            int quantidade = dis.readInt();
            double preco = dis.readDouble();

            System.out.printf("\nNome..................: %s\n", nome);
            System.out.printf("Tamanho...............: %s\n", tamanho);
            System.out.printf("Quantidade............: %d\n", quantidade);
            System.out.printf("Preço.................: %.2f\n", preco);
            System.out.print("Total do valor das peças: " + String.format("%.2f", (quantidade * preco)));

            dis.close();
        }
    }

    public static void main(String[] args) throws IOException {
        incluirProduto();
    }
}
