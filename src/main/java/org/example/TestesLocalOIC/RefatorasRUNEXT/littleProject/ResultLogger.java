package org.example.TestesLocalOIC.RefatorasRUNEXT.littleProject;

import java.io.FileWriter;
import java.io.IOException;

public class ResultLogger {

    public static void logarResultado(String nomeArquivo, String padraoExtraido, String resultadoValidacao) {
        try (FileWriter writer = new FileWriter("resultados.csv", true)) {
            writer.append(nomeArquivo).append(",");
            writer.append(padraoExtraido).append(",");
            writer.append(resultadoValidacao).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
