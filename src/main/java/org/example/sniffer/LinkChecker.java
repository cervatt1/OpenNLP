package org.example.sniffer;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class LinkChecker  {

    private static final List<String> URLS = Arrays.asList(
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadrao.OTWPadrao_ContasPagasLog/10745564311717762930430"/*,
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoC.OTWPadraoC_ContasPagasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoD.OTWPadraoD_ContasRecebidasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoDez.WorkflowDezLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoDez.OTWPadraoDez_ContasRecebidasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoDez.OTWPadraoDez_ContasPagasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoD.OttimizzaWorkflowPadraoLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoD.OTWPadraoD_ContasRecebidasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoD.OTWPadraoD_ContasPagasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoCinquenta.WorkflowCinquentaLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoCinquenta.OTWPadraoCinquenta_ContasRecebidasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoCinquenta.OTWPadraoCinquenta_ContasPagasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoCinco.WorkflowCincoLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoCinco.OTWPadraoCinco_ContasRecebidasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoCinco.OTWPadraoCinco_ContasPagasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoC.OttimizzaWorkflowPadraoLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoC.OTWPadraoC_ContasRecebidasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadraoC.OTWPadraoC_ContasPagasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadrao1.Workflow1Log/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadrao1.OTWPadrao1_ContasRecebidasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadrao1.OTWPadrao1_ContasPagasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadrao.Workflow1Log/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadrao.OttimizzaWorkflowPadraoLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadrao.OTWPadrao_ContasRecebidasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadrao.OTWPadrao_ContasPagasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadrao.OTWPadrao1_ContasRecebidasLog/10745564311717759721391",
            "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/OTWPadrao.OTWPadrao1_ContasPagasLog/10745564311717759721391"*/
            // Adicione mais URLs conforme necessário
    );
    private static final List<String> SEARCH_PHRASES = Arrays.asList(
            "is not declared in any enclosing class nor any supertype, nor through a static import",
            "two-non-abstract",
            "A method named \""

            // Adicione mais frases conforme necessário
    );

    // Conjunto para armazenar os resultados já encontrados
    private static final Set<String> foundPhrases = new HashSet<>();

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(URLS.size());

        for (String url : URLS) {
            executor.scheduleAtFixedRate(new LinkCheckerTask(url), 0, 1, TimeUnit.MINUTES);
        }
    }

    private static class LinkCheckerTask implements Runnable {
        private String url;

        public LinkCheckerTask(String url) {
            this.url = url;
        }

        @Override
        public void run() {
            try {
                Document doc = Jsoup.connect(url).get();
                String bodyText = doc.body().text();
                for (String phrase : SEARCH_PHRASES) {
                    String uniqueKey = url + "|" + phrase; // chave única para a combinação URL + frase
                    if (bodyText.contains(phrase) && !foundPhrases.contains(uniqueKey)) {
                        System.out.println("Frase encontrada na página: " + url + " - " + phrase);
                        foundPhrases.add(uniqueKey);
                    }
                }
            } catch (IOException e) {
                System.out.println("Erro ao acessar a URL " + url + ": " + e.getMessage());
            }
        }
    }
}
