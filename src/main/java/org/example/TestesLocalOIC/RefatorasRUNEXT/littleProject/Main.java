package org.example.TestesLocalOIC.RefatorasRUNEXT.littleProject;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        List<String> resultados = processor.processarArquivos("C:\\Dev\\ThreadsTeste\\src\\main\\java\\org\\example\\TestesLocalOIC\\RefatorasRUNEXT\\extrato.csv");

        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }
}

