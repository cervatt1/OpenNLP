package org.example.NLP;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class PDFLinkExtractor {
    public static void main(String[] args) {
        String dominio = "ifc.edu.br";
        String query = "site:" + dominio + " filetype:pdf";
        int numPaginas = 3; // Número de páginas a serem pesquisadas

        try {
            for (int i = 0; i < numPaginas; i++) {
                Document doc = Jsoup.connect("https://www.google.com/search?q=" + query + "&start=" + (i * 10)).get();
                Elements links = doc.select("a[href]");
                for (Element link : links) {
                    String href = link.attr("href");
                    if (href.startsWith("http") && href.contains(dominio)) {
                        System.out.println(href);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

