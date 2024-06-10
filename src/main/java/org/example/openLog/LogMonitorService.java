package org.example.openLog;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogMonitorService {

    private final List<String> searchPhrases;
    private final Map<String, LocalDateTime> processedFiles;

    public LogMonitorService(List<String> searchPhrases) {
        this.searchPhrases = searchPhrases;
        this.processedFiles = new HashMap<>();
    }

    public void monitorLogs(String logDirectory) throws IOException, InterruptedException {
        Path directory = Paths.get(logDirectory);

        // Monitorar o diretório de logs continuamente
        try (WatchService watchService = FileSystems.getDefault().newWatchService()) {
            directory.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);

            while (true) {
                WatchKey key = watchService.take(); // Aguarda por eventos de modificação

                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();

                    if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
                        Path logFile = directory.resolve((Path) event.context());
                        processLogFile(logFile);
                    }
                }

                key.reset();
            }
        }
    }

    private void processLogFile(Path logFile) throws IOException {
        // Obter a data e hora da última modificação do arquivo
        BasicFileAttributes attrs = Files.readAttributes(logFile, BasicFileAttributes.class);
        LocalDateTime lastModifiedTime = LocalDateTime.ofInstant(attrs.lastModifiedTime().toInstant(), java.time.ZoneId.systemDefault());

        // Verificar se o arquivo já foi processado e se a última modificação é mais recente
        if (!processedFiles.containsKey(logFile.toString()) || processedFiles.get(logFile.toString()).isBefore(lastModifiedTime)) {
            try{
                List<String> lines = Files.readAllLines(logFile);

                // Verificar cada linha do arquivo em busca das frases
                for (String line : lines) {
                    for (String phrase : searchPhrases) {
                        if (line.contains(phrase)) {
                            LocalDateTime now = LocalDateTime.now();
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                            String formattedDateTime = now.format(formatter);

                            System.out.println("Frase encontrada: " + phrase);
                            System.out.println("No arquivo: " + logFile);
                            System.out.println("Horário: " + formattedDateTime);
                            System.out.println("------------------------------------------------");
                            // Aqui você pode adicionar lógica adicional, como notificações por email, etc.
                        }
                    }
                }

                // Atualizar o horário da última modificação processada para este arquivo
                processedFiles.put(logFile.toString(), lastModifiedTime);
            }catch (Exception e){
                System.out.println("ERRO AO PROCESSAR ARQUIVO: " + logFile.toString() + " | ERRO: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        LogMonitorService monitor = new LogMonitorService(VerificaLogsInout.SEARCH_PHRASES);
        monitor.monitorLogs("X:\\logs");
    }
}
