package org.example.NLP.model;

import com.google.api.services.customsearch.v1.Customsearch;
import com.google.api.services.customsearch.v1.model.Result;
import com.google.api.services.customsearch.v1.model.Search;


import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonFactory;



import java.io.IOException;
import java.util.List;

public class PDFLinkExtrator2 {/*

    private static final HttpTransport HTTP_TRANSPORT = ;
    private static final JsonFactory JSON_FACTORY =  ;

    public static void main(String[] args) throws IOException {
        String dominio = "dominio.com";
        String apiKey = "SUA_CHAVE_DE_API";
        String searchEngineId = "SEU_ID_DE_MECANISMO_DE_PESQUISA";

        Customsearch customsearch = new Customsearch.Builder(HTTP_TRANSPORT, JSON_FACTORY, null)
                .setApplicationName("PDF Link Extractor")
                .build();

        int startIndex = 1;
        int numResults = 10; // Número de resultados por página
        boolean allResultsRetrieved = false;

        try {
            while (!allResultsRetrieved) {
                Customsearch.Cse.List list = customsearch.cse().list();
                list.setKey(apiKey);
                list.setCx(searchEngineId);
                list.setStart((long) startIndex);

                Search results = list.execute();
                List<Result> items = results.getItems();

                if (items != null) {
                    for (Result item : items) {
                        String link = item.getLink();
                        System.out.println(link);
                    }

                    if (items.size() < numResults) {
                        allResultsRetrieved = true; // Se o número de itens for menor que o número de resultados por página, todos os resultados foram recuperados
                    }
                } else {
                    allResultsRetrieved = true; // Se não houver mais itens, todos os resultados foram recuperados
                }

                startIndex += numResults;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
