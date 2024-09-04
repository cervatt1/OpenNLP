package org.example.TestesLocalOIC.RefatorasRUNEXT.project2;

class ExpressaoValidacao {
    private String expressao;
    private boolean isRegex;

    public ExpressaoValidacao(String expressao, boolean isRegex) {
        this.expressao = expressao;
        this.isRegex = isRegex;
    }

    public boolean isRegex() {
        return isRegex;
    }

    public String getExpressao() {
        return expressao;
    }

    // Add a method to split and check sequence-based expressions
    public boolean matchesSequence(String conteudoArquivo) {
        String[] sequence = this.expressao.split(";");
        for (String term : sequence) {
            if (!conteudoArquivo.contains(term)) {
                return false;
            }
        }
        return true;
    }
}
