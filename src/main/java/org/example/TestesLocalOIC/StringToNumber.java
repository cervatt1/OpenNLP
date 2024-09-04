package org.example.TestesLocalOIC;

public class StringToNumber {

    public static void main(String[] args) {
        String input = "-R$ 1.234,56+abc-";
        double valor = parseStringToDouble(input);
        System.out.println(valor);  // Saída: 1234.56
    }

    public static double parseStringToDouble(String input) {
        // Remove caracteres que não sejam números, "+", "-", ".", ou ","
        String cleaned = input.replaceAll("[^0-9+\\-.,]", "");

        // Remove + ou - que não estejam seguidos por um número
        cleaned = cleaned.replaceAll("([+-])(?!\\d)", "");

        // Substitui a vírgula por um nada e ponto para dividir por 100 em double
        cleaned = cleaned.replaceAll("\\.", "").replaceAll(",", "");

        try {
            return (Double.parseDouble(cleaned)/100);
        } catch (NumberFormatException e) {
            System.err.println("ERRO: " + e.getMessage());
            throw new IllegalArgumentException("Valor de entrada inválido: " + input);
        }
    }
}
