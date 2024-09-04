package org.example.TestesLocalOIC.RefatorasRUNEXT.littleProject;

public class zzzValidator {

    public static String validar(String padraoExtraido, String validacaoManual) {
        if (padraoExtraido.equalsIgnoreCase(validacaoManual)) {
            return "Validação bem-sucedida";
        } else {
            return "Falha na validação";
        }
    }
}

