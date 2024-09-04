package org.example.TestesLocalOIC;

import java.text.Normalizer;

public class StringUtil {

    /**
     * Remove caracteres especiais e converte a string para letras maiúsculas.
     *
     * @param input A string de entrada.
     * @return A string sem caracteres especiais e em letras maiúsculas.
     */
    public static String removeSpecialCharsToUC(String input) {
        if (input == null) {
            return null;
        }

        // Normaliza a string removendo acentos
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        // Remove caracteres não ASCII
        String sanitized = normalized.replaceAll("[^\\p{ASCII}]", "");
        // Remove caracteres especiais
        sanitized = sanitized.replaceAll("[^a-zA-Z0-9]", "");
        // Converte para maiúsculas
        return sanitized.toUpperCase();
    }

    public static void main(String[] args) {
        // Testes de exemplo
        String tipoPlanilha = "Movimento";
        String complemento02 = "Exemplo#@";

        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).contains("E")) {
            String conta = "IGNORAR";
            String contaMovimento = "IGNORAR";
            System.out.println("Conta: " + conta);
            System.out.println("Conta Movimento: " + contaMovimento);
        }
    }
}
