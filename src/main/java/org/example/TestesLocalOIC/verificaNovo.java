package org.example.TestesLocalOIC;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class verificaNovo {
    public static void main(String[] args) throws IOException {
        // Defina o caminho do arquivo CSV
        String caminhoDoArquivo = "H:\\Meu Drive\\N4\\20240527\\2405-039495\\Testepdf_001__TESTE_PDF_OTTIMIZZA_itau 29550._PAGAR.csv";

        // Método 1: Usando BufferedReader
        File arquivoCSV = new File(caminhoDoArquivo);
        StringBuilder textoArquivo = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                textoArquivo.append(linha).append(System.lineSeparator());
            }
        }

        // Método 2: Usando Files (mais simples e eficiente)
        // String textoArquivo = new String(Files.readAllBytes(Paths.get(caminhoDoArquivo)));

        String ress = verificaConversorNovo(textoArquivo.toString());
        System.out.println("RESULT:" + ress);
    }

    /*
    passo 1
    colar verificaConversorNovo() do s1

    passo 2
    criar int i = 0; no começo do verificaConversorNovo()

    passo 3
    dar replace all em
    "if (" para "if("

    passo 4
    dar replace all em
    "return true" para "System.out.println("ENTROU NO NUM " + i);"

    passo 5
    dar replace all em
    "        if("
    para
    "       i++;
            if("

    */

    public static String verificaConversorNovo(String arquivoCompleto) {
        int i = 1;
        System.out.println("VEM DO NUM "+i+ "IFS:" + arquivoCompleto.contains("DATA") +"&&"+ arquivoCompleto.contains("AG/ORIGEM") +"&&"+ arquivoCompleto.contains("0800 728 0728") +" --->"+arquivoCompleto.contains("0800 728"));

        if(((arquivoCompleto.contains("NU PAGAMENTOS S.A.") && arquivoCompleto.contains("NU FINANCEIRA S.A.")) &&
                arquivoCompleto.contains("0800 887 0463")) || (arquivoCompleto.contains("NU FINANCEIRA") || arquivoCompleto.contains("18.236.120/0001-58"))) {
            return ("VEM DO NUM "+i); //NUBANK
        }
        i++;
        if((arquivoCompleto.contains("EXTRATO DE: AGENCIA:") || arquivoCompleto.contains("EXTRATO DE: AG:")) && arquivoCompleto.contains("DEMONSTRATIVO")) {
            return ("VEM DO NUM "+i); //BRADESCO
        }
        i++;
        if(arquivoCompleto.contains("BANCO SAFRA") && (arquivoCompleto.contains("EXTRATO DE MOVIMENTACAO") || (arquivoCompleto.contains("3175 8248")) || arquivoCompleto.contains("3175-8248")) &&
                arquivoCompleto.contains("CONTA:")) {
            return ("VEM DO NUM "+i); //SAFRA
        }
		/* Chamado #2311-023023 - Condicao "(arquivoCompleto.contains("STONE INSTITUICAO DE PAGAMENTO") && arquivoCompleto.contains("S.A."))"
           foi feita para validar "STONE INSTITUICAO DE PAGAMENTO S.A." quando ha quebra de linha no arquivo dos termos citados, deixando eles
           separados.*/
        i++;
        if(arquivoCompleto.contains("STONE INSTITUICAO DE PAGAMENTO S.A.") || (arquivoCompleto.contains("STONE INSTITUICAO DE PAGAMENTO") &&
                arquivoCompleto.contains("S.A."))  &&
                arquivoCompleto.contains("CONTRAPARTE") &&
                arquivoCompleto.contains("PERIODO") && arquivoCompleto.contains("CONTA") &&
                arquivoCompleto.contains("DATA") && arquivoCompleto.contains("TIPO") &&
                arquivoCompleto.contains("DOCUMENTO") && arquivoCompleto.contains("AGENCIA")) {
            return ("VEM DO NUM "+i); //STONE
        }
        i++;
        if(arquivoCompleto.contains("EXTRATO EMITIDO PELA CONTA SIMPLES - A CONTA FEITA PARA EMPREENDER")
                && arquivoCompleto.contains("CONTA NUMERO")) {
            return ("VEM DO NUM "+i); //CONTASIMPLES MODELOS 1 E 2
        }
        i++;
        if(arquivoCompleto.contains("EMITIDO EM") && arquivoCompleto.contains("CARTEIRA DE COBRANCA COM REGISTRO") &&
                arquivoCompleto.contains("PERIODO DE") && arquivoCompleto.contains("BENEFICIARIO") &&
                arquivoCompleto.contains("SITUACAO") && arquivoCompleto.contains("PAGADOR") &&
                arquivoCompleto.contains("CPF/CNPJ")) {
            return ("VEM DO NUM "+i); //FRANCESINHAGRUPOAILOS
        }
        i++;
        if(arquivoCompleto.contains("CARTEIRA DE COBRANCA") && arquivoCompleto.contains("STATUS") && arquivoCompleto.contains("LIQUIDADO")){
            return ("VEM DO NUM "+i); //FRANCESINHA CRESOL
        }
        i++;
        if(arquivoCompleto.contains("INVESTIMENTOS BRADESCO") && arquivoCompleto.contains("CERTIFICADO") &&
                arquivoCompleto.contains("CONTA:") && arquivoCompleto.contains("PERIODO DE:")) {
            return ("VEM DO NUM "+i); //INVESTIMENTOBRADESCO
        }
        i++;
        if(arquivoCompleto.contains("ASAAS GESTAO FINANCEIRA INSTITUICAO DE PAGAMENTO")) {
            return ("VEM DO NUM "+i); //ASAAS
        }
        //#2311-022830
        //if(arquivoCompleto.contains("TOTAL APLICACOES FINANCEIRAS")  && arquivoCompleto.contains("SALDOS POR DIA BASE") &&
        //	arquivoCompleto.contains("SUJEITOS A CONFIRMACAO NO MOMENTO DA CONTRATACAO")) {
        //	return ("VEM DO NXUM "+i); //BBMOBILE
        //}
        i++;
        if(arquivoCompleto.contains("HISTORICO DE MOVIMENTACAO") && arquivoCompleto.contains("IOF") && arquivoCompleto.contains("BB RENDE FACIL")){
            return ("VEM DO NUM "+i); // APLI BB
        }
        i++;
        if(arquivoCompleto.contains("CC:")  && arquivoCompleto.contains("INFORMACOES ATUALIZADAS ATE A DATA E O HORARIO INDICADOS ACIMA E SUJEITAS A ALTERACOES") &&
                arquivoCompleto.contains("O EXTRATO REFLETE O(S) VALOR(ES) DO SALDO EM CONTA, QUE CONTEMPLA O SALDO DA CONTA CORRENTE, SEM CONTABILIZAR") &&
                arquivoCompleto.contains("VALORES BLOQUEADOS OU LIMITE, CASO EXISTAM")) {
            return ("VEM DO NUM "+i); //VOTORANTIM
        }
        i++;
        if(arquivoCompleto.contains("INSTITUICAO DE PAGAMENTO") && arquivoCompleto.contains("TITULAR DA CONTA DE PAGAMENTO") &&
                arquivoCompleto.contains("DATA") && arquivoCompleto.contains("CREDITO/DEBITO") &&
                arquivoCompleto.contains("STATUS") && arquivoCompleto.contains("IOF")) {
            return ("VEM DO NUM "+i); //VOTORANTIM2
        }
        i++;
        if(arquivoCompleto.contains("EXTRATO DE CONTA VINCULADA") && arquivoCompleto.contains("O EXTRATO REFLETE") &&
                arquivoCompleto.contains("CLIENTE:")) {
            return ("VEM DO NUM "+i); //VOTORANTIM3
        }
        i++;
        if(arquivoCompleto.contains("BTG PACTUAL") && arquivoCompleto.contains("RAZAO SOCIAL") &&
                arquivoCompleto.contains("CONTA CORRENTE") && arquivoCompleto.contains("CNPJ")) {
            return ("VEM DO NUM "+i); //BTG
        }
        i++;
        if(arquivoCompleto.contains("01. CONTA CORRENTE E APLICACOES REMUNERA")) {
            return ("VEM DO NUM "+i); //BTG2
        }
        i++;
        if(arquivoCompleto.contains("BANCO DO ESTADO DO RIO GRANDE DO SUL")
                && arquivoCompleto.contains("OPERACOES PIX") && arquivoCompleto.contains("BANRISUL.COM.BR")){
            return ("VEM DO NUM "+i);//BANRISUL
        }
        i++;
        if(arquivoCompleto.contains("BANCO DO ESTADO DO RIO GRANDE DO SUL")
                && arquivoCompleto.contains("CONSULTA OPERACOES / EMITE RECIBOS") && arquivoCompleto.contains("BANRISUL")){
            return ("VEM DO NUM "+i);//BANRISUL2
        }
        i++;
        if(arquivoCompleto.contains("MEUS CARTOES DE CREDITO OU OFFICE BANKING")
                && arquivoCompleto.contains("BANRISUL S.A.") && arquivoCompleto.contains("ANUIDADE")){
            return ("VEM DO NUM "+i);//CARTAO BANRISUL
        }

        // gui - 2404-035964 -> NOVO PADRAO EXTRATO ITAU -> 22/04/2024
        i++;
        if(arquivoCompleto.contains("CORRENTE") && arquivoCompleto.contains("ITAU") &&
                arquivoCompleto.contains("LANCAMENTO") && !arquivoCompleto.contains("POSICAO DA CONTA CORRENTE")
                && arquivoCompleto.contains("INTERNET") && arquivoCompleto.contains(".ITAU.COM.BR") && arquivoCompleto.contains("NOME: AGENCIA:")) {
            return ("VEM DO NUM "+i); //ITAU PADRAO 6
        }

        i++;
        if(arquivoCompleto.contains("CORRENTE") && arquivoCompleto.contains("WWW.ITAU.COM.BR") &&
                arquivoCompleto.contains("LANCAMENTO") && !arquivoCompleto.contains("MENSAL") && !arquivoCompleto.contains("SALDO RESUMIDO")
			/*&& arquivoCompleto.contains("POSICAO DA") &&
			arquivoCompleto.contains("CONTA:)"*/) {
            return ("VEM DO NUM "+i); //ITAUPADRAO3 TIPOEXTRATO4
        }
        i++;
        if(arquivoCompleto.contains("DATA") && arquivoCompleto.contains("AG/ORIGEM") &&
                /* && arquivoCompleto.contains("LIMITE DA CONTA CONTRATADO")*/ //2311-022345 comentado
                arquivoCompleto.contains("0800 728 0728")){
            return ("VEM DO NUM "+i+ "IFS:" + arquivoCompleto.contains("DATA") +"&&"+ arquivoCompleto.contains("AG/ORIGEM") +"&&"+ arquivoCompleto.contains("0800 728 0728")

            ); //ITAU 2
        }
        i++;
        if(arquivoCompleto.contains("RELATORIO DE VENDAS") && arquivoCompleto.contains("INFINITEPAY") && arquivoCompleto.contains("0800 591 7207")){
            return ("VEM DO NUM "+i); //INFINITE-PAY-CARTAO
        }
        i++;
        if(arquivoCompleto.contains("XP INVESTIMENTOS") && arquivoCompleto.contains("NOTA DE CORRETAGEM")){
            return ("VEM DO NUM "+i); //NOTAS DE CORRETAGEM
        }
        i++;
        if(arquivoCompleto.contains("EMITIDO EM") && arquivoCompleto.contains("BANCO ITAU S/A") && arquivoCompleto.contains("MOVIMENTACAO")){
            return ("VEM DO NUM "+i); //ITAUFRANCESINHA01
        }
        i++;
        if(arquivoCompleto.contains("CART") && arquivoCompleto.contains("PAGADOR") && arquivoCompleto.contains("TIPO") && arquivoCompleto.contains("NOSSO|") &&
                arquivoCompleto.contains("SEU|") && arquivoCompleto.contains("VENC.") && arquivoCompleto.contains("AGENCIA|") && arquivoCompleto.contains("INICIAL") &&
                arquivoCompleto.contains("VALOR") && arquivoCompleto.contains("DESCRICAO DE OPERACOES") && arquivoCompleto.contains("OPERACOES|VALOR") &&
                arquivoCompleto.contains("VALOR FINAL") && arquivoCompleto.contains("CONSULTAS, INFORMACOES E TRANSACOES, ACESSE") && arquivoCompleto.contains("ITAU.COM.BR")) {
            return ("VEM DO NUM "+i); //ITAUFRANCESINHA04
        }
        /*if(arquivoCompleto.contains("NOME DO PAGADOR") && arquivoCompleto.contains("VCTO") &&
            arquivoCompleto.contains("DATA DE MOVIMENTACAO") && arquivoCompleto.contains("AGENCIA/CONTA")){
            return ("VEM DO NUM "i); //ITAUFRANCESINHA02
        }*/
		/* gui - 30/04/2024 -> AJUSTE PARA FORÇAR LER PELO ANTIGO CONVERSOR O PADRÃO 01 DO UNICREDPDF
		 CHAMADOO -> 2404-037187
		 AJUSTE FEITO PORQUE O NOVO CONVERSOR NAO ESTAVA TRAZENDO TODOS OS LANCAMENTOS DO PDF, JA O ANTIGO, TRAZ TUDO.
		if(((arquivoCompleto.contains("CENTRAL DE RELACIONAMENTO") && arquivoCompleto.contains("DEMAIS REGIOES:")
			&& arquivoCompleto.contains("NO EXTERIOR:") && arquivoCompleto.contains("SAC:"))
			|| arquivoCompleto.contains("OUVIDORIA") && arquivoCompleto.contains("0800 940 0602") && !arquivoCompleto.contains("COOPERATIVA DE CREDITO UNICRED"))
			&& !arquivoCompleto.contains("TELE ATENDIMENTO")){
			return ("VEM DO NUM "i); //UNICRED1
		}*/
        // gui - 13/05/2024 -> Ajuste feito para o padrão 01 ser lido pelo novo conversor.
        i++;
        if(((arquivoCompleto.contains("EXTRATO DE CONTA CORRENTE") && arquivoCompleto.contains("OUVIDORIA") &&
                arquivoCompleto.contains("0800 646 5151") && arquivoCompleto.contains("TELE ATENDIMENTO")) && !arquivoCompleto.contains("UNICRED VALE"))){
            return ("VEM DO NUM "+i); //UNICRED PADRAO 01
        }


        i++;
        if(arquivoCompleto.contains("OUVIDORIA: 0800 591 5120") &&
                arquivoCompleto.contains("COOPERATIVA DE CREDITO CREHNOR")){
            return ("VEM DO NUM "+i); //CREHNOR
        }
        i++;
        if(arquivoCompleto.contains("BANCO SAFRA S/A") && arquivoCompleto.contains("0800 770 1236")
                && arquivoCompleto.contains("ATENDIMENTO PERSONALIZADO") && arquivoCompleto.contains("CENTRAL DE SUPORTE A PESSOA JURIDICA")){

            return ("VEM DO NUM "+i);//FRANCESINHA SAFRA
        }
        i++;
        if(arquivoCompleto.contains("SAC - 0800 647 2200") &&
                arquivoCompleto.contains("OUVIDORIA - 0800 644 1100 ") && arquivoCompleto.contains("COOPERATIVA: CIVIA")){
            return ("VEM DO NUM "+i);//AILOS CIVIA
        }
        i++;
        if(arquivoCompleto.contains("BANCO INTER") && arquivoCompleto.contains("CPF/CNPJ") && arquivoCompleto.contains("0800 940 9999") &&
                arquivoCompleto.contains("FALE COM A GENTE") && arquivoCompleto.contains("SALDO POR")){
            return ("VEM DO NUM "+i); //INTER PADRAO3
        }
        i++;
        if(arquivoCompleto.contains("NEXT (237 - BANCO BRADESCO S.A.)")
                && arquivoCompleto.contains("SE NAO FICAR SATISFEITO COM A SOLUCAO APRESENTADA, CONTATE A OUVIDORIA") && arquivoCompleto.contains("CONSULTAS, INFORMACOES E SERVICOS TRANSACIONAIS")
                && arquivoCompleto.contains("SAC NEXT")){
            return ("VEM DO NUM "+i);// NEXT
        }
        i++;
        if(arquivoCompleto.toUpperCase().contains("SALDO DO DIA") && arquivoCompleto.toUpperCase().contains("LIMITE") &&
                arquivoCompleto.toUpperCase().contains("CONSOLIDADA EM") && arquivoCompleto.toUpperCase().contains("SALDO ANTERIOR") &&
                arquivoCompleto.toUpperCase().contains("SALDO EM CONTA")){
            return ("VEM DO NUM "+i); //CRESOL2
        }
        i++;
        if(arquivoCompleto.contains("CREDISAN COOPERATIVA DE CREDITO")
                && arquivoCompleto.contains("EXTRATO PARA SIMPLES CONFERENCIA")){
            return ("VEM DO NUM "+i);//CREDISAN
        }
        i++;
        if(arquivoCompleto.toUpperCase().contains("SISTEMA DE COOPERATIVAS DE CREDITO DO BRASIL") &&
                arquivoCompleto.toUpperCase().contains("SISBR") &&
                arquivoCompleto.toUpperCase().contains("PLATAFORMA DE SERVICOS FINANCEIROS DO SICOOB -") &&
                !arquivoCompleto.toUpperCase().contains("HORA:") &&
                !arquivoCompleto.toUpperCase().contains("PERIODO:")){
            return ("VEM DO NUM "+i); //SICOOB 3
        }
        i++;
        if(arquivoCompleto.contains("EXTRATO CONTA LINKER") && arquivoCompleto.contains("WWW.LINKER.COM.BR") &&
                arquivoCompleto.contains("TOTAL ENTRADAS")){
            return ("VEM DO NUM "+i); //LINKER
        }
        i++;
        if(arquivoCompleto.contains("XP INVESTIMENTOS CCTVM S/A") && arquivoCompleto.contains("NAO HA LANCAMENTOS FUTUROS") &&
                arquivoCompleto.contains("ATENDIMENTO AO CLIENTE") && arquivoCompleto.contains("TORRE SUL") ){
            return ("VEM DO NUM "+i); //XP 2
        }
        i++;
        if(arquivoCompleto.contains("EFI S.A.") && arquivoCompleto.contains("TIPO DE REGISTRO")
                && arquivoCompleto.contains("EXTRATO FINANCEIRO") && arquivoCompleto.contains("FILTROS DO") &&
                arquivoCompleto.contains("EFI S.A. CNPJ: 09.089.356/0001-18")) {
            return ("VEM DO NUM "+i); //EFI
        }
        i++;
        if(arquivoCompleto.contains("OUVIDORIA CREDISIS") && arquivoCompleto.contains("0800 648 00 20")){
            return ("VEM DO NUM "+i); //CREDISIS
        }
		/*if(arquivoCompleto.toUpperCase().contains("EXTRATO DE: AG: ") && arquivoCompleto.toUpperCase().contains("OS DADOS ACIMA TEM COMO BASE ") &&
		 arquivoCompleto.toUpperCase().contains("SALDOS INVEST FACIL / PLUS") && arquivoCompleto.contains("TOTAL DISPONIVEL") &&
		 arquivoCompleto.toUpperCase().contains("DCTO.") && arquivoCompleto.toUpperCase().contains("ENTRE")){
		 return ("VEM DO NUM "i); //BRADESCO
		}*/
        i++;
        if(arquivoCompleto.contains("RELATORIO FINANCEIRO FRANCESINHA") && arquivoCompleto.contains("ASSOCIADO:") && arquivoCompleto.contains("COOPERATIVA") && arquivoCompleto.contains("CONTA CORRENTE")
                && arquivoCompleto.contains("BENEFICIARIO") && arquivoCompleto.contains("A TRANSACAO ACIMA FOI REALIZADA VIA SICREDI INTERNET")){
            return ("VEM DO NUM "+i);//FrancesinhaSicrediPdf tipo 001
        }
        //2312-024917 - Existem algumas quebras de linha no cliente/fornecedor, algumas dessas quebras de linhas são tratadas pelos conversores, no antigo
        //nao coloca espacamento quando junta as partes da linha, enquanto no novo nao apresenta esse problema
        i++;
        if(arquivoCompleto.contains("CARTEIRA") && arquivoCompleto.contains("RELATORIO DE TITULOS") && arquivoCompleto.contains("VALOR TOTAL LIQUIDACAO")
                && arquivoCompleto.contains("BENEFICIARIO") && arquivoCompleto.contains("COOPERATIVA") && arquivoCompleto.contains("DADOS REFERENTES AO PERIODO DE")){
            return ("VEM DO NUM "+i); //FRANCESINHA SICREDI PDF TIPO 002
        }
        i++;
        if(arquivoCompleto.contains("CARTAO:") && arquivoCompleto.contains("DETALHAMENTO DA SUA FATURA") &&
                arquivoCompleto.contains("BB.COM.BR") && arquivoCompleto.contains("BANCO DO BRASIL")) {
            return ("VEM DO NUM "+i); //FATURA CARTAO CREDITO BANCO DO BRASIL
        }
        //#2311-023772 By Leal
        i++;
        if(arquivoCompleto.contains("RELATORIO  -  TITULOS POR PERIODO") && arquivoCompleto.contains("TIPO CONSULTA:") &&
                arquivoCompleto.contains("LIQUIDACAO - VIA COMPENSACAO") && arquivoCompleto.contains("CPF/CNPJ SACADO:") &&
                arquivoCompleto.contains("VLR. OUTROS") && arquivoCompleto.contains("VERSAO:")){

            return ("VEM DO NUM "+i); //FRANCESINHA SICOOB
        }
        i++;
        if(arquivoCompleto.contains("PAYBROKERS IP") && arquivoCompleto.contains("CONTAPAG") && arquivoCompleto.contains("FILTROS UTILIZADOS NO RELATORIO")){
            return ("VEM DO NUM "+i); //PAYBROKERS
        }
        i++;
        if(arquivoCompleto.contains("EXTRATO CONTA DE PAGAMENTO/LANCAMENTOS") &&
                arquivoCompleto.contains("ACESSOACONTA.COM.BR") &&
                arquivoCompleto.contains("PINKPAY")){

            return ("VEM DO NUM "+i); //PINK PAY
        }
        //2311-022659
        i++;
        if(arquivoCompleto.contains("BANCO ITAU S.A.") && arquivoCompleto.contains("TITULOS") && arquivoCompleto.contains("MOVIMENTACAO") &&
                arquivoCompleto.contains("PAGADOR")  && arquivoCompleto.contains("OUTROS VALORES")){
            return ("VEM DO NUM "+i); //ITAUFRANCESINHA03
        }
        //2311-023654
        i++;
        if(arquivoCompleto.contains("OUVIDORIA BB") && arquivoCompleto.contains("DEFICIENTES") && arquivoCompleto.contains("AUDITIVOS") &&
                arquivoCompleto.contains("CONSULTAR") && arquivoCompleto.contains("BOLETOS") && arquivoCompleto.contains("INSTRUCOES")){
            return ("VEM DO NUM "+i); //FRANCESINHABB
        }
        //2401-026435
        i++;
        if(arquivoCompleto.contains("OMIE.CASH") && arquivoCompleto.contains("GERADO EM") && arquivoCompleto.contains("CORRENTE") && arquivoCompleto.contains("SITUACAO")){
            return ("VEM DO NUM "+i); //OMIECASH
        }
        i++;
        if(arquivoCompleto.contains("EXTRATO DE CONTA CORRENTE") && arquivoCompleto.contains("TITULAR") && arquivoCompleto.contains("SALDO ANTERIOR") && arquivoCompleto.contains("SALDO ATUAL") &&
                arquivoCompleto.contains("GERADO EM") && arquivoCompleto.contains("PERIODO:") && arquivoCompleto.contains("AGENCIA:")){
            return ("VEM DO NUM "+i); //NORDESTE TIPO 2
        }
        //2402-028676
        i++;
        if(arquivoCompleto.contains("PAGSEGURO") && arquivoCompleto.contains("EXTRATO FINANCEIRO") && arquivoCompleto.contains("CONTA CORRENTE") && arquivoCompleto.contains("CNPJ")){
            return ("VEM DO NUM "+i); //PAGBANK PADRAO 2
        }

        i++;
        if(arquivoCompleto.contains("SAC DAYCOVAL") && arquivoCompleto.contains("EXTRATO DETALHADO") && arquivoCompleto.contains("DAYCONNECT") && arquivoCompleto.contains("PROVISAO DE ENCARGOS")){
            return ("VEM DO NUM "+i); //DAYCOVAL PADRAO 1 E 2
        }
        i++;
        if(arquivoCompleto.contains("XP INVESTIMENTOS") &&
                arquivoCompleto.contains("ASSESSOR:") &&
                arquivoCompleto.contains("WWW.XPI.COM.BR") &&
                arquivoCompleto.contains("CORRETORA DE CAMBIO")) {
            return ("VEM DO NUM "+i); //XP Padrao 3
        }

        i++;
        if(	arquivoCompleto.contains("SISBB") &&
                arquivoCompleto.contains("SISTEMA DE INFORMACOES BANCO DO BRASIL") &&
                arquivoCompleto.contains("AUTOATENDIMENTO BB") &&
                arquivoCompleto.contains("DATA MOVIM.") &&
                arquivoCompleto.contains("DEP. ORIGEM") &&
                arquivoCompleto.contains("HISTORICO") ) {

            return ("VEM DO NUM "+i);// SISBB

        }

        i++;
        if(arquivoCompleto.contains("CENTRAL DE ATENDIMENTO SANTANDER EMPRESARIAL") && arquivoCompleto.contains("0800 762 7777") &&
                arquivoCompleto.contains("NOSSO NUMERO") && arquivoCompleto.contains("AGENCIA/CONTA")){ //FRANCESINHASANTANDER 2
            return ("VEM DO NUM "+i);
        }

        i++;
        if(arquivoCompleto.contains("INTERNET BANKING EMPRESARIAL") && arquivoCompleto.contains("AGENCIA") &&
                arquivoCompleto.contains("CONTA:") && arquivoCompleto.contains("PERIODO") && arquivoCompleto.contains("0800 726 2125") &&
                arquivoCompleto.contains("0800 723 5007") && arquivoCompleto.contains("0800 726 0322") && arquivoCompleto.contains("0800 771 0301") &&
                !arquivoCompleto.contains("VALORES DEDUZIDOS DO SALDO DISPONIVEL PARA CONTAS SEM LIMITE")){ // SANTANDER PADRAO 01
            return ("VEM DO NUM "+i);
        }

        i++;
        if(	arquivoCompleto.contains("INTERNET BANKING EMPRESARIAL") &&
                arquivoCompleto.contains("CONTA CORRENTE  >  EXTRATO  >") &&
                arquivoCompleto.contains("OPCAO DE PESQUISA:") &&
                arquivoCompleto.contains("CENTRAL DE ATENDIMENTO") &&
                arquivoCompleto.contains("CAPITAIS E REGIOES METROPOLITANAS") &&
                arquivoCompleto.contains("0800 762 7777") &&
                arquivoCompleto.contains("CENTRAL DE ATENDIMENTO SANTANDER EMPRESARIAL") ) {

            return ("VEM DO NUM "+i);// SANTANDER PADRAO 01/001

        }

        i++;
        if(arquivoCompleto.contains("RELATORIO DE TITULOS") && arquivoCompleto.contains("BANCO/AGENCIA/CONTA") && arquivoCompleto.contains("CARTORIO") &&
                arquivoCompleto.contains("QUANTIDADE:") && arquivoCompleto.contains("RESUMO PARCIAL:") && arquivoCompleto.contains("RESUMO GERAL:")) {
            return ("VEM DO NUM "+i); //FRANCESINHA UNICREDI
        }

        i++;
        if(arquivoCompleto.contains("SAC 0800 724 7220") && arquivoCompleto.contains("VALOR DO TITULO") &&
                arquivoCompleto.contains("RAZAO SOCIAL DO BENEFICIARIO")){
            return ("VEM DO NUM "+i); //COMPROVANTE SICREDI
        }

        i++;
        if(arquivoCompleto.contains("%$&") || arquivoCompleto.contains("!%") || arquivoCompleto.contains("$!%&") || arquivoCompleto.contains("# $%")
                || arquivoCompleto.contains("$*&-") || arquivoCompleto.contains("%$$&$$") || arquivoCompleto.contains("#$#%") || arquivoCompleto.contains("%&*")
                || arquivoCompleto.contains("*##%%") || arquivoCompleto.contains("##$%#&") || arquivoCompleto.contains("!\"#\"") || arquivoCompleto.contains("[!\"")
                || arquivoCompleto.contains("&<") || arquivoCompleto.contains("[!") || arquivoCompleto.contains(".%$$") || arquivoCompleto.contains("#!+")
                || arquivoCompleto.contains("++(0+0&") || arquivoCompleto.contains("*&+&")) {
            return ("VEM DO NUM "+i);
        }
        i++;
        if(arquivoCompleto.equals("[]")) {
            return ("VEM DO NUM "+i);
        }
		/* gui -> 20/05/2024
		Ajuste feito de 40 char para 150 char para tratar o chamado 2405-038508 e futuros casos parecidos.
		*/
        i++;
        if(arquivoCompleto.length() < 150) {
            return ("VEM DO NUM "+i);
        }

        return "NENHUM";
    }
}
