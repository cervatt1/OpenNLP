package org.example.TC;

import java.util.regex.*;
import java.util.ArrayList;

public class DadoExtractor {


    public static void main(String[] args) {
        String texto = "O homem branco e a mulher cristã estavam em uma festa com pessoas pardas, asiáticas e indígenas. Jovem com voz reconhecida e idoso com retina mapeada. Mulher com mutação genética e homem com cromossomo extra.";

        String origensRaciais = extractOrigemRacial(texto);
        String conviccoesReligiosas = extractConviccaoReligiosa(texto);
        String dadosBiometricos = extractDadoBiometrico(texto);
        String dadosGeneticos = extractDadoGenetico(texto);
        String dadosSaude = extractDadoSaude(texto);
        String dadosVidaSexual = extractVidaSexual(texto);

        if (!origensRaciais.isEmpty()) {
            System.out.println(origensRaciais);
        }
        if (!conviccoesReligiosas.isEmpty()) {
            System.out.println(conviccoesReligiosas);
        }
        if (!dadosBiometricos.isEmpty()) {
            System.out.println(dadosBiometricos);
        }
        if (!dadosGeneticos.isEmpty()) {
            System.out.println(dadosGeneticos);
        }
        if (!dadosSaude.isEmpty()) {
            System.out.println(dadosSaude);
        }
        if (!dadosVidaSexual.isEmpty()) {
            System.out.println(dadosVidaSexual);
        }
    }


    public static String extractOrigemRacial(String text) {
        ArrayList<String> results = new ArrayList<>();
        StringBuilder resultsFinal = new StringBuilder();
        String regex = "\\b(?:branco|negro|pardo|asiático|indígena|latino|europeu|africano|árabe|mulato)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            results.add("OrigemRacial:" + matcher.group());
        }

        for (String dado : results) {
            resultsFinal.append(",").append(dado);
        }
        resultsFinal = new StringBuilder(resultsFinal.toString().replaceFirst(",", ""));
        return resultsFinal.toString();
    }


    public static String extractConviccaoReligiosa(String text) {
        ArrayList<String> results = new ArrayList<>();
        StringBuilder resultsFinal = new StringBuilder();
        String regex = "\\b(?:cristão|muçulmano|judeu|budista|hinduísta|ateu|agnóstico|espírita|umbandista|sikh)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            results.add("ConviccaoReligiosa:" + matcher.group());
        }

        for (String dado : results) {
            resultsFinal.append(",").append(dado);
        }
        resultsFinal = new StringBuilder(resultsFinal.toString().replaceFirst(",", ""));
        return resultsFinal.toString();
    }


    public static String extractDadoBiometrico(String text) {
        ArrayList<String> results = new ArrayList<>();
        StringBuilder resultsFinal = new StringBuilder();
        String regex = "\\b(?:impressão digital|íris escaneada|voz reconhecida|retina mapeada|DNA registrado|geometria da mão|face reconhecida|veias escaneadas|padrão de digitação|passos reconhecidos|reconhecimento facial|impressão da palma|padrão de íris|reconhecimento de voz|exame de retina|DNA armazenado|mapeamento facial|geometria das veias|assinatura digital|padrão de fala|escaneamento da íris|mapeamento de retina|análise de voz|leitura de impressão|registro de DNA|reconhecimento de face|varredura da mão|identificação de veias|análise de passos|padrão vocal)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            results.add("DadoBiometrico:" + matcher.group());
        }

        for(String dado : results){
            resultsFinal.append(",").append(dado);
        }
        resultsFinal = new StringBuilder(resultsFinal.toString().replaceFirst(",", ""));
        return resultsFinal.toString();
    }

    public static String extractDadoGenetico(String text) {
        ArrayList<String> results = new ArrayList<>();
        StringBuilder resultsFinal = new StringBuilder();
        String regex = "\\b(?:DNA alterado|mutação genética|cromossomo extra|polimorfismo|síndrome genética|doença hereditária|marcador genético|predisposição genética|gene recessivo|gene dominante|genoma sequenciado|mutação BRCA1|gene CFTR|alelos distintos|DNA mitocondrial|mutação somática|doença monogênica|epigenética alterada|haplótipo raro|heterozigose|homozigose|mutação germinativa|deleção genética|inserção genética|duplicação genética|translocação cromossômica|inversão cromossômica|mosaico genético|mutação no gene TP53|polimorfismo no gene APOE)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            results.add("DadoGenetico:" + matcher.group());
        }

        for (String dado : results) {
            resultsFinal.append(",").append(dado);
        }
        resultsFinal = new StringBuilder(resultsFinal.toString().replaceFirst(",", ""));
        return resultsFinal.toString();
    }


    public static String extractDadoSaude(String text) {
        ArrayList<String> results = new ArrayList<>();
        StringBuilder resultsFinal = new StringBuilder();
        String regex = "\\b(?:diabético|hipertenso|asmático|obeso|com depressão|ansioso|com hepatite|com câncer|alérgico|com AIDS|cardíaco|epiléptico|bipolar|hipertenso|autista|com TDAH|com artrite|com lúpus|esquizofrênico|celíaco|com esclerose|com endometriose|com fibromialgia|com Alzheimer|com leucemia|com anemia|com Parkinson|com osteoporose|com distrofia muscular|com síndrome de Down)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            results.add("DadoSaude:" + matcher.group());
        }

        for (String dado : results) {
            resultsFinal.append(",").append(dado);
        }
        resultsFinal = new StringBuilder(resultsFinal.toString().replaceFirst(",", ""));
        return resultsFinal.toString();
    }


    public static String extractVidaSexual(String text) {
        ArrayList<String> results = new ArrayList<>();
        StringBuilder resultsFinal = new StringBuilder();
        String regex = "\\b(?:homossexual|heterossexual|bissexual|assexual|pansexual|demissexual|poliamoroso|monogâmico|celibatário|transgênero|intersexual|não-binário|queer|genderqueer|gênero fluido|arromântico|heteroflexível|homorromântico|biromântico|demirromântico|lithromântico|andrógino|bigênero|pangênero|genderflux|polissexual|graysexual)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            results.add("VidaSexual:" + matcher.group());
        }

        for (String dado : results) {
            resultsFinal.append(",").append(dado);
        }
        resultsFinal = new StringBuilder(resultsFinal.toString().replaceFirst(",", ""));
        return resultsFinal.toString();
    }




}
