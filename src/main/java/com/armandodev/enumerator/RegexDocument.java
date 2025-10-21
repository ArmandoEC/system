package com.armandodev.enumerator;

public enum RegexDocument {
    
    LETRAS_NUMEROS_ESPACOS("[^a-zA-Z0-9 ]");

    private final String padrao;

    RegexDocument(String padrao) {
        this.padrao = padrao;
    }

    public String getPadrao() {
        return padrao;
    }
  
}
