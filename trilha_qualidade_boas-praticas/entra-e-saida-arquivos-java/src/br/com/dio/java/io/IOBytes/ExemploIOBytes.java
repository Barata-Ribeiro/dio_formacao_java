package br.com.dio.java.io.IOBytes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//Faça uma cópia do arquivo “recomendacoes-copy.txt”.
public class ExemploIOBytes {
    public static void copiarArquivo() throws IOException {
        File f = new File("recomendacoes-copy.txt");
        String fileName = f.getName();

        // InputStream is = new FileInputStream(f.getName());
        // BufferedInputStream bis = new BufferedInputStream(is);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f.getName()));

        String fileNameCopy = fileName.substring(0, fileName.indexOf("-")).concat("-copy2.txt");
        File fCopy = new File(fileNameCopy);

        // OutputStream os = new FileOutputStream(fileNameCopy);
        // BufferedOutputStream bos = new BufferedOutputStream(os);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fCopy.getName()));

        int newLine = 0;
        while (((newLine = bis.read()) != -1)) {
            bos.write((char) newLine);
            bos.flush();
        }

        bis.close();
        bos.close();

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo %s copiado com sucesso e está no diretório '%s' com %d bytes.",
                fCopy.getName(), fCopy.getAbsolutePath(), fCopy.length());
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}
