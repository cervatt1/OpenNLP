package org.example.TestesLocalOIC;

import java.io.IOException;
import java.text.Normalizer;

public class getContaMovimento {

    public static void main(String[] args) throws IOException {
        System.out.println(getContaMovimento("", "PAGAR", "", "RODRIGUES & MONTINI SUPERMERCADOS LTDA"));
    }

    public static String getContaMovimento(String contaMovimento, String tipoLancamento, String documento, String nomeOrigem) {
        String complemento01 = "140708";
        String complemento02 = "9";
        String complemento03 = "SALSICHA, PAO, TOMATE E CEBOLA PARA COMEMORACAO FESTA JUNINA PRP - 24/06";
        String complemento04 = "2";
        String complemento05 = "JUROS";
        String complemento06 = "1602";
        String complemento07 = "";
        String complemento08 = "";
        String complemento09 = "";
        String complemento10 = "";
        String nomeArquivo = "".toUpperCase();
        String dataMovimento = "";
        String mesAnoAnterior = "";
        String mesAno2Anterior = "";
        String mesAnoAtual = "";
        String contaDebito = "";
        String contaCredito = "";
        String contaJuros = "";
        String contaDesconto = "";
        String contaMulta = "";
        String nomePortador = "13";
        String tipoPlanilha = "RISCO_SACADO_MOVIMENTO";
        int numeroAba = 0;
        String codCentroCusto = "";
        double valorDocumento = 0;
        double valorDesconto = 0;
        double valorJuros = 0;
        String conta = contaMovimento;
        int i = 0;
        if (complemento03.contains("C6#")) {
            complemento06 = complemento03.substring(complemento03.indexOf("C6#") + 3).trim();
            complemento03 = complemento03.substring(0, complemento03.indexOf("C6#")).trim();
        }
        if (complemento03.contains("C5#")) {
            complemento05 = complemento03.substring(complemento03.indexOf("C5#") + 3).trim();
            complemento03 = complemento03.substring(0, complemento03.indexOf("C5#")).trim();
        }
        if (complemento03.contains("C4#")) {
            complemento04 = complemento03.substring(complemento03.indexOf("C4#") + 3).trim();
            complemento03 = complemento03.substring(0, complemento03.indexOf("C4#")).trim();
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("")) { //ROT-2023-0661745
            conta = "912";
            contaMovimento = "912";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("")) { //ROT-2023-0661745
            conta = "912";
            contaMovimento = "912";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = "1514";
            contaMovimento = "1514";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = "1514";
            contaMovimento = "1514";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("")) { //ROT-2023-0661745
            conta = "912";
            contaMovimento = "912";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("")) { //ROT-2023-0661745
            conta = "912";
            contaMovimento = "912";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("")) { //ROT-2023-0661745
            conta = "912";
            contaMovimento = "912";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("")) { //ROT-2023-0661745
            conta = "912";
            contaMovimento = "912";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = "1514";
            contaMovimento = "1514";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = "1514";
            contaMovimento = "1514";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = "1514";
            contaMovimento = "1514";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = "1514";
            contaMovimento = "1514";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = "1514";
            contaMovimento = "1514";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = "1514";
            contaMovimento = "1514";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = "1514";
            contaMovimento = "1514";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = "1514";
            contaMovimento = "1514";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("1152") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("1610")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("1152") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("1610")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("1152") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("1610")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("1152") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("1610")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("")) { //ROT-2023-0661745
            conta = "912";
            contaMovimento = "912";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 1152")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1601") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ DIVERSOS")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("REFEICAO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("169")) { //ROT-2023-0661745
            conta = "1288";
            contaMovimento = "1288";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("REFEICAO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132")) { //ROT-2023-0661745
            conta = "1288";
            contaMovimento = "1288";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("REFEICAO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135")) { //ROT-2023-0661745
            conta = "1288";
            contaMovimento = "1288";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("REFEICAO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("104")) { //ROT-2023-0661745
            conta = "1288";
            contaMovimento = "1288";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("REFEICAO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("53")) { //ROT-2023-0661745
            conta = "1288";
            contaMovimento = "1288";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("PEDAGIO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("169")) { //ROT-2023-0661745
            conta = "2209";
            contaMovimento = "2209";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("PEDAGIO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132")) { //ROT-2023-0661745
            conta = "2209";
            contaMovimento = "2209";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("PEDAGIO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135")) { //ROT-2023-0661745
            conta = "2209";
            contaMovimento = "2209";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("PEDAGIO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("104")) { //ROT-2023-0661745
            conta = "2209";
            contaMovimento = "2209";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("PEDAGIO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("53")) { //ROT-2023-0661745
            conta = "2209";
            contaMovimento = "2209";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("HOSPEDAGEM") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("169")) { //ROT-2023-0661745
            conta = "1476";
            contaMovimento = "1476";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("HOSPEDAGEM") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132")) { //ROT-2023-0661745
            conta = "1476";
            contaMovimento = "1476";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("HOSPEDAGEM") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135")) { //ROT-2023-0661745
            conta = "1476";
            contaMovimento = "1476";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("HOSPEDAGEM") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("104")) { //ROT-2023-0661745
            conta = "1476";
            contaMovimento = "1476";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("HOSPEDAGEM") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("53")) { //ROT-2023-0661745
            conta = "1476";
            contaMovimento = "1476";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("COMBUSTIVEL") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("169")) { //ROT-2023-0661745
            conta = "1266";
            contaMovimento = "1266";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("COMBUSTIVEL") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132")) { //ROT-2023-0661745
            conta = "1266";
            contaMovimento = "1266";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("COMBUSTIVEL") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135")) { //ROT-2023-0661745
            conta = "1266";
            contaMovimento = "1266";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("COMBUSTIVEL") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("104")) { //ROT-2023-0661745
            conta = "1266";
            contaMovimento = "1266";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("COMBUSTIVEL") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("53")) { //ROT-2023-0661745
            conta = "1266";
            contaMovimento = "1266";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("MANUTENCAO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("169")) { //ROT-2023-0661745
            conta = "1268";
            contaMovimento = "1268";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("MANUTENCAO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132")) { //ROT-2023-0661745
            conta = "1268";
            contaMovimento = "1268";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("MANUTENCAO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135")) { //ROT-2023-0661745
            conta = "1268";
            contaMovimento = "1268";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("MANUTENCAO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("104")) { //ROT-2023-0661745
            conta = "1268";
            contaMovimento = "1268";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento04).contains("MANUTENCAO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("53")) { //ROT-2023-0661745
            conta = "1268";
            contaMovimento = "1268";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1152") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;

        System.out.println(
                "RESS:"+ StringUtil.removeSpecialCharsToUC(tipoPlanilha) +
                StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") +"&&"+
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") +"&&"+
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") +"&&"+
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS"));


        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCOSACADOMOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745 PARA AQUI 1
            conta = "1381";
            contaMovimento = "1381";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCOSACADOMOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA ADMINISTRADORA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "1381";
            contaMovimento = "1381";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "1383";
            contaMovimento = "1383";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA")) { //ROT-2023-0661745
            conta = complemento07;
            contaMovimento = complemento07;
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
        }
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1610") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1611") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("2345") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1611") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1611") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1611") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("2345") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("2345") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("2345") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1103") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1103") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1103") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1103") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("11101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("11101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("11101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("11113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("11113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("11113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("11113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("8803") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("JUROS")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("8803") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("DESCONTO")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("8803") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("TAXA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("8803") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("MULTA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_TRUDATA1") &&
                StringUtil.removeSpecialCharsToUC(nomeOrigem).contains("SALDO")) { //ROT-2023-1093746
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_TRUDATA1") &&
                StringUtil.removeSpecialCharsToUC(nomeOrigem).contains("PIX ENVIADO")) { //ROT-2023-1093746
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_PAGARME2") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("PAGA")) { //ROT-2023-1093778
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_PUNTO2") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("PAGO")) { //ROT-2023-1097268
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_GETNET5") &&
                StringUtil.removeSpecialCharsToUC(nomeOrigem).contains("VALOR") &&
                StringUtil.removeSpecialCharsToUC(nomeOrigem).contains("LIQUIDADO")) { //ROT-2023-11102111
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_GETNET5") &&
                StringUtil.removeSpecialCharsToUC(nomeOrigem).contains("SALDO")) { //ROT-2023-11102111
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("5")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("7")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("10")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("11")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("1")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("351")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("2")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                StringUtil.removeSpecialCharsToUC(complemento03).equals("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                !StringUtil.removeSpecialCharsToUC(complemento03).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                !StringUtil.removeSpecialCharsToUC(complemento03).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                !StringUtil.removeSpecialCharsToUC(documento).equals("")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                !StringUtil.removeSpecialCharsToUC(complemento03).contains("1602") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("") &&
                !StringUtil.removeSpecialCharsToUC(documento).equals("")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                !StringUtil.removeSpecialCharsToUC(complemento03).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("") &&
                !StringUtil.removeSpecialCharsToUC(documento).equals("")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                !StringUtil.removeSpecialCharsToUC(complemento03).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento05).equals("") &&
                !StringUtil.removeSpecialCharsToUC(documento).equals("")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO_CTB_DESPESAS") &&
                !StringUtil.removeSpecialCharsToUC(complemento03).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("100")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("101")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("3")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("4")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("301")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("305")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("306")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("350")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("300")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("5")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("7")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("10")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("11")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("12")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("8")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("2")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("12")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("2160") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("2160") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("2160") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("2160") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("2160") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1102") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1345") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1102") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1345") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1102") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1345") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1102") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1345") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1102") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1345") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                !StringUtil.removeSpecialCharsToUC(complemento05).equals("")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1345") &&
                !StringUtil.removeSpecialCharsToUC(complemento05).equals("")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                !StringUtil.removeSpecialCharsToUC(complemento05).equals("") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1102") &&
                !StringUtil.removeSpecialCharsToUC(complemento05).equals("")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1103") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1611") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("8803") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("2160") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("2160") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("2160") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("2160") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1102") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1102") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1102") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1102") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1345") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1345") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1345") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1345") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1103") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1103") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1103") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1103") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1611") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1611") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1611") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1611") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("8803") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("8803") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("8803") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("8803") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1611") &&
                !StringUtil.removeSpecialCharsToUC(complemento05).equals("")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("11101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("11101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("11101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("11101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("11101") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("11113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("11113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("11113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("11113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("11113") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento04).equals("16")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento04).equals("17")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                !StringUtil.removeSpecialCharsToUC(complemento05).equals("")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                !StringUtil.removeSpecialCharsToUC(complemento05).equals("") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("1653") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                !StringUtil.removeSpecialCharsToUC(complemento02).contains("6") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA")) { //ROT-2023-0661745
            conta = "FISCAL";
            contaMovimento = "FISCAL";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                !StringUtil.removeSpecialCharsToUC(complemento05).equals("")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                !StringUtil.removeSpecialCharsToUC(complemento05).equals("") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("6")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                !StringUtil.removeSpecialCharsToUC(nomePortador).contains("13") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("132") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("135") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("138") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("139") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("9") &&
                StringUtil.removeSpecialCharsToUC(complemento06).equals("115") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 326")) { //ROT-2023-0661745
            conta = "1513";
            contaMovimento = "1513";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_AME1") &&
                StringUtil.removeSpecialCharsToUC(complemento04).equals("")) { //ROT-2023-0140950
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("EXTRA MATRIZ 1152") &&
                !StringUtil.removeSpecialCharsToUC(complemento06).contains("1152")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("DESCONTO EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("TAXA EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("JUROS EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1602") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("RISCO_SACADO_MOVIMENTO") &&
                StringUtil.removeSpecialCharsToUC(complemento05).contains("MULTA EXTRA") &&
                StringUtil.removeSpecialCharsToUC(complemento06).contains("1610") &&
                StringUtil.removeSpecialCharsToUC(nomePortador).equals("13")) { //ROT-2023-0661745
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_PAGSEGURO1") &&
                !StringUtil.removeSpecialCharsToUC(complemento04).contains("PAGAMENTO") &&
                !StringUtil.removeSpecialCharsToUC(complemento04).contains("ASSINATURA") &&
                !StringUtil.removeSpecialCharsToUC(complemento04).contains("SAQUE") &&
                StringUtil.removeSpecialCharsToUC(complemento01).contains("CARTAO_PAGSEGURO1")) { //ROT-2021-0612707
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_PAGSEGURO1") &&
                !StringUtil.removeSpecialCharsToUC(complemento03).contains("APROVAD") &&
                StringUtil.removeSpecialCharsToUC(complemento01).contains("CARTAO_PAGSEGURO1")) { //ROT-2021-0612707
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_ALELO1") &&
                !StringUtil.removeSpecialCharsToUC(complemento04).contains("CONFIRMED")) { //ROT-2020-058689
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_ALELO2") &&
                !StringUtil.removeSpecialCharsToUC(complemento04).contains("APROVAD")) { //ROT-2021-0311455
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_DETODOS") &&
                !StringUtil.removeSpecialCharsToUC(complemento03).contains("APROVAD")) { //ROT-2021-0311491
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_HOTMART1") &&
                !StringUtil.removeSpecialCharsToUC(complemento04).contains("COMPLETO")) { //ROT-2021-0211301
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_HOTMART1") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("VENDA") &&
                StringUtil.removeSpecialCharsToUC(complemento03).contains("USD")) { //ROT-2021-0211301
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_HOTMART1") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("TARIFA") &&
                StringUtil.removeSpecialCharsToUC(complemento03).contains("USD")) { //ROT-2021-0211301
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_HOTMART1") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("VENDAINTERNACIONAL") &&
                StringUtil.removeSpecialCharsToUC(complemento03).contains("BRL")) { //ROT-2021-0211301
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_HOTMART1") &&
                StringUtil.removeSpecialCharsToUC(complemento02).equals("TARIFAINTERNACIONAL") &&
                StringUtil.removeSpecialCharsToUC(complemento03).contains("BRL")) { //ROT-2021-0211301
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_MOIP1") &&
                StringUtil.removeSpecialCharsToUC(nomeOrigem).contains("TRANSFERENCIA")) { //ROT-2021-0411996
            conta = "IGNORARINVERTE";
            contaMovimento = "IGNORARINVERTE";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(complemento01).contains("CARTAO_MOIP1") &&
                StringUtil.removeSpecialCharsToUC(nomeOrigem).contains("REEMBOLSO")) { //ROT-2021-0411996
            conta = "IGNORARINVERTE";
            contaMovimento = "IGNORARINVERTE";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(complemento03).contains("DINHEIRO") &&
                StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_IFOOD_EXCEL1")) { //ROT-2021-0512225
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(complemento03).contains("VIA LOJA") &&
                StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_IFOOD_EXCEL1")) { //ROT-2021-0512225
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (!StringUtil.removeSpecialCharsToUC(complemento04).equals("") &&
                StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_IFOOD_EXCEL1")) { //ROT-2021-0512225
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(complemento05).contains("NAO") &&
                StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_IFOOD_EXCEL1")) { //ROT-2021-0512225
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("PRATO") &&
                StringUtil.removeSpecialCharsToUC(complemento01).contains("PRATO") &&
                !StringUtil.removeSpecialCharsToUC(complemento03).contains("CART")) { //ROT-2021-0512280
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_POLICARD") &&
                StringUtil.removeSpecialCharsToUC(complemento03).contains("TRANSFERENCIA")) { //ROT-2021-0612672
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_SIPAG2") &&
                StringUtil.removeSpecialCharsToUC(complemento03).contains("2")) { //ROT-2021-0612669
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_SIPAG2") &&
                StringUtil.removeSpecialCharsToUC(complemento03).contains("3")) { //ROT-2021-0612669
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_SIPAG2") &&
                StringUtil.removeSpecialCharsToUC(complemento03).contains("4")) { //ROT-2021-0612669
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_SIPAG2") &&
                StringUtil.removeSpecialCharsToUC(complemento03).contains("5")) { //ROT-2021-0612669
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_SIPAG2") &&
                StringUtil.removeSpecialCharsToUC(complemento03).contains("6")) { //ROT-2021-0612669
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_SIPAG2") &&
                StringUtil.removeSpecialCharsToUC(complemento03).contains("7")) { //ROT-2021-0612669
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_SIPAG2") &&
                StringUtil.removeSpecialCharsToUC(complemento03).contains("8")) { //ROT-2021-0612669
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        if (StringUtil.removeSpecialCharsToUC(tipoPlanilha).contains("CARTAO_SIPAG2") &&
                StringUtil.removeSpecialCharsToUC(complemento03).contains("9")) { //ROT-2021-0612669
            conta = "IGNORAR";
            contaMovimento = "IGNORAR";
                        System.out.println("CAIU NO NUM: " + i);
return conta;
        }
i++;
        return conta;
    }
}