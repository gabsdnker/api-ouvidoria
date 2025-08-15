package com.api_ouvidoria.api_ouvidoria.model.enums;

public enum TipoOuvidoria {
    DENUNCIA("Denúncia"),
    RECLAMACAO("Reclamação"),
    SUGESTAO("Sugestão"),
    ELOGIO("Elogio"),
    INFORMACAO("Informação");

    private final String rotulo;
    TipoOuvidoria(String rotulo) {
        this.rotulo = rotulo;
    }
    public String getRotulo() {
        return rotulo;
    }
}
