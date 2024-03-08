package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import opennlp.tools.doccat.DoccatModel;
import opennlp.tools.doccat.DocumentCategorizerME;
import opennlp.tools.util.ObjectStream;
import opennlp.tools.util.PlainTextByLineStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class PoliticalOpinionClassifier {

    public static void main(String[] args) throws IOException {
        // Diretório onde está o modelo treinado
        File modelFile = new File("C:\\Users\\UserOtt\\IdeaProjects\\ThreadsTeste\\src\\main\\java\\org\\example\\model\\political_opinion_data.bin");

        // Carregamento do modelo treinado
        DoccatModel model;
        try (InputStream modelInputStream = Files.newInputStream(modelFile.toPath())) {
            model = new DoccatModel(modelInputStream);
        }

        // Inicialização do classificador de documentos
        DocumentCategorizerME categorizer = new DocumentCategorizerME(model);

        // Texto de exemplo a ser classificado
        String[] texts = {
                 "Acredito firmemente que a política econômica atual está falhando em fornecer oportunidades igualitárias para todos os cidadãos. As políticas de austeridade têm colocado uma carga desproporcional sobre os trabalhadores de baixa renda, enquanto os privilegiados continuam a prosperar. Precisamos de medidas mais progressivas que promovam a igualdade de renda e reduzam a desigualdade econômica.",
                "Estou profundamente preocupado com a falta de ação em relação à crise climática por parte dos nossos líderes políticos. As políticas atuais são inadequadas para lidar com os desafios ambientais que enfrentamos. É imperativo que adotemos medidas ousadas para reduzir as emissões de carbono, proteger ecossistemas vitais e promover a sustentabilidade em todas as áreas da política.",
                "A política social atual está deixando para trás os grupos mais vulneráveis da nossa sociedade. Os cortes nos programas de assistência social estão exacerbando a pobreza e a desigualdade, enquanto os serviços de saúde e educação continuam a enfrentar cortes de financiamento. Precisamos de uma abordagem mais compassiva e inclusiva que garanta o bem-estar de todos os cidadãos.",
                "Estou profundamente preocupado com a direção da política externa do nosso país. As políticas agressivas estão minando as relações internacionais e aumentando as tensões geopolíticas. Precisamos de uma abordagem mais diplomática e cooperativa que promova a paz, a estabilidade e a cooperação global.",
                "As políticas de imigração atuais estão desumanas e moralmente indefensáveis. A criminalização dos imigrantes e as políticas de separação familiar são violações dos direitos humanos básicos. Precisamos de uma política de imigração mais justa e compassiva que respeite a dignidade e os direitos de todas as pessoas, independentemente de sua origem."

        };

        // Classificação dos textos
        for (String text : texts) {
            // Classificação do texto
            double[] outcomes = categorizer.categorize(text.split(" "));

            // Obtendo a categoria com a maior probabilidade
            String category = categorizer.getBestCategory(outcomes);

            // Imprimindo o resultado da classificação
            System.out.println("Texto: " + text);
            System.out.println("Opinião Política: " + category);
        }
    }
}
