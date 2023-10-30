package br.com.dio.java.io.IOBytes.IOObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

//Crie a classe Gato com os atributos nome, idade e cor:
//Instancie um objeto e serialize
//Desserialize este objeto e mostre no console
public class ExemploIOObject {

    public static void serealizacao() throws IOException {
        Gato gato = new Gato("Charlie", 5, "Preto");

        File f = new File("gato.txt");

        // OutputStream os = new FileOutputStream(f.getName());
        // ObjectOutputStream oos = new ObjectOutputStream(os);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));

        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\" criado com sucesso!\n Tamanho '%d' bytes.\n", f.getName(), f.length());

        oos.close();
        ps.close();
    }

    public static void desserializacao(String arquivo) {
    }

    public static void main(String[] args) throws IOException {
        serealizacao();
    }
}
