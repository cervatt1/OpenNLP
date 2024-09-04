package org.example.TestesLocalOIC;

import java.util.HashMap;
import java.util.Map;

public class listaDeMapa {
    public static void main(String[] args) {
        // Criar o mapa de listas de chave-valor
        Map<Integer, Map<String, Integer>> listaChaveValor = new HashMap<>();

        // Criar e preencher o primeiro mapa
        Map<String, Integer> indiceChave1 = new HashMap<>();
        indiceChave1.put("inomeOrigem", 0);
        indiceChave1.put("ivalorDocumento", 1);
        indiceChave1.put("itarifa", 2);
        indiceChave1.put("icomplemento", 0);
        listaChaveValor.put(0, indiceChave1);

        // Criar e preencher o segundo mapa
        Map<String, Integer> indiceChave2 = new HashMap<>();
        indiceChave2.put("inomeOrigem", 10);
        indiceChave2.put("ivalorDocumento", 20);
        indiceChave2.put("itarifa", 30);
        indiceChave2.put("icomplemento", 40);
        listaChaveValor.put(1, indiceChave2);

        // Imprimir o tamanho do mapa
        System.out.println("listaChaveValor.size(): " + listaChaveValor.size());

        // Acessar e imprimir o valor
        System.out.println("listaChaveValor.get(0).get(\"inomeOrigem\"): " + listaChaveValor.get(0).get("inomeOrigem"));
    }
}

