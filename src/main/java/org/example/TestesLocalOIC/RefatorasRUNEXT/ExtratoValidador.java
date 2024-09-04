package org.example.TestesLocalOIC.RefatorasRUNEXT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExtratoValidador {

    public static void main(String[] args) {
        String csvFile = "C:\\Dev\\ThreadsTeste\\src\\main\\java\\org\\example\\TestesLocalOIC\\RefatorasRUNEXT\\extrato.csv"; // Caminho para o arquivo CSV
        List<String> linhas = lerCsv(csvFile);

        List<String> padroesRepetidos = identificarPadroesRepetitivos(linhas);

        for (String padrao : padroesRepetidos) {
            System.out.println("Padrão Repetido: " + padrao);
        }
    }

    private static List<String> lerCsv(String caminhoArquivo) {
        List<String> linhas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha.trim()); // Remover espaços em branco
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linhas;
    }

    private static List<String> identificarPadroesRepetitivos(List<String> linhas) {
        List<String> padroesRepetidos = new ArrayList<>();
        for (int i = 0; i < linhas.size(); i++) {
            for (int j = i + 1; j < linhas.size(); j++) {
                String padrao = obterPadraoComum(linhas.get(i), linhas.get(j));
                if (!padrao.isEmpty() && !padroesRepetidos.contains(padrao)) {
                    padroesRepetidos.add(padrao);
                }
            }
        }
        return padroesRepetidos;
    }

    private static String obterPadraoComum(String linha1, String linha2) {
        StringBuilder padraoComum = new StringBuilder();
        int minLength = Math.min(linha1.length(), linha2.length());

        for (int i = 0; i < minLength; i++) {
            if (linha1.charAt(i) == linha2.charAt(i)) {
                padraoComum.append(linha1.charAt(i));
            } else {
                break; // Sai do loop ao encontrar diferença
            }
        }
        return padraoComum.toString().trim();
    }
}
