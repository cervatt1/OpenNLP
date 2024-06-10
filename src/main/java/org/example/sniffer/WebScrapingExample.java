package org.example.sniffer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class WebScrapingExample {
    public static void main(String[] args) {
        // Configurar o caminho para o ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/java/org/example/sniffer/chromedriver.exe");

        // Configurações do ChromeDriver (opcional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Executa o navegador em modo headless (sem interface gráfica)

        // Inicializar o WebDriver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navegar para a página
            driver.get("http://s1.ottimizza.com.br:8055/inout/main.jsp?token=10745564311718018302474&userName=Nicholas%20Estrada");

            // Esperar que os elementos carreguem (pode ser necessário ajustar o tempo de espera)
            Thread.sleep(5000);

            // Encontrar elementos na página e extrair dados
            List<WebElement> elements = driver.findElements(By.cssSelector(".some-css-selector"));
            for (WebElement element : elements) {
                System.out.println(element.getText());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Fechar o WebDriver
            driver.quit();
        }
    }
}
