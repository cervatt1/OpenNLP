package org.example;

import opennlp.tools.doccat.DoccatFactory;
import opennlp.tools.doccat.DoccatModel;
import opennlp.tools.doccat.DocumentCategorizerME;
import opennlp.tools.doccat.DocumentSample;
import opennlp.tools.doccat.DocumentSampleStream;
import opennlp.tools.util.InputStreamFactory;
import opennlp.tools.util.ObjectStream;
import opennlp.tools.util.PlainTextByLineStream;
import opennlp.tools.util.TrainingParameters;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PoliticalOpinionClassifierTraining {

    public static void main(String[] args) throws IOException {
        // Diretório onde estão os dados de treinamento
        File trainingData = new File("C:\\Users\\UserOtt\\IdeaProjects\\ThreadsTeste\\src\\main\\treinoseresultados\\political_opinion_data.txt");

        // Diretório onde será salvo o modelo treinado
        File modelFile = new File("C:\\Users\\UserOtt\\IdeaProjects\\ThreadsTeste\\src\\main\\java\\org\\example\\model\\political_opinion_data.bin");

        // Se o modelo já existir, vamos excluí-lo
        if (modelFile.exists()) {
            modelFile.delete();
        }else{
            File modelFileNew = new File("C:\\Users\\UserOtt\\IdeaProjects\\ThreadsTeste\\src\\main\\java\\org\\example\\model\\political_opinion_data.bin");
            modelFile = modelFileNew;
        }

        List<DocumentSample> documentSamples = new ArrayList<>();

        // Leitura dos dados de treinamento e criação das instâncias de DocumentSample
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Files.newInputStream(trainingData.toPath()), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("ETREAPES");
                String text = parts[1];
                String category = parts[0];
                DocumentSample documentSample = new DocumentSample(category, new String[]{text});
                documentSamples.add(documentSample);
            }
        }

        // Criando ObjectStream a partir da lista de DocumentSample
        ObjectStream<DocumentSample> sampleStream = new ObjectStream<DocumentSample>() {
            int index = 0;

            @Override
            public DocumentSample read() throws IOException {
                if (index < documentSamples.size()) {
                    return documentSamples.get(index++);
                } else {
                    return null;
                }
            }

            @Override
            public void reset() throws IOException {
                index = 0;
            }

            @Override
            public void close() throws IOException {
                // Não faz nada
            }
        };

        try {
            // Configuração de parâmetros de treinamento
            TrainingParameters params = new TrainingParameters();
            params.put(TrainingParameters.CUTOFF_PARAM, "1");

            // Treinamento do modelo
            DoccatModel model = DocumentCategorizerME.train("pt", sampleStream, params, new DoccatFactory());

            // Salvando o modelo treinado
            model.serialize(modelFile);
        } finally {
            // Fechamento dos recursos
            sampleStream.close();
        }

        System.out.println("Modelo treinado e salvo com sucesso!");
    }
}