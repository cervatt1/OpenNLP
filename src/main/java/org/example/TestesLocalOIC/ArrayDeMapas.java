package org.example.TestesLocalOIC;

import java.util.HashMap;
import java.util.Map;

public class ArrayDeMapas {
    public static void main(String[] args) {
        // Criação de um array de Map
        @SuppressWarnings("unchecked")
        Map<String, Integer>[] arrayDeMapas = new HashMap[3];

        // Inicializando cada elemento do array com um HashMap
        arrayDeMapas[0] = new HashMap<>();
        arrayDeMapas[1] = new HashMap<>();
        arrayDeMapas[2] = new HashMap<>();

        // Adicionando dados no Map na posição 0 do array
        arrayDeMapas[0].put("ivalorDocumento", 42);

        // Acessando o valor associado à chave "ivalorDocumento" no Map na posição 0 do array
        int valor = arrayDeMapas[0].get("ivalorDocumento");

        // Exibindo o valor
        System.out.println("Valor de 'ivalorDocumento' na posição 0: " + valor);
    }
}
