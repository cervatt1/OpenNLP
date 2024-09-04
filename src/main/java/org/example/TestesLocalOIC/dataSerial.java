package org.example.TestesLocalOIC;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class dataSerial {

    public static void main(String[] args) throws IOException {
        String str = "Preço: 123456232003,94";

        // Verifica se a string contém ",XX", onde X é qualquer dígito
        boolean contemVirgulaNumeros = str.matches(".*\\,\\d{2}");

        if (contemVirgulaNumeros) {
            System.out.println("A string contém \",XX\".");
        } else {
            System.out.println("A string não contém \",XX\".");
        }
        /*String dataString = "20240,867876";

        if(dataString.matches("^\\d{5}[.,].*") || dataString.length() == 5){
            String dataStringSerial = dataString;
                System.out.println(dataStringSerial);
        }*/
    }

    /*

    public static void main(String[] args) throws IOException {
        String dataString = "";

        if(dataString.matches("^\\d{5}.*")){
            String dataStringSerial = dataString;
            if(dataStringSerial.contains(",")) dataStringSerial = cutString(dataString, 0, ",");
            if(dataStringSerial.contains(".")) dataStringSerial = cutString(dataString, 0, ".");
            try {
                Date dt = DateUtil.stringToDate("01/01/1900", "dd/MM/yyyy");
                int datanum = Integer.parseInt(dataStringSerial);
                Calendar calSerial = Calendar.getInstance();
                calSerial.setTime(dt);
                calSerial.add(Calendar.DAY_OF_YEAR, datanum -2);
                dataStringSerial = DateUtil.dateToString(calSerial.getTime(), "dd/MM/yyyy");

                System.out.println(dataStringSerial);

            }catch (Exception dt2) { }
        }
    }

    public String cutString(String texto, String termoInicial, String termoFinal){
        if(!texto.contains(termoInicial)) return texto;
        texto = texto.trim();

        if(texto.contains(termoInicial) && !texto.endsWith(termoInicial))texto = texto.substring(texto.indexOf(termoInicial)+termoInicial.length()).trim();
        if(texto.contains(termoFinal) && !texto.startsWith(termoFinal))texto = texto.substring(0,texto.indexOf(termoFinal)).trim();

        return trimChar(texto);

    }

    // Realizado ajustes quando string termina com termoIncial e termoInicial possui mais de uma ocorrencia.
    public String cutString(String texto, String termoInicial) {
        if (!texto.contains(termoInicial)) { return texto; }
        texto = texto.trim();
        if (texto.contains(termoInicial)) {
            boolean temDois = texto.lastIndexOf(termoInicial) > texto.indexOf(termoInicial);
            if (temDois) {
                texto = texto.substring(texto.indexOf(termoInicial) + termoInicial.length()).trim();
            } else if (!texto.endsWith(termoInicial)) {
                texto = texto.substring(texto.indexOf(termoInicial) + termoInicial.length()).trim();
            }
        }
        return trimChar(texto, "NCFINAL");
    }

    public String cutString(String texto, int indiceInicial, int indiceFinal){
        texto = texto.trim();
        if(indiceInicial > indiceFinal) return texto;
        if(indiceInicial >= 0 && indiceFinal >= 1){
            if(texto.length() > indiceFinal)   texto = texto.substring(0,indiceFinal).trim();
            if(texto.length() > indiceInicial) texto = texto.substring(indiceInicial).trim();
        }
        if(indiceInicial == 0) return trimChar(texto, "NCINICIO");
        return trimChar(texto);

    }

    public static String cutString(String texto, int indiceInicial, String termoFinal){
        texto = texto.trim();

        if(indiceInicial >= 0 && texto.length() > indiceInicial) texto = texto.substring(indiceInicial).trim();
        if(texto.contains(termoFinal) && !texto.startsWith(termoFinal)) texto = texto.substring(0,texto.indexOf(termoFinal)).trim();

        if(indiceInicial == 0) return trimChar(texto, "NCINICIO");
        return trimChar(texto);

    }

    public String cutString(String texto, String termoInicial, int indiceFinal){
        if(!texto.contains(termoInicial)) return texto;
        texto = texto.trim();
        if(indiceFinal >= 1 && texto.length() > indiceFinal) texto = texto.substring(0,indiceFinal).trim();
        if(texto.contains(termoInicial) && !texto.endsWith(termoInicial)) texto = texto.substring(texto.indexOf(termoInicial)+termoInicial.length()).trim();

        return trimChar(texto);
    }

    public String cutString(String texto, int indiceInicial){
        texto = texto.trim();
        if(indiceInicial >= 0 && texto.length() > indiceInicial) texto = texto.substring(indiceInicial).trim();

        if(indiceInicial == 0) return trimChar(texto, "NCINICIO");
        return trimChar(texto, "NCFINAL");
    }


    public static String trimChar(String texto){
        texto = texto.trim();
        int lengthAnterior = 0;
        for(int xyz = 0; xyz < 15; xyz++){
            if(texto.length() > 1){
                if(!Character.isDigit(texto.charAt(texto.length()-1)) && !Character.isLetter(texto.charAt(texto.length()-1)) && texto.charAt(texto.length()-1) != '.' && texto.charAt(texto.length()-1) != ')') {
                    texto = texto.substring(0,texto.length()-1).trim();
                }
                if(!Character.isDigit(texto.charAt(0)) && !Character.isLetter(texto.charAt(0))){
                    texto = texto.substring(1).trim();
                }
            }
            if(texto.length() == 1){
                if(!Character.isDigit(texto.charAt(0)) && !Character.isLetter(texto.charAt(0))) texto = "";
                return texto;
            }

            if(texto.length() == lengthAnterior) return texto.trim();
            lengthAnterior = texto.length();
        }
        return texto.trim();
    }

    public static String trimChar(String texto, String param){
        texto = texto.trim();
        int lengthAnterior = 0;
        for(int xyz = 0; xyz < 15; xyz++){
            if(texto.length() > 1 && !param.contains("NCFINAL")){
                if(!Character.isDigit(texto.charAt(texto.length()-1)) && !Character.isLetter(texto.charAt(texto.length()-1)) && texto.charAt(texto.length()-1) != '.' && texto.charAt(texto.length()-1) != ')') {
                    texto = texto.substring(0,texto.length()-1).trim();
                }
                if(!Character.isDigit(texto.charAt(0)) && !Character.isLetter(texto.charAt(0)) && !param.contains("NCINICIO")){
                    texto = texto.substring(1).trim();
                }
            }
            if(texto.length() == 1){
                if(!Character.isDigit(texto.charAt(0)) && !Character.isLetter(texto.charAt(0))) texto = "";
                return texto;
            }

            if(texto.length() == lengthAnterior) return texto.trim();
            lengthAnterior = texto.length();
        }
        return texto.trim();
    }
*/

}
