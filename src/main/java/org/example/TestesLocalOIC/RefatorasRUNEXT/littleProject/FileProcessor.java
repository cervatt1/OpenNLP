package org.example.TestesLocalOIC.RefatorasRUNEXT.littleProject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    public List<String> processarArquivos(String diretorio) {
        File folder = new File(diretorio);
        File[] listOfFiles = folder.listFiles();
        List<String> resultados = new ArrayList<>();

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile() && file.getName().endsWith(".csv")) {
                    String resultado = processarArquivo(file);
                    resultados.add(resultado);
                }
            }
        }

        return resultados;
    }

    private String processarArquivo(File file) {
        // Chama o PatternExtractor para obter o padrão do arquivo
        String padraoExtraido = PatternExtractor.extrairPadrao(file);

        // Chama o Validator para validar o padrão extraído
        String resultadoValidacao = zzzValidator.validar(padraoExtraido, "Bradesco Aplicações");

        // Loga o resultado
        ResultLogger.logarResultado(file.getName(), padraoExtraido, resultadoValidacao);

        return resultadoValidacao;
    }
}
