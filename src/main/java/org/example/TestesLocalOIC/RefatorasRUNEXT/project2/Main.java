package org.example.TestesLocalOIC.RefatorasRUNEXT.project2;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Carregar padrões de validação simulados
        List<PadraoValidacao> padroes = PadraoValidacao.mockCarregarPadroes();
        PadraoValidacao.setPadroes(padroes);

        String conteudoParaValidacao4 = "data;valor;documento;example;compras;texto;muitas coisas"; // Não deve corresponder a nenhum padrão
        String conteudoParaValidacaotribanco = "29/07/2024 11:24;TRIBANCO ONLINE, NOME: RONALDO DOS S DA SILVA, CNPJ: 07656913000100, USUARIO: SANTOS10, DATA DA IMPRESSAO: 29/07/2024 11:24:30, HOME;CONTA CORRENTE;EXTRATO, EXTRATO, LANCAMENTOS DA CONTA VINCULADA (384151), DATA;MOVIMENTACAO;TIPO;DOCUMENTO;VALOR, 29/12/2023;SALDO ANTERIOR;R$ 0,00, 02/01/2024;TRANSF.AUTOMATICA SALDO - COBRANCA;ENTRADA;1196383;+R$ 1.335,32, RECEBTO LOJA S.COMPRAS;SAIDA;100;-R$ 1.335,32, CRTO VISA TRIPAG;ENTRADA;100;+R$ 5.456,20, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 6.884,14, CRTO ELO TRIPAG;ENTRADA;100;+R$ 1.104,27, CRTO VISA FIRST DATA;ENTRADA;100;+R$ 168,41, CRTO MASTERCARD FIRST DATA;ENTRADA;100;+R$ 511,55, CRTO ELO FIRST DATA;ENTRADA;100;+R$ 65,51, DBTO VISA TRIPAG;ENTRADA;100;+R$ 6.784,00, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 6.987,26, DBTO ELO TRIPAG;ENTRADA;100;+R$ 3.294,62, MASTER DEBITO CIELO;ENTRADA;100;+R$ 1.907,29, DEBITO VISA CIELO;ENTRADA;100;+R$ 321,61, DEBITO ELO CIELO;ENTRADA;100;+R$ 1.218,82, DBTO MAESTRO FIRST DATA;ENTRADA;100;+R$ 106,08, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 34.809,76, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C;R$ 0,00, HTTPS://WWW2.TRIBANCOONLINE.COM.BR/TRBONLINE/EXTRATO;1/12, 29/07/2024 11:24;TRIBANCO ONLINE, DATA;MOVIMENTACAO;TIPO;DOCUMENTO;VALOR, 03/01/2024;DBTO VISA TRIPAG;ENTRADA;100;+R$ 2.146,74, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 1.974,64, DBTO ELO TRIPAG;ENTRADA;100;+R$ 902,72, DEBITO VISA CIELO;ENTRADA;100;+R$ 547,74, DBTO MAESTRO FIRST DATA;ENTRADA;100;+R$ 1.801,37, CRTO VISA TRIPAG;ENTRADA;100;+R$ 421,29, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 1.230,84, CRTO ELO TRIPAG;ENTRADA;100;+R$ 147,00, CRTO VISA TRIPAG;ENTRADA;100;+R$ 71,47, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 55,62, CARTAO CRED.VISA - CIELO;ENTRADA;100;+R$ 78,45, CARTAO CRED ELO CIELO;ENTRADA;100;+R$ 516,76, CARTAO CRED.MASTERCARD - CIELO;ENTRADA;100;+R$ 284,52, CRTO MASTERCARD FIRST DATA;ENTRADA;100;+R$ 46,67, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 10.225,83, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C;R$ 0,00, 04/01/2024;TRANSF.AUTOMATICA SALDO - COBRANCA;ENTRADA;1196383;+R$ 1.961,12, RECEBTO LOJA S.COMPRAS;SAIDA;100;-R$ 1.961,12, DBTO VISA TRIPAG;ENTRADA;100;+R$ 2.514,68, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 2.357,85, DBTO ELO TRIPAG;ENTRADA;100;+R$ 579,30, MASTER DEBITO CIELO;ENTRADA;100;+R$ 215,18, DBTO VISA FIRST DATA;ENTRADA;100;+R$ 510,57, CRTO VISA TRIPAG;ENTRADA;100;+R$ 394,91, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 725,36, CRTO ELO TRIPAG;ENTRADA;100;+R$ 96,28, CARTAO CRED.VISA - CIELO;ENTRADA;100;+R$ 160,36, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 7.554,49, HTTPS://WWW2.TRIBANCOONLINE.COM.BR/TRBONLINE/EXTRATO;2/12, 29/07/2024 11:24;TRIBANCO ONLINE, DATA;MOVIMENTACAO;TIPO;DOCUMENTO;VALOR, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C;R$ 0,00, 05/01/2024;DBTO VISA TRIPAG;ENTRADA;100;+R$ 1.872,71, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 3.298,95, DBTO ELO TRIPAG;ENTRADA;100;+R$ 586,67, DEBITO VISA CIELO;ENTRADA;100;+R$ 954,10, DEBITO ELO CIELO;ENTRADA;100;+R$ 461,84, DBTO MAESTRO FIRST DATA;ENTRADA;100;+R$ 272,28, DBTO ELO FIRST DATA;ENTRADA;100;+R$ 792,00, CRTO VISA TRIPAG;ENTRADA;100;+R$ 693,13, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 1.535,66, CRTO ELO TRIPAG;ENTRADA;100;+R$ 77,31, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 10.544,65, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C;R$ 0,00, 08/01/2024;TRANSF.AUTOMATICA SALDO - COBRANCA;ENTRADA;1196383;+R$ 650,00, RECEBTO LOJA S.COMPRAS;SAIDA;100;-R$ 650,00, DBTO VISA TRIPAG;ENTRADA;100;+R$ 4.141,75, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 3.239,84, DBTO ELO TRIPAG;ENTRADA;100;+R$ 3.178,95, DBTO VISA TRIPAG;ENTRADA;100;+R$ 1.028,85, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 1.486,42, DBTO ELO TRIPAG;ENTRADA;100;+R$ 633,38, MASTER DEBITO CIELO;ENTRADA;100;+R$ 416,67, DEBITO VISA CIELO;ENTRADA;100;+R$ 1.119,92, DBTO MAESTRO FIRST DATA;ENTRADA;100;+R$ 187,37, DBTO VISA FIRST DATA;ENTRADA;100;+R$ 386,58, CRTO VISA TRIPAG;ENTRADA;100;+R$ 3.361,42, HTTPS://WWW2.TRIBANCOONLINE.COM.BR/TRBONLINE/EXTRATO;3/12, 29/07/2024 11:24;TRIBANCO ONLINE, DATA;MOVIMENTACAO;TIPO;DOCUMENTO;VALOR, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 3.168,96, CRTO ELO TRIPAG;ENTRADA;100;+R$ 238,54, CRTO VISA FIRST DATA;ENTRADA;100;+R$ 126,50, CRTO MASTERCARD FIRST DATA;ENTRADA;100;+R$ 248,73, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 22.963,88, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C;R$ 0,00, 09/01/2024;DBTO VISA TRIPAG;ENTRADA;100;+R$ 2.562,41, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 1.222,74, DBTO ELO TRIPAG;ENTRADA;100;+R$ 410,16, MASTER DEBITO CIELO;ENTRADA;100;+R$ 281,69, DEBITO ELO CIELO;ENTRADA;100;+R$ 252,55, CRTO VISA TRIPAG;ENTRADA;100;+R$ 9,70, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 15,46, CRTO VISA TRIPAG;ENTRADA;100;+R$ 266,74, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 1.047,48, CRTO ELO TRIPAG;ENTRADA;100;+R$ 158,84, CARTAO CRED.VISA - CIELO;ENTRADA;100;+R$ 272,31, CRTO MASTERCARD FIRST DATA;ENTRADA;100;+R$ 77,53, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 6.577,61, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C;R$ 0,00, 10/01/2024;TRANSF.AUTOMATICA SALDO - COBRANCA;ENTRADA;1196383;+R$ 500,00, RECEBTO LOJA S.COMPRAS;SAIDA;100;-R$ 500,00, DBTO VISA TRIPAG;ENTRADA;100;+R$ 2.878,09, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 2.716,15, DBTO ELO TRIPAG;ENTRADA;100;+R$ 1.936,33, CRTO VISA TRIPAG;ENTRADA;100;+R$ 777,31, HTTPS://WWW2.TRIBANCOONLINE.COM.BR/TRBONLINE/EXTRATO;4/12, 29/07/2024 11:24;TRIBANCO ONLINE, DATA;MOVIMENTACAO;TIPO;DOCUMENTO;VALOR, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 589,18, CRTO ELO TRIPAG;ENTRADA;100;+R$ 143,54, CRTO VISA FIRST DATA;ENTRADA;100;+R$ 71,80, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 9.112,40, SALDO C/C;R$ 0,00, 11/01/2024;TRANSF.AUTOMATICA SALDO - COBRANCA;ENTRADA;1196383;+R$ 632,63, RECEBTO LOJA S.COMPRAS;SAIDA;100;-R$ 632,63, DBTO VISA TRIPAG;ENTRADA;100;+R$ 1.187,12, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 1.373,71, DBTO ELO TRIPAG;ENTRADA;100;+R$ 590,28, MASTER DEBITO CIELO;ENTRADA;100;+R$ 571,21, DEBITO ELO CIELO;ENTRADA;100;+R$ 458,30, DBTO VISA FIRST DATA;ENTRADA;100;+R$ 991,40, CRTO VISA TRIPAG;ENTRADA;100;+R$ 64,11, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 562,43, CRTO ELO TRIPAG;ENTRADA;100;+R$ 9,87, CRTO MASTERCARD FIRST DATA;ENTRADA;100;+R$ 211,49, CRTO ELO FIRST DATA;ENTRADA;100;+R$ 254,80, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 6.274,72, SALDO C/C;R$ 0,00, 12/01/2024;TRANSF.AUTOMATICA SALDO - COBRANCA;ENTRADA;1196383;+R$ 675,92, RECEBTO LOJA S.COMPRAS;SAIDA;100;-R$ 675,92, DBTO VISA TRIPAG;ENTRADA;100;+R$ 1.142,96, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 1.201,94, DBTO ELO TRIPAG;ENTRADA;100;+R$ 504,19, MASTER DEBITO CIELO;ENTRADA;100;+R$ 201,49, CRTO VISA TRIPAG;ENTRADA;100;+R$ 496,03, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 562,92, CRTO ELO TRIPAG;ENTRADA;100;+R$ 157,20, CRTO MASTERCARD FIRST DATA;ENTRADA;100;+R$ 130,16, HTTPS://WWW2.TRIBANCOONLINE.COM.BR/TRBONLINE/EXTRATO;5/12, 29/07/2024 11:24;TRIBANCO ONLINE, DATA;MOVIMENTACAO;TIPO;DOCUMENTO;VALOR, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 4.396,89, SALDO C/C;R$ 0,00, 15/01/2024;TRANSF.AUTOMATICA SALDO - COBRANCA;ENTRADA;1196383;+R$ 727,81, RECEBTO LOJA S.COMPRAS;SAIDA;100;-R$ 727,81, DBTO VISA TRIPAG;ENTRADA;100;+R$ 3.744,98, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 2.883,38, DBTO ELO TRIPAG;ENTRADA;100;+R$ 1.675,98, DBTO VISA TRIPAG;ENTRADA;100;+R$ 509,69, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 1.721,89, DBTO ELO TRIPAG;ENTRADA;100;+R$ 1.568,75, MASTER DEBITO CIELO;ENTRADA;100;+R$ 78,25, DBTO MAESTRO FIRST DATA;ENTRADA;100;+R$ 485,79, CRTO VISA TRIPAG;ENTRADA;100;+R$ 1.864,69, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 2.416,35, CRTO ELO TRIPAG;ENTRADA;100;+R$ 276,89, CRTO VISA FIRST DATA;ENTRADA;100;+R$ 590,36, CRTO MASTERCARD FIRST DATA;ENTRADA;100;+R$ 177,19, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 17.994,19, SALDO C/C;R$ 0,00, 16/01/2024;DBTO VISA TRIPAG;ENTRADA;100;+R$ 742,59, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 1.041,45, DBTO ELO TRIPAG;ENTRADA;100;+R$ 1.032,31, DBTO MAESTRO FIRST DATA;ENTRADA;100;+R$ 648,13, CRTO VISA TRIPAG;ENTRADA;100;+R$ 778,46, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 514,82, CRTO ELO TRIPAG;ENTRADA;100;+R$ 79,96, CRTO VISA TRIPAG;ENTRADA;100;+R$ 36,62, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 1,96, CRTO VISA TRIPAG;ENTRADA;100;+R$ 50,08, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 4.926,38, HTTPS://WWW2.TRIBANCOONLINE.COM.BR/TRBONLINE/EXTRATO;6/12, 29/07/2024 11:24;TRIBANCO ONLINE, DATA;MOVIMENTACAO;TIPO;DOCUMENTO;VALOR, SALDO C/C;R$ 0,00, 17/01/2024;TRANSF.AUTOMATICA SALDO - COBRANCA;ENTRADA;1196383;+R$ 512,27, RECEBTO LOJA S.COMPRAS;SAIDA;100;-R$ 512,27, DBTO VISA TRIPAG;ENTRADA;100;+R$ 1.952,61, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 906,57, DBTO ELO TRIPAG;ENTRADA;100;+R$ 810,99, DEBITO VISA CIELO;ENTRADA;100;+R$ 43,92, CRTO VISA TRIPAG;ENTRADA;100;+R$ 294,02, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 998,09, CRTO ELO TRIPAG;ENTRADA;100;+R$ 133,29, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 5.139,49, SALDO C/C;R$ 0,00, 18/01/2024;TRANSF.AUTOMATICA SALDO - COBRANCA;ENTRADA;1196383;+R$ 819,27, RECEBTO LOJA S.COMPRAS;SAIDA;100;-R$ 819,27, DBTO VISA TRIPAG;ENTRADA;100;+R$ 2.237,69, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 1.108,34, DBTO ELO TRIPAG;ENTRADA;100;+R$ 606,38, CRTO VISA TRIPAG;ENTRADA;100;+R$ 236,11, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 1.247,02, CRTO ELO TRIPAG;ENTRADA;100;+R$ 44,23, CARTAO CRED.MASTERCARD - CIELO;ENTRADA;100;+R$ 284,40, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 5.764,17, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C;R$ 0,00, 19/01/2024;TRANSF.AUTOMATICA SALDO - COBRANCA;ENTRADA;1196383;+R$ 401,99, RECEBTO LOJA S.COMPRAS;SAIDA;100;-R$ 401,99, DBTO VISA TRIPAG;ENTRADA;100;+R$ 966,56, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 1.408,55, DBTO ELO TRIPAG;ENTRADA;100;+R$ 709,50, HTTPS://WWW2.TRIBANCOONLINE.COM.BR/TRBONLINE/EXTRATO;7/12, 29/07/2024 11:24;TRIBANCO ONLINE, DATA;MOVIMENTACAO;TIPO;DOCUMENTO;VALOR, DBTO MAESTRO FIRST DATA;ENTRADA;100;+R$ 11,89, DBTO VISA FIRST DATA;ENTRADA;100;+R$ 4,96, CRTO VISA TRIPAG;ENTRADA;100;+R$ 1.327,38, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 1.061,23, CRTO ELO TRIPAG;ENTRADA;100;+R$ 299,36, CRTO MASTERCARD FIRST DATA;ENTRADA;100;+R$ 68,86, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 5.858,29, SALDO C/C;R$ 0,00, 22/01/2024;TRANSF.AUTOMATICA SALDO - COBRANCA;ENTRADA;1196383;+R$ 11,99, RECEBTO LOJA S.COMPRAS;SAIDA;100;-R$ 11,99, DBTO VISA TRIPAG;ENTRADA;100;+R$ 6.142,38, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 2.963,71, DBTO ELO TRIPAG;ENTRADA;100;+R$ 2.177,34, DBTO VISA TRIPAG;ENTRADA;100;+R$ 138,23, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 88,87, DBTO ELO TRIPAG;ENTRADA;100;+R$ 46,50, DBTO VISA TRIPAG;ENTRADA;100;+R$ 907,83, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 1.045,11, DBTO ELO TRIPAG;ENTRADA;100;+R$ 638,24, CRTO VISA TRIPAG;ENTRADA;100;+R$ 1.984,77, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 5.425,44, CRTO ELO TRIPAG;ENTRADA;100;+R$ 136,33, CRTO VISA FIRST DATA;ENTRADA;100;+R$ 53,85, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 21.748,60, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C;R$ 0,00, 23/01/2024;DBTO VISA TRIPAG;ENTRADA;100;+R$ 1.103,01, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 579,91, DBTO ELO TRIPAG;ENTRADA;100;+R$ 578,67, HTTPS://WWW2.TRIBANCOONLINE.COM.BR/TRBONLINE/EXTRATO;8/12, 29/07/2024 11:24;TRIBANCO ONLINE, DATA;MOVIMENTACAO;TIPO;DOCUMENTO;VALOR, CRTO VISA TRIPAG;ENTRADA;100;+R$ 412,67, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 1.535,18, CRTO ELO TRIPAG;ENTRADA;100;+R$ 211,81, CRTO VISA TRIPAG;ENTRADA;100;+R$ 549,97, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 4.971,22, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C;R$ 0,00, 24/01/2024;TRANSF.AUTOMATICA SALDO - COBRANCA;ENTRADA;1196383;+R$ 292,24, RECEBTO LOJA S.COMPRAS;SAIDA;100;-R$ 292,24, DBTO VISA TRIPAG;ENTRADA;100;+R$ 769,35, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 1.760,36, DBTO ELO TRIPAG;ENTRADA;100;+R$ 1.108,78, MASTER DEBITO CIELO;ENTRADA;100;+R$ 199,53, DBTO MAESTRO FIRST DATA;ENTRADA;100;+R$ 88,23, CRTO VISA TRIPAG;ENTRADA;100;+R$ 371,33, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 338,90, CRTO ELO TRIPAG;ENTRADA;100;+R$ 156,97, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 4.793,45, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C;R$ 0,00, 25/01/2024;DBTO VISA TRIPAG;ENTRADA;100;+R$ 1.891,12, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 1.387,75, DBTO ELO TRIPAG;ENTRADA;100;+R$ 1.000,51, CRTO VISA TRIPAG;ENTRADA;100;+R$ 715,44, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 1.086,24, CRTO ELO TRIPAG;ENTRADA;100;+R$ 117,83, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 6.198,89, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, HTTPS://WWW2.TRIBANCOONLINE.COM.BR/TRBONLINE/EXTRATO;9/12, 29/07/2024 11:24;TRIBANCO ONLINE, DATA;MOVIMENTACAO;TIPO;DOCUMENTO;VALOR, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C;R$ 0,00, 26/01/2024;DBTO VISA TRIPAG;ENTRADA;100;+R$ 1.045,33, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 1.045,26, DBTO ELO TRIPAG;ENTRADA;100;+R$ 813,62, CRTO VISA TRIPAG;ENTRADA;100;+R$ 1.075,32, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 658,60, CRTO ELO TRIPAG;ENTRADA;100;+R$ 67,14, CARTAO CRED.MASTERCARD - CIELO;ENTRADA;100;+R$ 12,66, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 4.717,93, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C;R$ 0,00, 29/01/2024;TRANSF.AUTOMATICA SALDO - COBRANCA;ENTRADA;1196383;+R$ 1.587,97, RECEBTO LOJA S.COMPRAS;SAIDA;100;-R$ 1.587,97, DBTO VISA TRIPAG;ENTRADA;100;+R$ 2.268,58, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 3.870,44, DBTO ELO TRIPAG;ENTRADA;100;+R$ 2.819,24, DBTO VISA TRIPAG;ENTRADA;100;+R$ 1.035,97, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 713,21, DBTO ELO TRIPAG;ENTRADA;100;+R$ 646,25, MASTER DEBITO CIELO;ENTRADA;100;+R$ 831,38, CRTO VISA TRIPAG;ENTRADA;100;+R$ 1.886,07, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 2.999,51, CRTO ELO TRIPAG;ENTRADA;100;+R$ 377,36, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 17.448,01, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C;R$ 0,00, 30/01/2024;DBTO VISA TRIPAG;ENTRADA;100;+R$ 1.733,30, HTTPS://WWW2.TRIBANCOONLINE.COM.BR/TRBONLINE/EXTRATO;10/12, 29/07/2024 11:24;TRIBANCO ONLINE, DATA;MOVIMENTACAO;TIPO;DOCUMENTO;VALOR, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 1.378,53, DBTO ELO TRIPAG;ENTRADA;100;+R$ 727,03, DBTO ELO FIRST DATA;ENTRADA;100;+R$ 495,00, CRTO VISA TRIPAG;ENTRADA;100;+R$ 310,02, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 1.595,02, CRTO ELO TRIPAG;ENTRADA;100;+R$ 377,28, CRTO VISA TRIPAG;ENTRADA;100;+R$ 55,60, CARTAO CRED.VISA - CIELO;ENTRADA;100;+R$ 161,74, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 6.833,52, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C;R$ 0,00, 31/01/2024;TRANSF.AUTOMATICA SALDO - COBRANCA;ENTRADA;1196383;+R$ 579,70, RECEBTO LOJA S.COMPRAS;SAIDA;100;-R$ 579,70, DBTO VISA TRIPAG;ENTRADA;100;+R$ 959,06, DBTO MAESTRO TRIPAG;ENTRADA;100;+R$ 694,61, DBTO ELO TRIPAG;ENTRADA;100;+R$ 608,87, CRTO VISA TRIPAG;ENTRADA;100;+R$ 234,78, CR MASTERCARD TRIPAG;ENTRADA;100;+R$ 612,21, CRTO ELO TRIPAG;ENTRADA;100;+R$ 32,33, CRTO ELO FIRST DATA;ENTRADA;100;+R$ 65,51, TRANSF. CREDITOS CARTOES - DESTINO CTA MOVIMENTO;SAIDA;-R$ 3.207,37, TRANSF.AUTOMATICA SALDO;ENTRADA;+R$ 496,20, TRANSF.CTA.CAUCAO EMPRESTIMO;SAIDA;-R$ 496,20, SALDO C/C (+);R$ 0,00, SALDO CDB CONTA INTELIGENTE (+);R$ 0,00, SALDO CDB CONTA INTELIGENTE BLOQUEADO (-);R$ 0,00, SALDO C/C;R$ 0,00, LANCAMENTOS FUTUROS, HTTPS://WWW2.TRIBANCOONLINE.COM.BR/TRBONLINE/EXTRATO;11/12, 29/07/2024 11:24;TRIBANCO ONLINE, NAO HA LANCAMENTOS PARA O FILTRO ESPECIFICADO., POSICAO DA CONTA VINCULADA EM 29/07/2024, SALDO ATUAL (+);R$ 0,00, SALDO CDB CONTA INTELIGENTE (+);R$ 0,00, SALDO CDB CONTA INTELIGENTE BLOQUEADO (+);R$ 0,00, ENCARGOS ACUMULADOS ATE A DATA (-);R$ 0,00, IOF ACUMULADO ATE A DATA (-);R$ 0,00, SALDO BLOQUEADO (+);R$ 0,00, BLOQUEIO JUDICIAL (-);R$ 0,00, * SUJEITO A ALTERACOES ATE O FIM DO DIA. INFORMACOES DO DIA 29/07/2024 AS 11:24., HTTPS://WWW2.TRIBANCOONLINE.COM.BR/TRBONLINE/EXTRATO;12/12"; // Não deve corresponder a nenhum padrão

        String resultado4 = Validator.validar(conteudoParaValidacao4);
        String resultadotribanco = Validator.validar(conteudoParaValidacaotribanco);

        System.out.println("Resultado da Validação 4: " + resultado4);
        System.out.println("Resultado da Validação resultadotribanco: " + resultadotribanco);
    }
}