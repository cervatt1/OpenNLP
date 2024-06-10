package org.example.converter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class Base64ToXlsx {

    public static void main(String[] args) {
        // A string base64 de exemplo
        String base64String = "SEUxMSElU09NRVRISU5HTkVXRk9SVFhMU1hGSUxFU0U=";

        // Chame o método para decodificar e salvar o arquivo
        try {
            decodeBase64ToXlsx(base64String, "output.xlsx");
            System.out.println("Arquivo XLSX salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void decodeBase64ToXlsx(String base64String, String outputFilePath) throws IOException {
        // Decodifica a string base64 para um array de bytes
        byte[] decodedBytes = Base64.getDecoder().decode(base64String);

        // Escreve os bytes decodificados em um arquivo XLSX
        try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            fos.write(decodedBytes);
        }
    }
}
