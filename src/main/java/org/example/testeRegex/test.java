package org.example.testeRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        // String longa com valores formatados como reais e datas
        String texto = "Os preços são: 19.899,00 1.000,00, 1000,00, 1000, 23,65, 65,9, R$65,90, 1234,9, 1234,90, 1.234,9, 1.234,90, 123.312, 123.312,0, 123.312,00, 12.123.312,00, 12.123.312,0, 12.123.312 e datas como 23/04/2023, 01/01, 15/12/2020, 07/07.";

        // Expressão regular para valores em reais
        String regexReais = "\\b\\d{1,3}(\\.\\d{3})*(,\\d{1,2})\\b";
        // Expressão regular para datas nos formatos dd/mm/yyyy e dd/mm
        String regexDatas = "\\b(\\d{2}/\\d{2}/\\d{4})\\b|\\b(\\d{2}/\\d{2})\\b";

        // Compilar as expressões regulares
        Pattern patternReais = Pattern.compile(regexReais);
        Pattern patternDatas = Pattern.compile(regexDatas);

        // Matcher para valores em reais
        Matcher matcherReais = patternReais.matcher(texto);
        System.out.println("Valores em reais encontrados:");
        while (matcherReais.find()) {
            System.out.println("Encontrado: " + matcherReais.group());
        }

        // Matcher para datas
        Matcher matcherDatas = patternDatas.matcher(texto);
        System.out.println("\nDatas encontradas:");
        while (matcherDatas.find()) {
            // Usamos matcher.group() para obter o grupo que correspondeu, seja dd/mm/yyyy ou dd/mm
            System.out.println("Encontrado: " + matcherDatas.group());
        }
    }
}
