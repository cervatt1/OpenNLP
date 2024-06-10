package org.example.PythonJava;
import java.io.*;
import java.net.*;

public class ChamadaServicoPython {
    public static void main(String[] args) throws IOException {
        String hostName = "localhost";
        int portNumber = 65432;

        try (Socket socket = new Socket(hostName, portNumber);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {

            // Envia dados para o servidor Python
            String userInput = "Dados para processar thihihihiihih";
            out.println(userInput);

            // Recebe o resultado do servidor Python e exibe
            System.out.println("Resultado do servidor Python: " + in.readLine());
        } catch (UnknownHostException e) {
            System.err.println("Host desconhecido " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Não foi possível obter E/S para a conexão com " +
                    hostName);
            System.exit(1);
        }
    }
}
