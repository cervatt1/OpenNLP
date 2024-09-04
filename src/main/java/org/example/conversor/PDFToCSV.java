package org.example.conversor;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;
import com.opencsv.ICSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
// https://javadoc.io/doc/com.opencsv/opencsv/5.0/com/opencsv/CSVWriterBuilder.html
public class PDFToCSV {
    public static void main(String[] args) {
        String pdfFilePath = "C:\\Dev\\ThreadsTeste\\src\\main\\java\\org\\example\\conversor\\EXTRATO BANCO BRADESCO.pdf";
        String csvFilePath = "C:\\Dev\\ThreadsTeste\\src\\main\\java\\org\\example\\conversor\\conver.csv";

        try {
            // Carrega o PDF
            PDDocument document = PDDocument.load(new File(pdfFilePath));

            // Extrai o texto do PDF
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String text = pdfStripper.getText(document);

            // Fecha o documento PDF
            document.close();

            // Divide o texto em linhas
            String[] lines = text.split("\\r?\\n");

            // Configura o CSVWriter com separador ';' e sem aspas
            try (ICSVWriter writer = new CSVWriterBuilder(new FileWriter(csvFilePath))
                    .withSeparator(';')
                    .withQuoteChar(ICSVWriter.NO_QUOTE_CHARACTER)
                    .build()) {

                for (String line : lines) {
                    // Divide cada linha em colunas (ajuste conforme necessário)
                    String[] columns = line.split("\\s+");
                    writer.writeNext(columns);
                }
            }

            System.out.println("PDF convertido para CSV com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

