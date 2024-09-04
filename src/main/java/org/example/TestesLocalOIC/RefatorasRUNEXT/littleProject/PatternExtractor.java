package org.example.TestesLocalOIC.RefatorasRUNEXT.littleProject;

import java.io.File;

public class PatternExtractor {

    public static String extrairPadrao(File file) {
        // Implementar a lógica para extrair padrões do arquivo CSV
        // Por exemplo, lendo linhas específicas ou identificando cabeçalhos
        String nomeArquivo = file.getName().toLowerCase();

        if (nomeArquivo.contains("bradesco")) {
            return "Bradesco Aplicações";
        } else if (nomeArquivo.contains("santander")) {
            return "Santander Negociações";
        }
        return "Categoria Desconhecida";
    }
}

