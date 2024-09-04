package org.example.NLP;

// Importe as classes necessárias
import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.tokenize.SimpleTokenizer;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.util.Span;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class OpenNLPExample {
    public static void main(String[] args) throws IOException {
        // Carregar modelos pré-treinados para reconhecimento de nomes
        InputStream inputStream = new FileInputStream("C:\\Users\\UserOtt\\IdeaProjects\\ThreadsTeste\\src\\main\\java\\org\\example\\model\\en-ner-person.bin");
        TokenNameFinderModel model = new TokenNameFinderModel(inputStream);
        NameFinderME nameFinder = new NameFinderME(model);
// TESTE 
        // Frase de exemplo
        String sentence = "John Smith is a common name in Brazil. Pedro is another.";

        // Tokenização da frase
        Tokenizer tokenizer = SimpleTokenizer.INSTANCE;
        String[] tokens = tokenizer.tokenize(sentence);

        // Encontrar nomes na frase
        Span[] spans = nameFinder.find(tokens);
        List<Span> spanList = Arrays.asList(spans);

        // Exibir os nomes encontrados
        for (Span span : spanList) {
            System.out.println("Nome encontrado: " + tokens[span.getStart()]);
        }

        // Fechar recursos
        inputStream.close();
    }
}

