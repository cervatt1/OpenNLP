package org.example.TestesLocalOIC;

import java.io.IOException;

import static opennlp.tools.util.StringUtil.toUpperCase;

public class getTipoPlanilha {
    public static void main(String[] args) throws IOException {
        String ress = getTipoPlanilhaX(
                ("CLIENTE;LOJA;CNPJ;DATA DA OPERA;PARCELAS;TERMINAL;VALOR BRUTO;AUTORIZA;USU;ESTORNO").toUpperCase(),
                "tipoPlanilha",
                ("OTTIMIZZA RECEBIXXMENTOS FINANCEIRO CONSOLIDADO").toUpperCase());
        System.out.println("RESULT:"+ress);
    }
    public static String getTipoPlanilhaX(String line, String tipoPlanilha, String nomeArquivo) {
        boolean achouTipo = true;
        String [] campos1 = "DATA OPERACAO;TOTAL".split(";");
        for (int x=0;x<campos1.length;x++) {
            if (!line.contains(campos1[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "AAARECBTO_VENDAVISAMASTERETC1";
        achouTipo = true;
        String [] campos2 = "DATA DA VENDA|HORA DA VENDA|STATUS DA VENDA|VALOR DA VENDA ORIGINAL|VALOR DA VENDA ATUALIZADO".split(";");
        for (int x=0;x<campos2.length;x++) {
            if (!line.contains(campos2[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "AAARECBTOREDE_VENDA2";
        achouTipo = true;
        String [] campos3 = "CREDENCIADORA;VALOR BRUTO;VALOR LIQUIDO;STATUS".split(";");
        for (int x=0;x<campos3.length;x++) {
            if (!line.contains(campos3[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "AARECBTOALELO_VENDA3";
        achouTipo = true;
        String [] campos4 = "DATA OPERACAO;QTDE ALIMENT.;VALOR ALIMENT.;QTDE REFEICAO".split(";");
        for (int x=0;x<campos4.length;x++) {
            if (!line.contains(campos4[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "AARECBTOBANRICARD_VENDA4";
        achouTipo = true;
        String [] campos5 = "DATA DE COMPRA;VENCIMENTO;AUTORIZACAO".split(";");
        for (int x=0;x<campos5.length;x++) {
            if (!line.contains(campos5[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "AARECBTOGREENCARD_VENDA5";
        achouTipo = true;
        String [] campos6 = "EMP.;TD;NUMERO;CLIENTE;NOME DO CLIENTE;VALOR;DT. VCTO.;VAL. PREST.;DT. BAIXA;VAL. ACR.;VAL. DESC.".split(";");
        for (int x=0;x<campos6.length;x++) {
            if (!line.contains(campos6[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "BAIXA_DOCUMENTOS6";
        achouTipo = true;
        String [] campos7 = "EMP.;CLIENTE;NOME DO CLIENTE;VALOR;DT. VCTO.".split(";");
        for (int x=0;x<campos7.length;x++) {
            if (!line.contains(campos7[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CONTAS_RECEBER7";
        achouTipo = true;
        String [] campos8 = "DATA;QUANT. DE VENDAS;TOTAL DE VENDAS".split(";");
        for (int x=0;x<campos8.length;x++) {
            if (!line.contains(campos8[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "RECBTOBEN_TARIFA8";
        achouTipo = true;
        String [] campos9 = "DATA;HORA;NRO DOC".split(";");
        for (int x=0;x<campos9.length;x++) {
            if (!line.contains(campos9[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "RECBTOBEN_VENDA9";
        achouTipo = true;
        String [] campos10 = "INDICADOR DE CANCELAMENTO DA VENDA;TIPO CARTAO;TOTAL PLANO DE VENDA".split(";");
        for (int x=0;x<campos10.length;x++) {
            if (!line.contains(campos10[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "RECBTOCABAL_VENDA10";
        achouTipo = true;
        String [] campos11 = "COD. ESTABELECIMENTO;CARTOES;DATA DA VENDA".split(";");
        for (int x=0;x<campos11.length;x++) {
            if (!line.contains(campos11[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "RECBTOGETNET_VENDA11";
        achouTipo = true;
        String [] campos12 = "ESTABELECIMENTO;COD. DE VENDA;AUTORIZACAO".split(";");
        for (int x=0;x<campos12.length;x++) {
            if (!line.contains(campos12[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "RECBTOGOOD_VENDA12";
        achouTipo = true;
        String [] campos13 = "COMPRADOR;DATA;ID;UNIDADE;STATUS;VALOR".split(";");
        for (int x=0;x<campos13.length;x++) {
            if (!line.contains(campos13[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "RECBTOPICPAY_VENDA13";
        achouTipo = true;
        String [] campos14 = "DATA TRANSACAO;PRODUTO;ESTABELECIMENTO;CNPJ".split(";");
        for (int x=0;x<campos14.length;x++) {
            if (!line.contains(campos14[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "RECBTOPOLICARD_VENDA14";
        achouTipo = true;
        String [] campos15 = "DATA DO RECEBIMENTO;DATA ORIGINAL DA VENDA;VALOR BRUTO DA PARCELA ORIGINAL".split(";");
        for (int x=0;x<campos15.length;x++) {
            if (!line.contains(campos15[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "RECBTOREDE_TARIFA15";
        achouTipo = true;
        String [] campos16 = "CNPJ;RAZAO SOCIAL;DATA DO PROCESSAMENTO".split(";");
        for (int x=0;x<campos16.length;x++) {
            if (!line.contains(campos16[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "RECBTOSODEXO_VENDA16";
        achouTipo = true;
        String [] campos17 = "NUMERO;DATA CORTE;DATA CRED/DEB;COD. ESTABELECIMENTO;DATA TRANSACAO;DATA POSTAGEM;NUMERO DOCTO;TIPO TRANSACAO;DESCRICAO LANCAMENTO;NUMERO CARTAO;VALOR".split(";");
        for (int x=0;x<campos17.length;x++) {
            if (!line.contains(campos17[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "RECBTOTICKET_VENDA17";
        achouTipo = true;
        String [] campos18 = "DATA DA TRANSACAO;N TRANSACAO;PRODUTO;VL TRANSACAO;N REEMBOLSO;CODIGO CLIENTE;CNPJ".split(";");
        for (int x=0;x<campos18.length;x++) {
            if (!line.contains(campos18[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "RECBTOTICKET_VENDA218";
        achouTipo = true;
        String [] campos19 = "NUMERO GUIA;PRODUTO;CONTRATO".split(";");
        for (int x=0;x<campos19.length;x++) {
            if (!line.contains(campos19[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "RECBTOVR_TARIFA19";
        achouTipo = true;
        String [] campos20 = "CNPJ;PRODUTO;DATA;HORA".split(";");
        for (int x=0;x<campos20.length;x++) {
            if (!line.contains(campos20[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "RECBTOVR_VENDA20";
        achouTipo = true;
        achouTipo = false;
        if (nomeArquivo.toUpperCase().contains("TITULO")) achouTipo = true;
        if (achouTipo) return "RECTIT21";
        achouTipo = true;
        return tipoPlanilha;
    }

}
