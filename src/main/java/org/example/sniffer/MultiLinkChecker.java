package org.example.sniffer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MultiLinkChecker {

    private static List<String> URLS = new ArrayList<>();
    static final List<String> SEARCH_PHRASES = Arrays.asList(
            "is not declared in any enclosing class nor any supertype, nor through a static import",
            "two-non-abstract",
            "Atualizando status servidor 40"
    );

    public static void main(String[] args) {
        // Set up Selenium WebDriver
        System.setProperty("webdriver.chrome.driver", "src/main/java/org/example/sniffer/chromedriver.exe"); // Atualize este caminho
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--remote-allow-origins=*"); // Adicione esta linha

        WebDriver driver = new ChromeDriver(options);

        try {
            // Navegar para a página inicial para definir o domínio do cookie
            driver.get("http://s1.ottimizza.com.br:8055");
            Thread.sleep(5000); // Espere para garantir que a página carregou

            // Adicionar o cookie
            Cookie cookie = new Cookie("jtable%231492599535page-size", "500");
            driver.manage().addCookie(cookie);

            /**
             * @Param aplicar aqui o link atual acessado pelo usuário logado
             *  *é uma falha de segurança que estamos fazendo uso*
             */
            driver.get("http://s1.ottimizza.com.br:8055/inout/main.jsp?token=10745564311718026250458&userName=Nicholas%20Estrada#");
            Thread.sleep(10000);
            // Process the page and extract the required data
            List<String> urlsFromPage = processPage(driver);
            URLS.addAll(urlsFromPage);

            // Contador para esperar todas as tarefas completarem
            CountDownLatch latch = new CountDownLatch(URLS.size());

            // Set up the executor service
            ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
            for (String url : URLS) {
                executor.scheduleAtFixedRate(() -> {
                    new LinkCheckerTask(url, latch).run();
                }, 0, 1, TimeUnit.MINUTES);
            }

            // Aguarda até que todas as tarefas sejam concluídas
            latch.await();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    private static List<String> processPage(WebDriver driver) {
        List<String> extractedUrls = new ArrayList<>();

        // Example: Extract specific data using Selenium
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        for (WebElement input : inputs) {
            if ("image".equals(input.getAttribute("type")) && input.getAttribute("onclick") != null) {
                String onclick = input.getAttribute("onclick");
                if (onclick.contains("openRouteLog")) {
                    String[] parts = onclick.split("[(),]");
                    String logName = parts[1].replace("'", "").trim();
                    String token = parts[2].replace("'", "").trim();
                    System.out.println("LOGNAME: " + logName + " | TOKEN: " + token);

                    String newUrl = "http://s1.ottimizza.com.br:8055/inout/rest/inoutservice/log/" + logName + "/" + token;
                    extractedUrls.add(newUrl);
                }
            }
        }
        return extractedUrls;
    }

    private static class LinkCheckerTask implements Runnable {
        private final String url;

        public LinkCheckerTask(String url, CountDownLatch latch) {
            this.url = url;
        }

        @Override
        public void run() {
            try {
                Document doc = Jsoup.connect(url).get();
                String bodyText = doc.body().text();
                for (String phrase : SEARCH_PHRASES) {
                    if (bodyText.contains(phrase)) {
                        System.out.println("Frase encontrada na página: " + url + " - " + phrase);
                    }
                }
            } catch (IOException e) {
                System.out.println("Erro ao acessar a URL " + url + ": " + e.getMessage());
            }
        }
    }
}
