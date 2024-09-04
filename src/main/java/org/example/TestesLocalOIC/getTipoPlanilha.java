package org.example.TestesLocalOIC;

import java.io.IOException;

import static opennlp.tools.util.StringUtil.toUpperCase;

public class getTipoPlanilha {
    public static void main(String[] args) throws IOException {
        String ress = getTipoPlanilhaX(
                ("Número do Cartão;Id da Transação;Data da Transação;Operação;Bandeira;Forma de Pagamento;Identificação da Maquininha;Valor Bruto;Valor Líquido;Valor Taxa;Status;Cód. NSU;Cód. Venda;Nome Cliente;E-mail Cliente").toUpperCase(),
                "tipoPlanilha",
                ("OTTIMIZZA RECEBIXXMENTOS FINANCEIRO CONSOLIDADO").toUpperCase());
        System.out.println("RESULT:"+ress);
    }
    public static String getTipoPlanilhaX(String line, String tipoPlanilha, String nomeArquivo) {
        boolean achouTipo = true;
        String [] campos1 = "NOME;ID;AUTORIZA;DATA;VENDA;STATUS;METODO;CAPTURA;BANDEIRA;FORMA;PAGAMENTO;PARCELAS;MOEDA".split(";");
        for (int x=0;x<campos1.length;x++) {
            if (!line.contains(campos1[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "AAACARTAO_INFINITE_PDFOTTCARTAO1";
        achouTipo = true;
        achouTipo = false;
        if (nomeArquivo.toUpperCase().contains("NUTRICARD")) achouTipo = true;
        if (achouTipo) return "ACARTAO_NUTRICARDOTTCARTAO2";
        achouTipo = true;
        String [] campos3 = "DOCTO;CARTAO;EMISSAO;VLR.VDA;TX.ADM.;TMT;VLR.LIQ.;CAPTURA".split(";");
        for (int x=0;x<campos3.length;x++) {
            if (!line.contains(campos3[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "ACARTAO_NUTRICARD2OTTCARTAO3";
        achouTipo = true;
        String [] campos4 = "CLIENTE;LOJA;CNPJ;DATA DA OPERA;PARCELAS;TERMINAL;VALOR BRUTO;AUTORIZA;USU;ESTORNO".split(";");
        for (int x=0;x<campos4.length;x++) {
            if (!line.contains(campos4[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "BCARTAO_SENFFOTTCARTAO4";
        achouTipo = true;
        String [] campos5 = "DATA|QUANTIDADE|VALOR R$|TRANSACOES".split(";");
        for (int x=0;x<campos5.length;x++) {
            if (!line.contains(campos5[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_ABRAPETITE1OTTCARTAO5";
        achouTipo = true;
        String [] campos6 = "CREDENCIADO|CNPJ ESTABELECIMENTO|TL;NR CARTAO".split(";");
        for (int x=0;x<campos6.length;x++) {
            if (!line.contains(campos6[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_ABRAPETITE2OTTCARTAO6";
        achouTipo = true;
        String [] campos7 = "DATA;HORA;CODIGO DE AUTORIZACAO;NSU ACQIO;NSU ADQUIRENTE;TIPO;BANDEIRA".split(";");
        for (int x=0;x<campos7.length;x++) {
            if (!line.contains(campos7[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_ACQIOOTTCARTAO7";
        achouTipo = true;
        String [] campos8 = "DATA;ORIGEM;LOJA;DOCUMENTO;NSU ACQIO;STATUS;TIPO DE PAGAMENTO.;PARCELAS;BANDEIRA;VALOR BRUTO".split(";");
        for (int x=0;x<campos8.length;x++) {
            if (!line.contains(campos8[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_ACQIO2OTTCARTAO8";
        achouTipo = true;
        String [] campos9 = "NRO. PEDIDO;DATA;CIDADE;RESTAURANTE;USUARIO;TOTAL (R$);TIPO ENTREGA;ENTREGA (R$)".split(";");
        for (int x=0;x<campos9.length;x++) {
            if (!line.contains(campos9[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_AIQFOME1OTTCARTAO9";
        achouTipo = true;
        String [] campos10 = "N DA AUTORIZACAO;DESCRICAO,VALOR BRUTO;DATA".split(";");
        for (int x=0;x<campos10.length;x++) {
            if (!line.contains(campos10[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_ALELO1OTTCARTAO10";
        achouTipo = true;
        String [] campos11 = "CNPJ;AUTORIZACAO;DATA DA VENDA;HORARIO DA TRANSACAO;TIPO CARTAO;CREDENCIADORA;VALOR BRUTO;VALOR LIQUIDO;STATUS;DATA DE PAGAMENTO".split(";");
        for (int x=0;x<campos11.length;x++) {
            if (!line.contains(campos11[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_ALELO2OTTCARTAO11";
        achouTipo = true;
        String [] campos12 = "EXTRATO DE VENDA;EMPRESAS SELECIONADAS: ALIMENTARE;DOCTO;CARTAO".split(";");
        for (int x=0;x<campos12.length;x++) {
            if (!line.contains(campos12[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_ALIMENTARE1OTTCARTAO12";
        achouTipo = true;
        String [] campos13 = "DOCTO;CARTAO;EMISSAO;VLR.VDA;TX. ADM.;TMT;VLR.L;CAPTURA".split(";");
        for (int x=0;x<campos13.length;x++) {
            if (!line.contains(campos13[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_ALIMENTARE2OTTCARTAO13";
        achouTipo = true;
        String [] campos14 = "DATA;ID DO PEDIDO;DIGO SKU;TIPO DE TRANSA;TIPO DE PAGAMENTO;DETALHE DO PAGAMENTO;VALOR;QUANTIDADE".split(";");
        for (int x=0;x<campos14.length;x++) {
            if (!line.contains(campos14[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_AMAZONOTTCARTAO14";
        achouTipo = true;
        String [] campos15 = "NOME:;CNPJ:;PERFIL: AMEPLUS".split(";");
        for (int x=0;x<campos15.length;x++) {
            if (!line.contains(campos15[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_AME1OTTCARTAO15";
        achouTipo = true;
        achouTipo = false;
        if (nomeArquivo.toUpperCase().contains("AMERICAN")) achouTipo = true;
        if (achouTipo) return "CARTAO_AMERICANEXPRESSOTTCARTAO16";
        achouTipo = true;
        String [] campos17 = "GRUPO: RV CARDS;REDE: RV CARDS;MOVIMENTOS EM LOJA;AUTORIZ;LOJA".split(";");
        for (int x=0;x<campos17.length;x++) {
            if (!line.contains(campos17[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_ARVCARDSOTTCARTAO17";
        achouTipo = true;
        String [] campos18 = "GRUPO: RV CARDS;REDE: RV CARDS;COMPRAS POR CLIENTE;VALOR COMPRA;JUROS COMPRA".split(";");
        for (int x=0;x<campos18.length;x++) {
            if (!line.contains(campos18[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_ARVCARDS2OTTCARTAO18";
        achouTipo = true;
        String [] campos19 = "DATA DE POSTAGEM;DATA DE CREDITO;NUMERO DO ESTABELECIMENTO;NUMERO DO PAGAMENTO;RESUMO DE VENDAS;RECUPERACAO DE COMPROVANTE".split(";");
        for (int x=0;x<campos19.length;x++) {
            if (!line.contains(campos19[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_AZULOTTCARTAO19";
        achouTipo = true;
        String [] campos20 = "DATA DA VENDA;PARCELAS;BANDEIRA;CANAL;VALOR BRUTO|VALOR DA TAXA|VALOR LIQUIDO|STATUS;MERO DO TERMINAL;COMPROVANTE DA VENDA;D. DO PEDIDO;NUMERO DO ESTABELECIMENTO".split(";");
        for (int x=0;x<campos20.length;x++) {
            if (!line.contains(campos20[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_AZUL2OTTCARTAO20";
        achouTipo = true;
        String [] campos21 = "DATA DA VENDA;PARCELAS;BANDEIRA;CANAL;VALOR BRUTO|VALOR LIQUIDO|STATUS;MERO DO TERMINAL;COMPROVANTE DA VENDA;D. DO PEDIDO;VALOR DA TAXA|NUMERO DO ESTABELECIMENTO".split(";");
        for (int x=0;x<campos21.length;x++) {
            if (!line.contains(campos21[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_AZUL2OTTCARTAO21";
        achouTipo = true;
        String [] campos22 = "DT. PREV. LIQUID;BANDEIRA;PRODUTO;VALOR TRANSACAO;TARIFA DE COMUNICACAO;VALOR LIQUIDO;VALOR CANCELADO".split(";");
        for (int x=0;x<campos22.length;x++) {
            if (!line.contains(campos22[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BANRICOMPRASOTTCARTAO22";
        achouTipo = true;
        String [] campos23 = "DATA PREV. CREDITO;PRODUTO;VALOR TRANSACAO;VL TX ADM (MDR);TARIFA DE COMUNICACAO;VALOR LIQUIDO;VALOR CANCELADO".split(";");
        for (int x=0;x<campos23.length;x++) {
            if (!line.contains(campos23[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BANRICOMPRAS2OTTCARTAO23";
        achouTipo = true;
        String [] campos24 = "DATA OPERACAO;TOTAL;VALOR ALIMENT.".split(";");
        for (int x=0;x<campos24.length;x++) {
            if (!line.contains(campos24[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BANRICOMPRAS3OTTCARTAO24";
        achouTipo = true;
        String [] campos25 = "DATA OPERACAO;QTDE A VISTA;QTDE PRE-DATADO;QTDE PARCELADO C/ENTRADA".split(";");
        for (int x=0;x<campos25.length;x++) {
            if (!line.contains(campos25[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BANRICOMPRAS4OTTCARTAO25";
        achouTipo = true;
        String [] campos26 = "DATA OPERACAO;QTDE CARTAO DE DEBITO;VALOR CARTAO DE DEBITO;QTDE CREDITO A VISTA;VALOR CREDITO A VISTA;QTDE PARCELADO LOJISTA".split(";");
        for (int x=0;x<campos26.length;x++) {
            if (!line.contains(campos26[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BANRICOMPRAS5OTTCARTAO26";
        achouTipo = true;
        String [] campos27 = "BANDEIRA;DT. PREV.;VALOR;PRODUTO;ADM;MDR;CANCELADO".split(";");
        for (int x=0;x<campos27.length;x++) {
            if (!line.contains(campos27[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BANRICOMPRASPDF1OTTCARTAO27";
        achouTipo = true;
        String [] campos28 = "PREV.;PRODUTO;VALOR;VL TX ADM;TARIFA DE;VALOR;VALOR;CREDITO;TRANSACAO;(MDR);COMUNICACAO;LIQUIDO;CANCELADO".split(";");
        for (int x=0;x<campos28.length;x++) {
            if (!line.contains(campos28[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BANRICOMPRASPDF2OTTCARTAO28";
        achouTipo = true;
        String [] campos29 = "CLIENTE;TOTAL PARCELAS;TAXA CAPTURA;BANDEIRA;DATA CREDITO;VALOR BRUTO(R$);CAPTURA (R$)".split(";");
        for (int x=0;x<campos29.length;x++) {
            if (!line.contains(campos29[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BELLUNO1OTTCARTAO29";
        achouTipo = true;
        String [] campos30 = "EMPRESA;FANTASIA EMPRESA;CLIENTE;FANTASIA CLIENTE;NOTA;TITULO;SERIE;PARCELA;D. VENCIMENTO;D. COMPETENCIA;D. LANCAMENTO;D. LIQUIDACAO;FORMA RECEBIMENTO;V. CREDITO;V. DEBITO".split(";");
        for (int x=0;x<campos30.length;x++) {
            if (!line.contains(campos30[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BENVALE1OTTCARTAO30";
        achouTipo = true;
        String [] campos31 = "DATA;HORA;NRO DOC;CNPJ;ESTABELECIMENTO;VALOR VENDA;TAXAS;MEIO DE CAPTURA;PAGO VIA".split(";");
        for (int x=0;x<campos31.length;x++) {
            if (!line.contains(campos31[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BENVISA1OTTCARTAO31";
        achouTipo = true;
        String [] campos32 = "DATA DE POSTAGEM|DATA DE CREDITO;RESUMO DE VENDAS;BANDEIRA;IP CLIENTE|PARCELADO".split(";");
        for (int x=0;x<campos32.length;x++) {
            if (!line.contains(campos32[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BIN1OTTCARTAO32";
        achouTipo = true;
        String [] campos33 = "PRODUTO;PARCELAS;BANDEIRA;CANAL;VALOR BRUTO|VALOR DA TAXA|VALOR LIQUIDO|VALOR CANCELADO;STATUS".split(";");
        for (int x=0;x<campos33.length;x++) {
            if (!line.contains(campos33[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BIN2_SICREDIOTTCARTAO33";
        achouTipo = true;
        String [] campos34 = "OPERACAO;;HORA;;DATA EFETIVACAO;;TIPO;;VALOR".split(";");
        for (int x=0;x<campos34.length;x++) {
            if (!line.contains(campos34[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BIQBENEFICIOS1OTTCARTAO34";
        achouTipo = true;
        String [] campos35 = "ID_PARCELA;CNPJ;RAZAO_SOCIAL;STATUS_VENDA;DATA_CANCELAMENTO_VENDA;DATA_VENDA;BANDEIRA;ADQUIRENTE;TIPO;CODIGO_AUTORIZACAO;CODIGO_NSU;NUMERO_CARTAO;NUMERO_TERMINAL_POS;QUANTIDADE_PARCELAS;NUMERO_PARCELA".split(";");
        for (int x=0;x<campos35.length;x++) {
            if (!line.contains(campos35[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BLU1OTTCARTAO35";
        achouTipo = true;
        String [] campos36 = "DOCTO;CARTAO;EMISSAO;VLR.VDA;TX. ADM.;TMT;VLR.LIQ.;CAPTURA".split(";");
        for (int x=0;x<campos36.length;x++) {
            if (!line.contains(campos36[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BONUSCREDOTTCARTAO36";
        achouTipo = true;
        String [] campos37 = "DOCTO;PARCELA;CLIENTE;EMISSAO;VLR.VDA;VLR.LIQ.;CAPTURA".split(";");
        for (int x=0;x<campos37.length;x++) {
            if (!line.contains(campos37[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BONUSCRED2OTTCARTAO37";
        achouTipo = true;
        String [] campos38 = "MOEDACARTAO;DATAHORATRANSACAO;IDCARTAO;CARTAO;STATUSCARTAO;IDPRODUTO;CAMINHO;MCC;MCCTITULO".split(";");
        for (int x=0;x<campos38.length;x++) {
            if (!line.contains(campos38[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BPPOTTCARTAO38";
        achouTipo = true;
        String [] campos39 = "DATA DA VENDA;QUANTIDADE DE TICKETS;VALOR DA VENDA;VALOR LIQUIDO".split(";");
        for (int x=0;x<campos39.length;x++) {
            if (!line.contains(campos39[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_BRASILCARDOTTCARTAO39";
        achouTipo = true;
        String [] campos40 = "DATA DA VENDA;PREVISAO DE PAGAMENTO;N CV;PRODUTO/PLANO DE VENDA;VALOR DA VENDA;VALOR LIQUIDO".split(";");
        for (int x=0;x<campos40.length;x++) {
            if (!line.contains(campos40[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CABAL1OTTCARTAO40";
        achouTipo = true;
        String [] campos41 = "CODAUTORIZACAO;CODBANDEIRA;CODPLANOVENDA;COMPROVANTE;DATAPREVISTAPAGTO".split(";");
        for (int x=0;x<campos41.length;x++) {
            if (!line.contains(campos41[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CABAL2OTTCARTAO41";
        achouTipo = true;
        String [] campos42 = "DOCUMENTO (CPF/CNPJ);N REDE COMERCIO".split(";");
        for (int x=0;x<campos42.length;x++) {
            if (!line.contains(campos42[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CABAL3OTTCARTAO42";
        achouTipo = true;
        String [] campos43 = "FORMA DE PAGAMENTO;PLANO DE VENDA;PARCELA;NUMERO DO CARTAO;TIPO CAPTURA;NUMERO DO TERMINAL;STATUS;VALOR PARCELA BRUTO;DESCONTO PARCELA;CABAL".split(";");
        for (int x=0;x<campos43.length;x++) {
            if (!line.contains(campos43[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CABAL4OTTCARTAO43";
        achouTipo = true;
        achouTipo = false;
        if (nomeArquivo.toUpperCase().contains("CALCARD")) achouTipo = true;
        if (achouTipo) return "CARTAO_CALCARDOTTCARTAO44";
        achouTipo = true;
        String [] campos45 = "ERO DO LOTE;PRODUTO;QUANTIDADE DE TRANSA;VALOR BRUTO;VALOR RETEN;DATA".split(";");
        for (int x=0;x<campos45.length;x++) {
            if (!line.contains(campos45[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CETELEMOTTCARTAO45";
        achouTipo = true;
        String [] campos46 = "DATA DA VENDA;DATA DA AUTORIZA;ESTABELECIMENTO;BANDEIRA;QUANTIDADE DE PARCELAS;RESUMO;OPERA;VALOR DA VENDA;VALOR DESCONTADO;CANAL;VENDA;NSU;COMISS".split(";");
        for (int x=0;x<campos46.length;x++) {
            if (!line.contains(campos46[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELO1OTTCARTAO46";
        achouTipo = true;
        String [] campos47 = "DATA DA VENDA;DATA DA AUTORIZACAO;ESTABELECIMENTO;BANDEIRA;FORMA DE PAGAMENTO;QUANTIDADE DE PARCELAS;RESUMO DA OPERACAO;VALOR DA VENDA;COMISSAO;VALOR DESCONTADO;PREVISAO DE PAGAMENTO;VALOR".split(";");
        for (int x=0;x<campos47.length;x++) {
            if (!line.contains(campos47[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELO10OTTCARTAO47";
        achouTipo = true;
        String [] campos48 = "DATA DA VENDA;DATA DA AUTORIZACAO DA VENDA;BANDEIRA;FORMA DE PAGAMENTO;QUANTIDADE DE PARCELAS;RESUMO DA OPERACAO;VALOR DA VENDA;TAXAS (%);VALOR DESCONTADO;TARIFA;PREVISAO DE PAGAMENTO;VALOR LIQUIDO DA".split(";");
        for (int x=0;x<campos48.length;x++) {
            if (!line.contains(campos48[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELO11OTTCARTAO48";
        achouTipo = true;
        String [] campos49 = "DATA DA VENDA|VALOR DA VENDA;CANAL DE VENDA;RECEBIMENTO AUTOMATICO;NUMERO DA NOTA FISCAL;TAXA DE EMBARQUE;VALOR DA ENTRADA".split(";");
        for (int x=0;x<campos49.length;x++) {
            if (!line.contains(campos49[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELO12OTTCARTAO49";
        achouTipo = true;
        String [] campos50 = "DATA DA VENDA;TIPO DE CAPTURA;TOTAL DE DIAS COBRADOS;ID PIX;TID;VALOR BRUTO;CODIGO DA CHAVE UR;CODIGO DA VENDA".split(";");
        for (int x=0;x<campos50.length;x++) {
            if (!line.contains(campos50[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELO13OTTCARTAO50";
        achouTipo = true;
        String [] campos51 = "DATA DA VENDA;HORA DA VENDA;ESTABELECIMENTO;BANDEIRA;QUANTIDADE TOTAL DE PARCELAS;MOTIVO;VALOR BRUTO;VALOR LIQUIDO;TID;VENDA;NSU".split(";");
        for (int x=0;x<campos51.length;x++) {
            if (!line.contains(campos51[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELO14OTTCARTAO51";
        achouTipo = true;
        String [] campos52 = "DATA DA VENDA;DATA DA AUTORIZACAO DA VENDA;ESTABELECIMENTO;BANDEIRA;QUANTIDADE DE PARCELAS;VALOR DA VENDA;VALOR DESCONTADO;TAXAS (%);CANAL DA VENDA;NSU".split(";");
        for (int x=0;x<campos52.length;x++) {
            if (!line.contains(campos52[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELO2OTTCARTAO52";
        achouTipo = true;
        String [] campos53 = "DATA DA VENDA;DATA DA AUTORIZACAO DA VENDA;BANDEIRA;FORMA DE PAGAMENTO;QUANTIDADE DE PARCELAS;RESUMO DA OPERACAO;VALOR DA VENDA;TAXAS (%);VALOR DESCONTADO;TARIFA;PREVISAO DE PAGAMENTO".split(";");
        for (int x=0;x<campos53.length;x++) {
            if (!line.contains(campos53[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELO3OTTCARTAO53";
        achouTipo = true;
        String [] campos54 = "DATA DA VENDA;DATA DA AUTORIZACAO DA VENDA;ESTABELECIMENTO;BANDEIRA;FORMA DE PAGAMENTO;QUANTIDADE DE PARCELAS".split(";");
        for (int x=0;x<campos54.length;x++) {
            if (!line.contains(campos54[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELO4OTTCARTAO54";
        achouTipo = true;
        String [] campos55 = "ESTABELECIMENTO;PREVISAO DE PAGAMENTO;BANDEIRA;PAGAMENTO;QUANTIDADE DE TRANSACOES;VALOR BRUTO;VALOR LIQUIDO".split(";");
        for (int x=0;x<campos55.length;x++) {
            if (!line.contains(campos55[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELO5OTTCARTAO55";
        achouTipo = true;
        String [] campos56 = "STATUS;TIPO DE LANCAMENTO;DESCRICAO;BANCO|AGENCIA|CONTA;ESTABELECIMENTO;DATA DE PAGAMENTO|DATA DA VENDA|BANDEIRA;FORMA DE PAGAMENTO;TID|CODIGO DE AUTORIZACAO;VALOR BRUTO|VALOR LIQUIDO".split(";");
        for (int x=0;x<campos56.length;x++) {
            if (!line.contains(campos56[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELO6OTTCARTAO56";
        achouTipo = true;
        String [] campos57 = "STATUS;TIPO DE LANCAMENTO;DESCRICAO;BANCO|ESTABELECIMENTO|DATA DE PAGAMENTO|DATA DA VENDA|BANDEIRA;FORMA DE PAGAMENTO;VALOR BRUTO|VALOR LIQUIDO;VALOR COBRADO;VALOR PENDENTE".split(";");
        for (int x=0;x<campos57.length;x++) {
            if (!line.contains(campos57[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELO7OTTCARTAO57";
        achouTipo = true;
        String [] campos58 = "STATUS;TIPO DE LANCAMENTO;DESCRICAO;BANCO;AGENCIA;CONTA;ESTABELECIMENTO;DATA DE PAGAMENTO;DATA DA VENDA;BANDEIRA;FORMA DE PAGAMENTO;VALOR BRUTO;VALOR LIQUIDO;VALOR COBRADO;VALOR PENDENTE".split(";");
        for (int x=0;x<campos58.length;x++) {
            if (!line.contains(campos58[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELO8OTTCARTAO58";
        achouTipo = true;
        String [] campos59 = "BANDEIRA;FORMA DE PAGAMENTO;NUMERO DA PARCELA;QUANTIDADE DE PARCELAS;NUMERO DO CARTAO;CODIGO DA TRANSACAO;CODIGO DE AUTORIZACAO;NSU;VALOR BRUTO;VALOR LIQUIDO;VALOR COBRADO;VALOR PENDENTE;VALOR TOTAL".split(";");
        for (int x=0;x<campos59.length;x++) {
            if (!line.contains(campos59[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELO9OTTCARTAO59";
        achouTipo = true;
        String [] campos60 = "DATA E HORA;PREVISAO DE PAGAMENTO;ESTABELECIMENTO;BANDEIRA".split(";");
        for (int x=0;x<campos60.length;x++) {
            if (!line.contains(campos60[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CIELOPDFOTTCARTAO60";
        achouTipo = true;
        String [] campos61 = "CONTA;DATA;HORA;TIPO;NSU HOST;AUTORIZACAO;PARCELA;R$ BRUTO;STATUS PAGAMENTO".split(";");
        for (int x=0;x<campos61.length;x++) {
            if (!line.contains(campos61[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_COMIDABOAOTTCARTAO61";
        achouTipo = true;
        String [] campos62 = "FANTASIA;CARTAO;DATA VENDA;VALOR;AUTORIZ".split(";");
        for (int x=0;x<campos62.length;x++) {
            if (!line.contains(campos62[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_COMPRAFACILOTTCARTAO62";
        achouTipo = true;
        String [] campos63 = "FILTROS:;PERIODO:;ESTABELECIMENTO:;PDV|TRANS".split(";");
        for (int x=0;x<campos63.length;x++) {
            if (!line.contains(campos63[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_COOPERCARDOTTCARTAO63";
        achouTipo = true;
        String [] campos64 = "DATA;PDV|DESCRI;CDC;TAXA ADM".split(";");
        for (int x=0;x<campos64.length;x++) {
            if (!line.contains(campos64[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_COOPERCARDOTTCARTAO64";
        achouTipo = true;
        String [] campos65 = "RELATORIO DE VENDAS C6PAY".split(";");
        for (int x=0;x<campos65.length;x++) {
            if (!line.contains(campos65[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CSEISPAY1OTTCARTAO65";
        achouTipo = true;
        String [] campos66 = "RELATORIO DE RECEBIVEIS C6PAY".split(";");
        for (int x=0;x<campos66.length;x++) {
            if (!line.contains(campos66[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_CSEISPAY2OTTCARTAO66";
        achouTipo = true;
        String [] campos67 = "DAFITI ITEM NO".split(";");
        for (int x=0;x<campos67.length;x++) {
            if (!line.contains(campos67[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_DAFITIOTTCARTAO67";
        achouTipo = true;
        String [] campos68 = "TIPO DE VENDA;BANDEIRA;VALOR CAPTURADO;VALOR LIQUIDO;PLANO DE PARCELAMENTO".split(";");
        for (int x=0;x<campos68.length;x++) {
            if (!line.contains(campos68[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_DETODOSOTTCARTAO68";
        achouTipo = true;
        String [] campos69 = "DATA;DESCRICAO;MOVIMENTACAO;TOTAL BRUTO;TAXAS;SALDO".split(";");
        for (int x=0;x<campos69.length;x++) {
            if (!line.contains(campos69[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_DOM1OTTCARTAO69";
        achouTipo = true;
        String [] campos70 = "FATURA;STATUS;FORMA DE PAGAMENTO;MOEDA;CONTRATO;DATA DE PAGAMENTO;DATA DE REEMBOLSO;VALOR REEMBOLSADO;TAXA EDUZZ".split(";");
        for (int x=0;x<campos70.length;x++) {
            if (!line.contains(campos70[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_EDDUZ1OTTCARTAO70";
        achouTipo = true;
        String [] campos71 = "LOTE FINANCEIRO|PRODUTO;DADOS ADCIONAIS|MODO DE CAPTURA".split(";");
        for (int x=0;x<campos71.length;x++) {
            if (!line.contains(campos71[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_ELAVONOTTCARTAO71";
        achouTipo = true;
        achouTipo = false;
        if (nomeArquivo.toUpperCase().contains("FACECARD")) achouTipo = true;
        if (achouTipo) return "CARTAO_FACECARDOTTCARTAO72";
        achouTipo = true;
        String [] campos73 = "EMPRESA;BANDEIRA;VENDA;CANCELAMENTO;PAGTO;RO;BRUTO;OUTRAS DESPESAS;A RECEBER".split(";");
        for (int x=0;x<campos73.length;x++) {
            if (!line.contains(campos73[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_FORTBRASIL1OTTCARTAO73";
        achouTipo = true;
        String [] campos74 = "PAGAMENTOS REALIZADOS;DATA DA TRANSACAO;CODIGO DO CLIENTE;COMPROVANTE;PRODUTO;TIPO DE TRANSACAO;STATUS DA TRANSA".split(";");
        for (int x=0;x<campos74.length;x++) {
            if (!line.contains(campos74[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_GERTEC1OTTCARTAO74";
        achouTipo = true;
        String [] campos75 = "COD. ESTABELECIMENTO;CARTOES;DATA DE PAGAMENTO;VALOR BRUTO;VALOR DA TAXA;VALOR".split(";");
        for (int x=0;x<campos75.length;x++) {
            if (!line.contains(campos75[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_GETNET1OTTCARTAO75";
        achouTipo = true;
        String [] campos76 = "COD. ESTABELECIMENTO;CARTOES;DATA/HORA DA VENDA;NUMERO DO CARTAO;TOTAL DE PARCELAS;EMISSOR CARTAO".split(";");
        for (int x=0;x<campos76.length;x++) {
            if (!line.contains(campos76[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_GETNET2OTTCARTAO76";
        achouTipo = true;
        String [] campos77 = "COD. ESTABELECIMENTO;CARTOES;DATA DA VENDA|QUANTIDADE DE VENDAS;VALOR BRUTO;VALOR DA TAXA E/OU TARIFA;VALOR LIQUIDO".split(";");
        for (int x=0;x<campos77.length;x++) {
            if (!line.contains(campos77[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_GETNET3OTTCARTAO77";
        achouTipo = true;
        String [] campos78 = "CODIGO EC CENTRALIZADOR;CODIGO EC;VENCIMENTO;VENCIMENTO ORIGINAL;PRODUTO;LANCAMENTO;PLANO DE VENDA;PARCELA;TOTAL DE PARCELAS;CARTAO;AUTORIZACAO;NUMERO DO CV;TERMINAL;DATA DA VENDA;VALOR ORIGINAL".split(";");
        for (int x=0;x<campos78.length;x++) {
            if (!line.contains(campos78[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_GETNET4OTTCARTAO78";
        achouTipo = true;
        String [] campos79 = "CODIGO;PRODUTO;LANCAMENTO;DATA DA VENDA;DATA DA VENDA;LIQUIDO".split(";");
        for (int x=0;x<campos79.length;x++) {
            if (!line.contains(campos79[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_GETNET5OTTCARTAO79";
        achouTipo = true;
        String [] campos80 = "COD. DE VENDA|AUTORIZACAO|DATA / HORA|QTD. PARCELAS|LOTE|PAGAMENTO|STATUS PAGAMENTO|NOTA FISCAL|CARTAO|REDE CAPTURA|VALOR BRUTO|VALOR DESCONTADO".split(";");
        for (int x=0;x<campos80.length;x++) {
            if (!line.contains(campos80[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_GOODCARD_TICKET_LOG1OTTCARTAO80";
        achouTipo = true;
        String [] campos81 = "ESTABELECIMENTO;DE VENDA;AUTORIZACAO;DATA / HORA;QTD. PARCELAS;LOTE;NOTA FISCAL;CARTAO;CLIENTE;TIPO COMBUST;QTDE LITROS".split(";");
        for (int x=0;x<campos81.length;x++) {
            if (!line.contains(campos81[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_GOODCARD_TICKET_LOG2OTTCARTAO81";
        achouTipo = true;
        String [] campos82 = "ESTABELECIMENTO;COD. DE VENDA;AUTORIZACAO;DATA / HORA;QTD. PARCELAS;LOTE;NOTA FISCAL;CARTAO;CLIENTE;REDE CAPTURA;VALOR BRUTO;TAXA ADMINISTRATIVA".split(";");
        for (int x=0;x<campos82.length;x++) {
            if (!line.contains(campos82[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_GOODCARD_TICKET_LOG3OTTCARTAO82";
        achouTipo = true;
        String [] campos83 = "ID;DATA E HORA;PDV;BANDEIRA;CARTAO;VALOR;STATUS".split(";");
        for (int x=0;x<campos83.length;x++) {
            if (!line.contains(campos83[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_GRANITOBMGCARD1OTTCARTAO83";
        achouTipo = true;
        String [] campos84 = "ID TRANSA;DATA E HORA;TIPO;STATUS;PARCELA;BANDEIRA;VALOR BRUTO;VALOR TAXA;VALOR ANTEC.;DATA PAGAMENTO".split(";");
        for (int x=0;x<campos84.length;x++) {
            if (!line.contains(campos84[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_GRANITOBMGCARD2OTTCARTAO84";
        achouTipo = true;
        String [] campos85 = "DATA DE COMPRA|VENCIMENTO|AUTORIZACAO;VALOR".split(";");
        for (int x=0;x<campos85.length;x++) {
            if (!line.contains(campos85[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_GREENCARDOTTCARTAO85";
        achouTipo = true;
        String [] campos86 = "NOME DO PRODUTO;NOME DO PRODUTOR;DOCUMENTO DO PRODUTOR;DATA DE VENDA;NOME;DOCUMENTO;".split(";");
        for (int x=0;x<campos86.length;x++) {
            if (!line.contains(campos86[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_HOTMART1OTTCARTAO86";
        achouTipo = true;
        String [] campos87 = "DATA DA TRANSACAO;PRODUTOR(A);PRODUTO;VENDA FEITA COMO;VALOR DE COMPRA SEM IMPOSTOS;TARIFA DE PROCESSAMENTO".split(";");
        for (int x=0;x<campos87.length;x++) {
            if (!line.contains(campos87[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_HOTMART2OTTCARTAO87";
        achouTipo = true;
        String [] campos88 = "ID DO PEDIDO;INCENTIVO PROMOCIONAL DO IFOOD;DATA;RESTAURANTE;ID DO RESTAURANTE;TOTAL DO PEDIDO".split(";");
        for (int x=0;x<campos88.length;x++) {
            if (!line.contains(campos88[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_IFOOD_EXCEL1OTTCARTAO88";
        achouTipo = true;
        String [] campos89 = "ID DO PEDIDO;INCENTIVO PROMOCIONAL DO IFOOD;DATA;RESTAURANTE;ID DO RESTAURANTE;TOTAL DO PEDIDO".split(";");
        for (int x=0;x<campos89.length;x++) {
            if (!line.contains(campos89[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_IFOOD_EXCEL1OTTCARTAO89";
        achouTipo = true;
        String [] campos90 = "NOME;INFINITE ID;AUTHORIZATION ID;DATA DA VENDA;STATUS".split(";");
        for (int x=0;x<campos90.length;x++) {
            if (!line.contains(campos90[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_INFINITE1OTTCARTAO90";
        achouTipo = true;
        String [] campos91 = "NOME;AUTHORIZATION ID;DATA DA VENDA;STATUS;VALOR TOTAL;TAXAS (R$);TAXAS (%)".split(";");
        for (int x=0;x<campos91.length;x++) {
            if (!line.contains(campos91[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_INFINITE2OTTCARTAO91";
        achouTipo = true;
        String [] campos92 = "FORMA DE PAGAMENTO|PARCELAS|MOEDA".split(";");
        for (int x=0;x<campos92.length;x++) {
            if (!line.contains(campos92[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_INFINITE3OTTCARTAO92";
        achouTipo = true;
        String [] campos93 = "LOJA|DATA|TOTAL DE VENDAS|BRUTO|TAXAS;VALOR A RECEBER|DATA PAGAMENTO 1".split(";");
        for (int x=0;x<campos93.length;x++) {
            if (!line.contains(campos93[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_IPIRANGAOTTCARTAO93";
        achouTipo = true;
        String [] campos94 = "DATA/HORA|BANDEIRA|TIPO|NUM. PARCELAS|VALOR BRUTO|VALOR LIQUIDO|STATUS".split(";");
        for (int x=0;x<campos94.length;x++) {
            if (!line.contains(campos94[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_LINXPAY1OTTCARTAO94";
        achouTipo = true;
        String [] campos95 = "DATA DA TRANSACAO;DATA DO PEDIDO;ID DO PEDIDO MAGAZINE LUIZA;ID DO PEDIDO SELLER;ID DA TRANSACAO;NUMERO DA NOTA FISCAL;NOME DO CLIENTE;METODO DE PAGAMENTO;PARCELA ATUAL;TOTAL DE PARCELAS;VALOR LIQUI".split(";");
        for (int x=0;x<campos95.length;x++) {
            if (!line.contains(campos95[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_MAGALU2OTTCARTAO95";
        achouTipo = true;
        achouTipo = false;
        if (nomeArquivo.toUpperCase().contains("MASTERFARMA")) achouTipo = true;
        if (achouTipo) return "CARTAO_MASTERFARMAOTTCARTAO96";
        achouTipo = true;
        String [] campos97 = "DATA DE PAGAMENTO;TIPO DE OPERACAO;NUMERO DO MOVIMENTO;OPERACAO RELACIONADA;VALOR".split(";");
        for (int x=0;x<campos97.length;x++) {
            if (!line.contains(campos97[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_MERCADOLIVRE1OTTCARTAO97";
        achouTipo = true;
        String [] campos98 = "SOURCE_ID;PAYMENT_METHOD_TYPE;PAYMENT_METHOD;TRANSACTION_TYPE;TRANSACTION_AMOUNT;SHIPPING_FEE_AMOUNT".split(";");
        for (int x=0;x<campos98.length;x++) {
            if (!line.contains(campos98[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_MERCADOLIVRE2OTTCARTAO98";
        achouTipo = true;
        String [] campos99 = "SOURCE_ID;PAYMENT_METHOD_TYPE;PAYMENT_METHOD;TRANSACTION_TYPE;TRANSACTION_AMOUNT".split(";");
        for (int x=0;x<campos99.length;x++) {
            if (!line.contains(campos99[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_MERCADOLIVRE3OTTCARTAO99";
        achouTipo = true;
        String [] campos100 = "NUMERO DA MOVIMENTACAO;DETALHE;DATA DO MOVIMENTO;VALOR DA TARIFA;TIPO DE OPERACAO;OPERACAO RELACIONADA".split(";");
        for (int x=0;x<campos100.length;x++) {
            if (!line.contains(campos100[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_MERCADOLIVRE4OTTCARTAO100";
        achouTipo = true;
        String [] campos101 = "FECHA DE COMPRA;FECHA DE ACREDIT;FECHA DE LIBERA;DEL DINERO;NOMBRE DE LA CONTRAPARTE".split(";");
        for (int x=0;x<campos101.length;x++) {
            if (!line.contains(campos101[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_MERCADOLIVRE5OTTCARTAO101";
        achouTipo = true;
        String [] campos102 = "CODIGO DE REFERENCIA;ID DA OPERACAO NO MERCADO PAGO;CODIGO DA CONTA DO VENDEDOR;TIPO DE MEIO DE PAGAMENTO;MEIO DE PAGAMENTO;PAIS DE ORIGEM DA CONTA DO MERCADO PAGO;TIPO DE OPERACAO;CANAL DE VENDA;PLAT".split(";");
        for (int x=0;x<campos102.length;x++) {
            if (!line.contains(campos102[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_MERCADOLIVRE6OTTCARTAO102";
        achouTipo = true;
        String [] campos103 = "FECHA DE COMPRA;FECHA DE ACREDITACION;FECHA DE LIBERACION DEL DINERO".split(";");
        for (int x=0;x<campos103.length;x++) {
            if (!line.contains(campos103[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_MERCADOPAGO7OTTCARTAO103";
        achouTipo = true;
        String [] campos104 = "DATA DA COMPRA;NOME DA CONTRAPARTE;APELIDO;PRODUTO;STATUS;DETALHE;VALOR DO PRODUTO".split(";");
        for (int x=0;x<campos104.length;x++) {
            if (!line.contains(campos104[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_MERCADOPAGO8OTTCARTAO104";
        achouTipo = true;
        String [] campos105 = "DATA DE LIBERA;TIPO DE REGISTRO;DESCRI;VALOR RECEBIDO POR COMPRAS COM SPLIT DE PAGAMENTO".split(";");
        for (int x=0;x<campos105.length;x++) {
            if (!line.contains(campos105[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_MERCADOPAGO9OTTCARTAO105";
        achouTipo = true;
        String [] campos106 = "ID|DESCRICAO|PARCELA;VALOR LANCAMENTO;VALOR BRUTO;TAXAS|DATA;TIPO DO LANCAMENTO".split(";");
        for (int x=0;x<campos106.length;x++) {
            if (!line.contains(campos106[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_MOIP1OTTCARTAO106";
        achouTipo = true;
        String [] campos107 = "DATA INICIAL;ID PROPRIO|NOME DO COMPRADOR;VALOR TOTAL;TARIFA|STATUS".split(";");
        for (int x=0;x<campos107.length;x++) {
            if (!line.contains(campos107[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_MOIP2OTTCARTAO107";
        achouTipo = true;
        String [] campos108 = "ID;NOME;CNPJ;DATA/HORA;CARTAO;SITEF;ADQUIRENTE".split(";");
        for (int x=0;x<campos108.length;x++) {
            if (!line.contains(campos108[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_MOOZ1OTTCARTAO108";
        achouTipo = true;
        String [] campos109 = "GRUPO: MULTVALE;REDE: MULTVALE;MOVIMENTOS EM LOJA;AUTORIZ;LOJA".split(";");
        for (int x=0;x<campos109.length;x++) {
            if (!line.contains(campos109[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_MULTVALEOTTCARTAO109";
        achouTipo = true;
        String [] campos110 = "NUMERO DO PEDIDO;E-MAIL;DATA;STATUS DO PAGAMENTO;VALOR DO FRETE;NOME DO COMPRADOR;FORMA DE PAGAMENTO;".split(";");
        for (int x=0;x<campos110.length;x++) {
            if (!line.contains(campos110[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_NUVEMSHOP1OTTCARTAO110";
        achouTipo = true;
        String [] campos111 = "CLIENTE NOME;CLIENTE EMAIL;CLIENTE CPF/CNPJ;CLIENTE TELEFONE;VALOR;VALOR NUMERICO;TAXA;VALOR NUMERICO DA TARIFA;INFORMACAO DO PAGAMENTO;COMENTARIO DA COBRANCA;COBRANCA CRIADA EM;IDENTIFICADOR".split(";");
        for (int x=0;x<campos111.length;x++) {
            if (!line.contains(campos111[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_OPENPIXOTTCARTAO111";
        achouTipo = true;
        String [] campos112 = "DATA;OPERACAO;METODO DE PAGAMENTO;ENTRADA;SAIDA;TAXA TOTAL DA OPERACAO;ENTRADA BRUTA;SAIDA BRUTA".split(";");
        for (int x=0;x<campos112.length;x++) {
            if (!line.contains(campos112[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAGARME1OTTCARTAO112";
        achouTipo = true;
        String [] campos113 = "STATUS;ID;DATA;NOME;FORMA DE PAGAMENTO;MERO DO CART;DOCUMENTO;TELEFONE;RESPOSTA DA OPERADORA".split(";");
        for (int x=0;x<campos113.length;x++) {
            if (!line.contains(campos113[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAGARME2OTTCARTAO113";
        achouTipo = true;
        String [] campos114 = "DATA DA TRANSACAO;OPERACAO;IDENTIFICACAO DA MAQUININHA;COD. NSU;COD. VENDA;NOME CLIENTE".split(";");
        for (int x=0;x<campos114.length;x++) {
            if (!line.contains(campos114[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAGBANK1OTTCARTAO114";
        achouTipo = true;
        String [] campos115 = "IDPLATAFORMA;CONSUMIDOR;DATA DA VENDA;DATA DO VENCIMENTO;DATA DO PAGAMENTO;DATA SALDO DISPONIVEL;VALOR BRUTO;STATUS".split(";");
        for (int x=0;x<campos115.length;x++) {
            if (!line.contains(campos115[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAGHIPER1OTTCARTAO115";
        achouTipo = true;
        String [] campos116 = "DATA_TRANSACAO VALOR_BRUTO  VALOR_TAXA  BANDEIRA_CARTAO_CREDITO DEBITO_CREDITO".split(";");
        for (int x=0;x<campos116.length;x++) {
            if (!line.contains(campos116[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAGSEGURO1OTTCARTAO116";
        achouTipo = true;
        String [] campos117 = "TRANSACAO_ID;CLIENTE_NOME;CLIENTE_EMAIL;DEBITO_CREDITO;TIPO_TRANSACAO;STATUS;TIPO_PAGAMENTO".split(";");
        for (int x=0;x<campos117.length;x++) {
            if (!line.contains(campos117[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAGSEGURO1OTTCARTAO117";
        achouTipo = true;
        String [] campos118 = "MERO DO CART;ID DA TRANSA;DATA DA TRAN;IDENTIFICA;OPERA;BANDEIRA;FORMA DE PAGAMENTO|VALOR;DIGO DA VENDA".split(";");
        for (int x=0;x<campos118.length;x++) {
            if (!line.contains(campos118[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAGSEGURO2OTTCARTAO118";
        achouTipo = true;
        String [] campos119 = "MERO DO CART;ID DA TRANS;DATA DA TRANS;OPERA;BANDEIRA;FORMA;PAGAMENTO;IDENTIFIC;DA MAQUININHA;VALOR BRUTO;VALOR;QUIDO;VALOR TAXA;NSU".split(";");
        for (int x=0;x<campos119.length;x++) {
            if (!line.contains(campos119[x])) {
                System.out.println("OH A CURPA: " + campos119[x]);
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAGSEGURO3OTTCARTAO119";
        achouTipo = true;
        String [] campos120 = "DATA DA VENDA|BANDEIRA|PRODUTO|VALOR BRUTO (R$)|TAXA ADMINISTRATIVA (%)|VALOR DA TAXA (R$)|VALOR LIQUIDO (R$)".split(";");
        for (int x=0;x<campos120.length;x++) {
            if (!line.contains(campos120[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAGSEGURO4OTTCARTAO120";
        achouTipo = true;
        String [] campos121 = "TRANSACTION ID;MERCHANT REFERENCE;AMOUNT;PROCESSING FEE;CHARGEBACK FEE;UPDATE DATE".split(";");
        for (int x=0;x<campos121.length;x++) {
            if (!line.contains(campos121[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAGSMILEOTTCARTAO121";
        achouTipo = true;
        String [] campos122 = "CODPAGUEVELOZ;NSUEMISSOR;NSUCLIENTE;EQUIPAMENTO;PAGANTE;VL.RETORNO".split(";");
        for (int x=0;x<campos122.length;x++) {
            if (!line.contains(campos122[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAGUEVELOZOTTCARTAO122";
        achouTipo = true;
        String [] campos123 = "DATE;STATUS;EXTERNAL ID;TRANSACTION ID;END TO END ID;TOTAL AMOUNT;E-MAIL;CUSTOMER NAME;TAX ID".split(";");
        for (int x=0;x<campos123.length;x++) {
            if (!line.contains(campos123[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAYDOISOTTCARTAO123";
        achouTipo = true;
        String [] campos124 = "NR. AUTORIZACAO;ID UNICO ERP;ID UNICO EQUALS;ADQUIRENTE;TIPO;PRODUTO;ADQ. PRODUTO;NR. TERMINAL;LOTE;ORIGEM DO CARTAO;NSU;LOTE UNICO;NR. REFERENCIA/PEDIDO;NR. FILIACAO".split(";");
        for (int x=0;x<campos124.length;x++) {
            if (!line.contains(campos124[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAYLY1OTTCARTAO124";
        achouTipo = true;
        String [] campos125 = "ADQUIRENTE;TIPO;PRODUTO;BANDEIRA;MEIO DE CAPTURA;DATA;PARCELA;QTD. VENDAS;VALOR BRUTO".split(";");
        for (int x=0;x<campos125.length;x++) {
            if (!line.contains(campos125[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAYLY2OTTCARTAO125";
        achouTipo = true;
        String [] campos126 = "TIPO;DISCRIMINADOR;STATUS;MOEDA;DATA DA TRANSA;DATA DO VENCIMENTO;DATA DO PROCESSAMENTO;CPF/CNPJ COMPRADOR;NOME COMPRADOR;E-MAIL DESTINAT;BANCO".split(";");
        for (int x=0;x<campos126.length;x++) {
            if (!line.contains(campos126[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAYMEEOTTCARTAO126";
        achouTipo = true;
        String [] campos127 = "DATA;HORA;FUSO HORARIO;NOME;TIPO;STATUS;MOEDA".split(";");
        for (int x=0;x<campos127.length;x++) {
            if (!line.contains(campos127[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAYPAL1OTTCARTAO127";
        achouTipo = true;
        String [] campos128 = "DATA|PAGAMENTOS RECEBIDOS|VALOR RECEBIDO|TARIFAS|REEMBOLSOS ENVIADOS|VALOR REEMBOLSADO".split(";");
        for (int x=0;x<campos128.length;x++) {
            if (!line.contains(campos128[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAYPAL2OTTCARTAO128";
        achouTipo = true;
        String [] campos129 = "ID DO PAYPAL:".split(";");
        for (int x=0;x<campos129.length;x++) {
            if (!line.contains(campos129[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAYPAL3OTTCARTAO129";
        achouTipo = true;
        String [] campos130 = "DATA;DESCRICAO;STATUS;MOEDA;BRUTO;TARIFA;LIQUIDO".split(";");
        for (int x=0;x<campos130.length;x++) {
            if (!line.contains(campos130[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PAYPAL4OTTCARTAO130";
        achouTipo = true;
        String [] campos131 = "CONSUMIDOR;ID;REFERENCE ID;TIPO;DATA;STATUS;TOTAL;TAXA;A RECEBER;OPERADOR".split(";");
        for (int x=0;x<campos131.length;x++) {
            if (!line.contains(campos131[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PICPAY1OTTCARTAO131";
        achouTipo = true;
        String [] campos132 = "COMPRADOR|DATA|ID|UNIDADE|STATUS|VALOR|REFERENCIA".split(";");
        for (int x=0;x<campos132.length;x++) {
            if (!line.contains(campos132[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PICPAY2OTTCARTAO132";
        achouTipo = true;
        String [] campos133 = "TITULO;DESCRICAO;TIPO MOVIMENTO;VALOR;TIPO TRANSACAO;STATUS;DATA".split(";");
        for (int x=0;x<campos133.length;x++) {
            if (!line.contains(campos133[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PICPAY3OTTCARTAO133";
        achouTipo = true;
        String [] campos134 = "DATE E HORA DA VENDA;SOLUCAO DE CAPTURA;CUSTO FIXO;STATUS;NSU;TID;PAGADOR PICPAY".split(";");
        for (int x=0;x<campos134.length;x++) {
            if (!line.contains(campos134[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PICPAY4OTTCARTAO134";
        achouTipo = true;
        String [] campos135 = "DATA TRANSACAO;PRODUTO;ESTABELECIMENTO;CNPJ;NOME LANCAMENTO;DATA REPASSE;EMPRESA ORIGEM;TERMINAL".split(";");
        for (int x=0;x<campos135.length;x++) {
            if (!line.contains(campos135[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_POLICARDOTTCARTAO135";
        achouTipo = true;
        String [] campos136 = "EMPRESA|NUMERO|RAZAO SOCIAL|CNPJ|DT.REPASSE;PRODUTO|MEIO DE CAPTURA".split(";");
        for (int x=0;x<campos136.length;x++) {
            if (!line.contains(campos136[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_POLICARDOTTCARTAO136";
        achouTipo = true;
        String [] campos137 = "EMPRESA|NUMERO|RAZAO SOCIAL|CNPJ|DT.REPASSE;PRODUTO|VL.BRUTO".split(";");
        for (int x=0;x<campos137.length;x++) {
            if (!line.contains(campos137[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_POLICARDOTTCARTAO137";
        achouTipo = true;
        String [] campos138 = "DATA|TIPO PRODUTO|ESTABELECIMENTO|CNPJ|TIPO LANCAMENTO".split(";");
        for (int x=0;x<campos138.length;x++) {
            if (!line.contains(campos138[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_POLICARDOTTCARTAO138";
        achouTipo = true;
        String [] campos139 = "PEDIDO|DATA;MODULO;IDENTIFICACAO;CLIENTE|ORIGEM;PAGTO;VALOR".split(";");
        for (int x=0;x<campos139.length;x++) {
            if (!line.contains(campos139[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PRATOOTTCARTAO139";
        achouTipo = true;
        String [] campos140 = "CARTAO PRE-DATADO - RELATORIO DE VENDAS".split(";");
        for (int x=0;x<campos140.length;x++) {
            if (!line.contains(campos140[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PREDATADO1OTTCARTAO140";
        achouTipo = true;
        String [] campos141 = "TERMINAL;COD.ESTAB.;NSU RESP;CARTAO;TIPO TRANS.;BANDEIRA".split(";");
        for (int x=0;x<campos141.length;x++) {
            if (!line.contains(campos141[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PUNTO1OTTCARTAO141";
        achouTipo = true;
        String [] campos142 = "N ESTABELECIMENTO;CNPJ;DATA DA VENDA;HORA DA VENDA;VALOR DA VENDA;VALOR DO PAGAMENTO;DESCONTO DA TAXA;BANDEIRA;FORMA DE PAGAMENTO;DATA DO CANCELAMENTO".split(";");
        for (int x=0;x<campos142.length;x++) {
            if (!line.contains(campos142[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_PUNTO2OTTCARTAO142";
        achouTipo = true;
        String [] campos143 = "DATA DA VENDA;HORA DA VENDA;STATUS DA VENDA;VALOR DA VENDA ORIGINAL;VALOR DA VENDA ATUALIZADO;MODALIDADE;TIPO;NUMERO DE PARCELAS;BANDEIRA;TAXA MDR;VALOR MDR;TAXA DE ANTECIPACAO FLEX".split(";");
        for (int x=0;x<campos143.length;x++) {
            if (!line.contains(campos143[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_REDECARD0OTTCARTAO143";
        achouTipo = true;
        String [] campos144 = "DATA DA VENDA;HORA DA VENDA;VALOR DA VENDA ORIGINAL;VALOR DA VENDA ATUALIZADO;MODALIDADE;BANDEIRA;TAXA MDR;VALOR TAXA DE ANTENCIPACAO FLEX".split(";");
        for (int x=0;x<campos144.length;x++) {
            if (!line.contains(campos144[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_REDECARD1OTTCARTAO144";
        achouTipo = true;
        String [] campos145 = "DATA DA VENDA|HORA DA VENDA|VALOR DA VENDA ORIGINAL;MERO DE PARCELAS;MODALIDADE;TIPO;BANDEIRA;TAXA MDR;TAXAS DESCONTADAS;FLEX;VALOR LIQUIDO;CUPOM FISCAL;NOTA FISCAL;MERO DO CARTAO".split(";");
        for (int x=0;x<campos145.length;x++) {
            if (!line.contains(campos145[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_REDECARD10OTTCARTAO145";
        achouTipo = true;
        String [] campos146 = "DATA DA VENDA;VALOR DA VENDA;MODALIDADE;BANDEIRA;TAXA MDR;VALOR DESCONTADO".split(";");
        for (int x=0;x<campos146.length;x++) {
            if (!line.contains(campos146[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_REDECARD11OTTCARTAO146";
        achouTipo = true;
        String [] campos147 = "ESTABELECIMENTO;DATA APRESENTACAO;DATA VENCIMENTO;NUMERO RESUMO;PRAZO RECEBIMENTO;BANDEIRA;QTD TRANSACOES;VALOR APRESENTADO".split(";");
        for (int x=0;x<campos147.length;x++) {
            if (!line.contains(campos147[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_REDECARD2OTTCARTAO147";
        achouTipo = true;
        String [] campos148 = "DATA DA VENDA;HORA DA VENDA;STATUS DA VENDA;VALOR DA VENDA ORIGINAL;VALOR DA VENDA ATUALIZADO;MODALIDADE;BANDEIRA;TAXA MDR;VALOR TAXA DE ANTENCIPACAO FLEX".split(";");
        for (int x=0;x<campos148.length;x++) {
            if (!line.contains(campos148[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_REDECARD3OTTCARTAO148";
        achouTipo = true;
        String [] campos149 = "DATA DA VENDA;HORA DA VENDA;STATUS DA VENDA;VALOR DA VENDA ORIGINAL;VALOR DA VENDA ATUALIZADO;MODALIDADE;BANDEIRA;VALOR MDR;CNPJ".split(";");
        for (int x=0;x<campos149.length;x++) {
            if (!line.contains(campos149[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_REDECARD4OTTCARTAO149";
        achouTipo = true;
        String [] campos150 = "DATA DA VENDA;HORA DA VENDA;VALOR DA VENDA ORIGINAL;VALOR DA VENDA ATUALIZADO;MODALIDADE;BANDEIRA;VALOR MDR;CNPJ".split(";");
        for (int x=0;x<campos150.length;x++) {
            if (!line.contains(campos150[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_REDECARD5OTTCARTAO150";
        achouTipo = true;
        String [] campos151 = "DATA DA VENDA;HORA DA VENDA;VALOR DA VENDA;NUMERO DE PARCELAS;MODALIDADE;TIPO;BANDEIRA".split(";");
        for (int x=0;x<campos151.length;x++) {
            if (!line.contains(campos151[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_REDECARD6OTTCARTAO151";
        achouTipo = true;
        String [] campos152 = "DATA DO RECEBIMENTO;DATA ORIGINAL DA VENDA;VALOR BRUTO DA PARCELA ORIGINAL|VALOR BRUTO DA PARCELA ATUALIZAD|TAXA MDR;TID;TOKENIZADA;IATA".split(";");
        for (int x=0;x<campos152.length;x++) {
            if (!line.contains(campos152[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_REDECARD7OTTCARTAO152";
        achouTipo = true;
        String [] campos153 = "DATA DA VENDA;VALOR DA VENDA ORIGINAL;MODALIDADE;BANDEIRA;TAXA MDR;VALOR TOTAL DAS TAXAS DESCONTADAS (MDR+FLEX)".split(";");
        for (int x=0;x<campos153.length;x++) {
            if (!line.contains(campos153[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_REDECARD8OTTCARTAO153";
        achouTipo = true;
        String [] campos154 = "DATA DA VENDA|TIPO|VALOR BRUTO|VALOR LIQUIDO|BANDEIRA|NSU|STATUS".split(";");
        for (int x=0;x<campos154.length;x++) {
            if (!line.contains(campos154[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_REDEFLEX1OTTCARTAO154";
        achouTipo = true;
        String [] campos155 = "NUMERO DO CARTAO;MODALIDADE;VALOR BRUTO DA VENDA|VALOR LIQUIDO DA VENDA;PARCELA;AGENDA DE VENDAS".split(";");
        for (int x=0;x<campos155.length;x++) {
            if (!line.contains(campos155[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SAFRA_AGE_VENDASOTTCARTAO155";
        achouTipo = true;
        String [] campos156 = "NUMERO DO CARTAO;MODALIDADE;VALOR BRUTO;TIPO DE CAPTURA;GESTAO DE VENDAS".split(";");
        for (int x=0;x<campos156.length;x++) {
            if (!line.contains(campos156[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SAFRA_REC_VENDASOTTCARTAO156";
        achouTipo = true;
        String [] campos157 = "NUMERO DO CARTAO;MODALIDADE;VALOR BRUTO DA VENDA|VALOR LIQUIDO DA VENDA;PARCELA;RECEBIVEIS DE VENDAS".split(";");
        for (int x=0;x<campos157.length;x++) {
            if (!line.contains(campos157[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SAFRA_REC_VENDASOTTCARTAO157";
        achouTipo = true;
        String [] campos158 = "DATA DEVENDA;VENDAS;VALORBRUTO".split(";");
        for (int x=0;x<campos158.length;x++) {
            if (!line.contains(campos158[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SAFRA1OTTCARTAO158";
        achouTipo = true;
        String [] campos159 = "DATA DE VENDA;VENDAS;VALOR BRUTO;VALOR TAXA/ADMINISTRA;QUIDO".split(";");
        for (int x=0;x<campos159.length;x++) {
            if (!line.contains(campos159[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SAFRA1OTTCARTAO159";
        achouTipo = true;
        String [] campos160 = "DATA DEVENDA|EC|BANDEIRA|PRODUTO|TIPO DECAPTURA".split(";");
        for (int x=0;x<campos160.length;x++) {
            if (!line.contains(campos160[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SAFRA2OTTCARTAO160";
        achouTipo = true;
        String [] campos161 = "NUMERO SEQUENCIAL UNICO|DATA|CODIGO DE AUTORIZACAO;TIPO DE CAPTURA|MODALIDADE|BANDEIRA".split(";");
        for (int x=0;x<campos161.length;x++) {
            if (!line.contains(campos161[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SAFRAPAY_4OTTCARTAO161";
        achouTipo = true;
        achouTipo = false;
        if (nomeArquivo.toUpperCase().contains("SEM PARAR")) achouTipo = true;
        if (achouTipo) return "CARTAO_SEMPARAROTTCARTAO162";
        achouTipo = true;
        String [] campos163 = "DATA|HOMOLOGADO".split(";");
        for (int x=0;x<campos163.length;x++) {
            if (!line.contains(campos163[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SENFFOTTCARTAO163";
        achouTipo = true;
        String [] campos164 = "CARTAO;CLIENTE;LOJA;DATA;PARCELAS".split(";");
        for (int x=0;x<campos164.length;x++) {
            if (!line.contains(campos164[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SENFFOTTCARTAO164";
        achouTipo = true;
        String [] campos165 = "NUMERO DA SEQUENCIA;ID DO PEDIDO;ID DO REEMBOLSO;NOME DE USUARIO (COMPRADOR);DATA DE CRIACAO DO PEDIDO;METODO DE PAGAMENTO DO COMPRADOR;DATA DE CONCLUSAO DO PAGAMENTO;PRECO ORIGINAL DO PRODUTO".split(";");
        for (int x=0;x<campos165.length;x++) {
            if (!line.contains(campos165[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SHOPEE1OTTCARTAO165";
        achouTipo = true;
        String [] campos166 = "BANDEIRA;DATA VENDA;VALOR BRUTO;ULTIMO STATUS;PARCELA;VALOR ANTECIPADO;COD;DE AUTORIZA;NSU;TAXA;TIPO".split(";");
        for (int x=0;x<campos166.length;x++) {
            if (!line.contains(campos166[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SICOOB1OTTCARTAO166";
        achouTipo = true;
        String [] campos167 = "CODIGO AUTORIZACAO;DATA TRANSACAO;HORA TRANSACAO;DESCRICAO PRODUTO TRANSACAO;DESCRICAO BANDEIRA;DESCRICAO TIPO CARTAO;VALOR BRUTO PARCELA;VALOR DESCONTO PARCELA".split(";");
        for (int x=0;x<campos167.length;x++) {
            if (!line.contains(campos167[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SICOOBCARDOTTCARTAO167";
        achouTipo = true;
        String [] campos168 = "POSTAGEM;DATA DE CREDITO;ESTABELECIMENTO;PAGAMENTO;RESUMO DE VENDAS;COMPROVANTE;TERMINAL;STATUS;DATA TRANS;TIPO TRANS;BANDEIRA;VALOR;TIPO DE CARTAO;PAGAMENTO BRUTO;PARCELADO;".split(";");
        for (int x=0;x<campos168.length;x++) {
            if (!line.contains(campos168[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SICREDI1OTTCARTAO168";
        achouTipo = true;
        String [] campos169 = "DATA DA VENDA;COD. DE AUTORIZACAO;PRODUTO;PARCELAS;BANDEIRA;CANAL;VALOR BRUTO;VALOR LIQUIDO;STATUS;NUMERO DO TERMINAL;COMPROVANTE DA VENDA;COD. DO PEDIDO;VALOR DA TAXA;NUMERO DO ESTABELECIMENTO".split(";");
        for (int x=0;x<campos169.length;x++) {
            if (!line.contains(campos169[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SICREDI2OTTCARTAO169";
        achouTipo = true;
        String [] campos170 = "DATA DA VENDA;CODIGO DE ESTABELECIMENTO;TIPO DE CARTAO;CARTAO PRE PAGO;DATA PREVISTA DE PAGAMENTO DA VENDA".split(";");
        for (int x=0;x<campos170.length;x++) {
            if (!line.contains(campos170[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SICREDI3OTTCARTAO170";
        achouTipo = true;
        String [] campos171 = "DATA DE PAGAMENTO|CODIGO DE PAGAMENTO|TIPO DE PAGAMENTO".split(";");
        for (int x=0;x<campos171.length;x++) {
            if (!line.contains(campos171[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SICREDI4OTTCARTAO171";
        achouTipo = true;
        String [] campos172 = "DATA DA VENDA;HORA DA VENDA;CODIGO DE AUTORIZACAO;CODIGO DO ESTABELECIMENTO;COMPROVANTE DE VENDA;CODIGO DO PEDIDO;CANAL;NUMERO DO TERMINAL;PRODUTO;PARCELAS;TIPO DE CARTAO;VALOR LIQUIDO DA PARCELA/TRAN".split(";");
        for (int x=0;x<campos172.length;x++) {
            if (!line.contains(campos172[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SICREDI5OTTCARTAO172";
        achouTipo = true;
        String [] campos173 = "DATA DA VENDA;COD. DE AUTORIZACAO;PRODUTO;PARCELAS;BANDEIRA;CANAL;VALOR BRUTO|VALOR DA TAXA|VALOR LIQUIDO;STATUS;NUMERO DO TERMINAL;COMPROVANTE DA VENDA;COD. DO PEDIDO;NUMERO DO ESTABELECIMENTO".split(";");
        for (int x=0;x<campos173.length;x++) {
            if (!line.contains(campos173[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SICREDI6OTTCARTAO173";
        achouTipo = true;
        String [] campos174 = "DATA DA VENDA;STATUS;MERO DO CART;PRODUTO;PARCELA;TERMINAL LOGICO;DATA DO CR;VALOR TRANSA;VALOR DA PARCELA;QUIDO".split(";");
        for (int x=0;x<campos174.length;x++) {
            if (!line.contains(campos174[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SICREDI7OTTCARTAO174";
        achouTipo = true;
        achouTipo = false;
        if (achouTipo) return "CARTAO_SIPAGOTTCARTAO175";
        achouTipo = true;
        String [] campos176 = "ESTABELECIMENTO;DATA DO PAGAMENTO;BANDEIRA;;PRODUTO;;PLANO DE VENDA;;QUANTIDADE;VALOR BRUTO;DESCONTO;QUIDO".split(";");
        for (int x=0;x<campos176.length;x++) {
            if (!line.contains(campos176[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SIPAG08OTTCARTAO176";
        achouTipo = true;
        String [] campos177 = "DATA DA TRANSA;DIGO DO CLIENTE;PRODUTO;VALOR PLANO;DESC.;CODIGO ECI;TERMINAL;TIPO DE CAPTURA".split(";");
        for (int x=0;x<campos177.length;x++) {
            if (!line.contains(campos177[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SIPAG1OTTCARTAO177";
        achouTipo = true;
        String [] campos178 = "ESTABELECIMENTO;DATA DO PAGAMENTO;BANDEIRA;PRODUTO;QUANTIDADE;VALOR BRUTO;DESCONTO;QUIDO".split(";");
        for (int x=0;x<campos178.length;x++) {
            if (!line.contains(campos178[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SIPAG10OTTCARTAO178";
        achouTipo = true;
        String [] campos179 = "CLIENTE;RESUMO DE VENDAS;PRODUTO;PARCELA;PLANO;COMPROVANTES;VALOR BRUTO;CASHBACK AMOUNT;REVERSE INTERCHANGE".split(";");
        for (int x=0;x<campos179.length;x++) {
            if (!line.contains(campos179[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SIPAG2OTTCARTAO179";
        achouTipo = true;
        String [] campos180 = "DATA DA TRANSACAO;N DA TRANSACAO;ID VENDA;BANDEIRA;NUMERO DA CONTA CORRENTE;N AUTORIZACAO".split(";");
        for (int x=0;x<campos180.length;x++) {
            if (!line.contains(campos180[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SIPAG4OTTCARTAO180";
        achouTipo = true;
        String [] campos181 = "DATA DA VENDA;STATUS;BANDEIRA;PRODUTO;VENDA;TERMINAL LOGICO;PARCELA;VALOR DA PARCELA".split(";");
        for (int x=0;x<campos181.length;x++) {
            if (!line.contains(campos181[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SIPAG5OTTCARTAO181";
        achouTipo = true;
        String [] campos182 = "DATA DAS TRANSA;BANDEIRA;PRODUTO;PLANO;VALOR BRUTO;DESCONTO;QUANTIDADES".split(";");
        for (int x=0;x<campos182.length;x++) {
            if (!line.contains(campos182[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SIPAG6OTTCARTAO182";
        achouTipo = true;
        String [] campos183 = "DO ESTABELECIMENTO;DATA DA TRANSA;DA TRANSA;CV;BANDEIRA;PRODUTO;PLANO DE VENDA;PARCELA;TOTAL DE PARCELA".split(";");
        for (int x=0;x<campos183.length;x++) {
            if (!line.contains(campos183[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SIPAG7OTTCARTAO183";
        achouTipo = true;
        String [] campos184 = "ESTABELECIMENTO;DATA DA TRANSA;BANDEIRA;FORMA DE PAGAMENTO;PLANO DE VENDA;PARCELA;TOTAL DE PARCELA;TERMINAL;TIPO CAPTURA;INDICADOR DE CANCELAMENTO DA VENDA;RESUMO DA VENDA;DATA PREVISTA;ORDEM DE PA".split(";");
        for (int x=0;x<campos184.length;x++) {
            if (!line.contains(campos184[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SIPAG9OTTCARTAO184";
        achouTipo = true;
        String [] campos185 = "ESTABELECIMENTO;ASSOCIADO;FORMA DE CAPTURA;NSU;PDV;DATA DE REPASSE;VALOR DA VENDA;VALOR DA COMISS;VALOR LIQUIDO".split(";");
        for (int x=0;x<campos185.length;x++) {
            if (!line.contains(campos185[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SMCCARDOTTCARTAO185";
        achouTipo = true;
        String [] campos186 = "CNPJ;RAZAO SOCIAL;DATA DO PROCESSAMENTO;DATA DA TRANS;REDE CAPTURA;DESCRICAO;VALOR BRUTO".split(";");
        for (int x=0;x<campos186.length;x++) {
            if (!line.contains(campos186[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SODEXO1OTTCARTAO186";
        achouTipo = true;
        String [] campos187 = "NRO TRANSA;DATA LANCAMENTO;CIDADE;UF;PLACA;COMBUST;LITROS;VALOR LITRO;NRO TERMINAL;NSU-O".split(";");
        for (int x=0;x<campos187.length;x++) {
            if (!line.contains(campos187[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SODEXO2OTTCARTAO187";
        achouTipo = true;
        String [] campos188 = "AMOUNT;BALANCE;CREATED;DESCRIPTION;EXTERNALID;FEE;ID;RECEIVERID;SENDERID;SOURCE;TAGS".split(";");
        for (int x=0;x<campos188.length;x++) {
            if (!line.contains(campos188[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_STARKBANKOTTCARTAO188";
        achouTipo = true;
        String [] campos189 = "STATUS|DATA E HORA;DOC;MAQUINA;MEIO DE PGTO;BANDEIRA|VALOR TOTAL".split(";");
        for (int x=0;x<campos189.length;x++) {
            if (!line.contains(campos189[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_STELOOTTCARTAO189";
        achouTipo = true;
        String [] campos190 = "DOCUMENTO;NOME FANTASIA;CATEGORIA;DATA DE VENCIMENTO;N DA PARCELA;QTD DE PARCELAS;DESCONTO DE MDR;STONECODE;HORA DA VENDA;TIPO;BANDEIRA;STONE ID;N CARTAO;VALOR BRUTO;VALOR LIQUIDO;DATA DO ULTIMO".split(";");
        for (int x=0;x<campos190.length;x++) {
            if (!line.contains(campos190[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_STONE1OTTCARTAO190";
        achouTipo = true;
        String [] campos191 = "HORA DA VENDA;TIPO;BANDEIRA;MEIO DE CAPTURA;STONE ID".split(";");
        for (int x=0;x<campos191.length;x++) {
            if (!line.contains(campos191[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_STONE2OTTCARTAO191";
        achouTipo = true;
        String [] campos192 = "STONECODE;DOCUMENTO;NOME FANTASIA;CATEGORIA;VENDA;VCTO;STONE ID;BANDEIRA;DESCONTO;CHAVE EXTERNA".split(";");
        for (int x=0;x<campos192.length;x++) {
            if (!line.contains(campos192[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_STONE3OTTCARTAO192";
        achouTipo = true;
        String [] campos193 = "STONECODE;DATA DA VENDA;BANDEIRA;PRODUTO;STONE ID".split(";");
        for (int x=0;x<campos193.length;x++) {
            if (!line.contains(campos193[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_STONE4OTTCARTAO193";
        achouTipo = true;
        String [] campos194 = "E-MAIL;TIPO DE CARTAO;VALOR TOTAL;TAXA;DEPOSITO;MODO DE ENTRADA".split(";");
        for (int x=0;x<campos194.length;x++) {
            if (!line.contains(campos194[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_SUMUP1OTTCARTAO194";
        achouTipo = true;
        String [] campos195 = "DATAAUTORIZACAO;NUMEROCARTAO;NOME;DOCUMENTO;CNPJ;RAZAOSOCIAL;VALORMOEDALOCAL".split(";");
        for (int x=0;x<campos195.length;x++) {
            if (!line.contains(campos195[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_TICKET1OTTCARTAO195";
        achouTipo = true;
        String [] campos196 = "DATA DA TRANSACAO;PRODUTO;VL TRANSACAO;CNPJ".split(";");
        for (int x=0;x<campos196.length;x++) {
            if (!line.contains(campos196[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_TICKET2OTTCARTAO196";
        achouTipo = true;
        String [] campos197 = "NUMERO;DATA CORTE;DATA CRED/DEB;COD. ESTABELECIMENTO;DATA TRANSACAO".split(";");
        for (int x=0;x<campos197.length;x++) {
            if (!line.contains(campos197[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_TICKET3OTTCARTAO197";
        achouTipo = true;
        String [] campos198 = "DATA DE VENDA;QUANTIDADE;MODALIDADE;BANDEIRA;VALOR BRUTO;VALOR LIQUIDO".split(";");
        for (int x=0;x<campos198.length;x++) {
            if (!line.contains(campos198[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_TKSOTTCARTAO198";
        achouTipo = true;
        String [] campos199 = "DATA;OPERA;ID DA OPERA;TODO DE PAGAMENTO;ENTRADA;TAXA TOTAL DA OPERA".split(";");
        for (int x=0;x<campos199.length;x++) {
            if (!line.contains(campos199[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_TON1OTTCARTAO199";
        achouTipo = true;
        String [] campos200 = "DATA;OPERA;ID DA OPERA;TODO DE PAGAMENTO;ENTRADA;TAXA DE OPERA".split(";");
        for (int x=0;x<campos200.length;x++) {
            if (!line.contains(campos200[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_TON2OTTCARTAO200";
        achouTipo = true;
        String [] campos201 = "TRANSACAO;VALOR_BRUTO;VALOR_LIQUIDO;BANDEIRA;QTDE_PARCELAS;DATA_CRIACAO;DATA_PAGAMENTO;METODO_PAGAMENTO;STATUS;TYPE;LIQUIDATION_ENGINE".split(";");
        for (int x=0;x<campos201.length;x++) {
            if (!line.contains(campos201[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_TON3OTTCARTAO201";
        achouTipo = true;
        String [] campos202 = "PAYOUT ID;MERCHANT REFERENCE;DEDUCTED AMOUNT;SOURCE CURRENCY;AMOUNT RECEIVED;PAYOUT CURRENCY".split(";");
        for (int x=0;x<campos202.length;x++) {
            if (!line.contains(campos202[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_TRANSFERSMILE1OTTCARTAO202";
        achouTipo = true;
        String [] campos203 = "TRANSACTION ID|TYPE|CURRENCY|AMOUNT|STATUS|CREATION DATE".split(";");
        for (int x=0;x<campos203.length;x++) {
            if (!line.contains(campos203[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_TRANSFERSMILE2OTTCARTAO203";
        achouTipo = true;
        String [] campos204 = "DT TRANSACAO;DT CREDITO;CARTAO;DESCRICAO DA TRANSACAO;N AUTORIZ.;VALOR BRUTO;VALOR LIQUIDO".split(";");
        for (int x=0;x<campos204.length;x++) {
            if (!line.contains(campos204[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_TRICARD_EXCEL1OTTCARTAO204";
        achouTipo = true;
        String [] campos205 = "NOMSUBREDE|DATA;AUTORIZ;TRANSACAO;CARTAO".split(";");
        for (int x=0;x<campos205.length;x++) {
            if (!line.contains(campos205[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_TRIOCARDOTTCARTAO205";
        achouTipo = true;
        String [] campos206 = "DATA|ID;HIST;RICO;DEBITO|CREDITO|TIPO".split(";");
        for (int x=0;x<campos206.length;x++) {
            if (!line.contains(campos206[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_TRUDATA1OTTCARTAO206";
        achouTipo = true;
        String [] campos207 = "DATA VENDA;EC;MODALIDADE;NSU;NUMERO PARCELAS;AUTORIZACAO;BANDEIRA;VALOR DA VENDA;VALOR A RECEBER;VALOR ANTECIPADO;NUMERO DO TERMINAL;TIPO DO TERMINAL".split(";");
        for (int x=0;x<campos207.length;x++) {
            if (!line.contains(campos207[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_UNICA1OTTCARTAO207";
        achouTipo = true;
        String [] campos208 = "DATA TRANS.;DATA PAGTO.;BANDEIRA;PLATAFORMA CAPTURA;TIPO;MODALIDADE;D. AUT.;NSU REDE;NSU AUTO;STATUS;PARCELA".split(";");
        for (int x=0;x<campos208.length;x++) {
            if (!line.contains(campos208[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_UNIPRIMEOTTCARTAO208";
        achouTipo = true;
        String [] campos209 = "DATA TRANS.;DATA PAGTO.;BANDEIRA;PLAT. CAPTURA;TIPO;MODALIDADE;D. AUT.;NSU REDE;NSU AUTO;STATUS;PARCELA".split(";");
        for (int x=0;x<campos209.length;x++) {
            if (!line.contains(campos209[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_UNIPRIME2OTTCARTAO209";
        achouTipo = true;
        String [] campos210 = "DESCRICAO;COMPRADOR;CODIGO DE AUTORIZACAO;DATA;PARCELA/TOTAL;VALOR".split(";");
        for (int x=0;x<campos210.length;x++) {
            if (!line.contains(campos210[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_VALECARD1OTTCARTAO210";
        achouTipo = true;
        achouTipo = false;
        if (nomeArquivo.toUpperCase().contains("VALOREM")) achouTipo = true;
        if (achouTipo) return "CARTAO_VALOREMPAY_EXCELOTTCARTAO211";
        achouTipo = true;
        String [] campos212 = "DATA;SALDO;CREDITOS;DEBITOS /;ENCARGOS;COMPRAS;TRIBUTOS;SALDO;FATURA;JUROS; ANTECIPACAO;DESAGIO;COBERTURA;DESAGIO;COBERTURA;RECEBIVEIS".split(";");
        for (int x=0;x<campos212.length;x++) {
            if (!line.contains(campos212[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_VERDECARD_PDF1OTTCARTAO212";
        achouTipo = true;
        String [] campos213 = "VERDECARD;DATA;AGENDAMENTO CIP  DATA DO REPASSE".split(";");
        for (int x=0;x<campos213.length;x++) {
            if (!line.contains(campos213[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_VERDECARD1OTTCARTAO213";
        achouTipo = true;
        String [] campos214 = "BANRISUL;DATA OPERACAO;CONTRATO;BANDEIRA;VALOR OPERACAO;VALOR LIQUIDO".split(";");
        for (int x=0;x<campos214.length;x++) {
            if (!line.contains(campos214[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_VERO_SMARTPDF1OTTCARTAO214";
        achouTipo = true;
        String [] campos215 = "DATA;HORA;AUTOR.;PORTADOR;PRODUTO VENDA;PARCELAS;VALOR;FECH.".split(";");
        for (int x=0;x<campos215.length;x++) {
            if (!line.contains(campos215[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_VIASOFTPAY1OTTCARTAO215";
        achouTipo = true;
        achouTipo = false;
        if (nomeArquivo.toUpperCase().contains("VR ALI")) achouTipo = true;
        if (achouTipo) return "CARTAO_VRALIMENTACAO1OTTCARTAO216";
        achouTipo = true;
        String [] campos217 = "CNPJ;PRODUTO;DATA;HORA;CARTAO;VALOR;NUMERO AUTORIZACAO".split(";");
        for (int x=0;x<campos217.length;x++) {
            if (!line.contains(campos217[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_VRALIMENTACAO2OTTCARTAO217";
        achouTipo = true;
        String [] campos218 = "VS CARD ALIMENTA".split(";");
        for (int x=0;x<campos218.length;x++) {
            if (!line.contains(campos218[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_VSCARDOTTCARTAO218";
        achouTipo = true;
        String [] campos219 = "TRANSLATION MISSING:".split(";");
        for (int x=0;x<campos219.length;x++) {
            if (!line.contains(campos219[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_YAPAY1OTTCARTAO219";
        achouTipo = true;
        String [] campos220 = "ID;DATA DA TRANSA;HORARIO;NUMERO PEDIDO;VENDEDOR;E-MAIL - LOJA;CLIENTE;E-MAIL DO CLIENTE;TELEFONE VENDEDOR;SUB LOJA;MEIO DE PAGAMENTO;PARCELAS;VALOR PAGO;VALOR".split(";");
        for (int x=0;x<campos220.length;x++) {
            if (!line.contains(campos220[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_YAPAY2OTTCARTAO220";
        achouTipo = true;
        String [] campos221 = "DATA;ID TRANSACAO;N. PEDIDO;DESCRICAO;ORIGEM;FORMA DE PAGAMENTO;PARCELAS;VALOR LIQ.;VALOR BRUTO;TAXA RETENCAO;TAXA ANTECIPACAO".split(";");
        for (int x=0;x<campos221.length;x++) {
            if (!line.contains(campos221[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAO_YAPAY3OTTCARTAO221";
        achouTipo = true;
        String [] campos222 = "DATA DA TRANSACAO;NUMERO DA TRANSACAO;VALOR DA TRANSACAO (R$);VALOR DA PARCELA (R$);VALOR A RECEBER (R$);CARTAO".split(";");
        for (int x=0;x<campos222.length;x++) {
            if (!line.contains(campos222[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAOSAUDESERVICE1OTTCARTAO222";
        achouTipo = true;
        String [] campos223 = "DATA DA TRANSACAO;NUMERO DA TRANSACAO;NSU;TECNOLOGIA;NOME DO PACIENTE".split(";");
        for (int x=0;x<campos223.length;x++) {
            if (!line.contains(campos223[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "CARTAOSAUDESERVICE2OTTCARTAO223";
        achouTipo = true;
        String [] campos224 = "PEDIDO;DATA|RESTAURANTE|ID DO RESTAURANTE|TAXA DE ENTREGA|VALOR DOS ITENS|INCENTIVO PROMOCIONAL DO IFOOD|INCENTIVO PROMOCIONAL DA LOJA|TOTAL DO PEDIDO|FORMAS DE PAGAMENTO|DATA DO CANCELAMENTO".split(";");
        for (int x=0;x<campos224.length;x++) {
            if (!line.contains(campos224[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "IFOOD_PADRAO_3OTTCARTAO224";
        achouTipo = true;
        String [] campos225 = "PRODUTO: ALIMENTA;DATA DO PROCESSAMENTO|DATA DA TRANSA;REDE CAPTURA|DESCRI;AUTORIZA;VALOR BRUTO R$|DATA DE PAGAMENTO||".split(";");
        for (int x=0;x<campos225.length;x++) {
            if (!line.contains(campos225[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "SODEXO_PADRAO_1OTTCARTAO225";
        achouTipo = true;
        String [] campos226 = "DATA RECEBIMENTO;DOCUMENTO;CLIENTE;DETALHES DO RECEBIMENTO".split(";");
        for (int x=0;x<campos226.length;x++) {
            if (!line.contains(campos226[x])) {
                achouTipo = false; break; }
        }
        if (achouTipo) return "ZZPADRAOOTTIMIZZAREC226";
        achouTipo = true;
        return tipoPlanilha;
    }

}
