package com.api_ouvidoria.api_ouvidoria.model.enums;

public enum AreaOuvidoria {
    SAUDE("Saúde"),
    EDUCACAO("Educação"),
    INFRAESTRUTURA("Infraestrutura"),
    SEGURANCA("Segurança"),
    ASSISTENCIA_SOCIAL("Assistência Social"),
    TRANSITO_TRANSPORTE("Trânsito e Transporte"),
    OUTROS("Outros");

    private final String rotulo;
    AreaOuvidoria(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getRotulo() {
        return rotulo;
    }
}
