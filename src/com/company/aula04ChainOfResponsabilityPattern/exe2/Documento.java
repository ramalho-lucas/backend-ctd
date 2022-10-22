package com.company.aula04ChainOfResponsabilityPattern.exe2;

public class Documento {
    private String conteudo;
    private Integer tipo;

    public Documento(String conteudo, Integer tipo) {
        this.conteudo = conteudo;
        this.tipo = tipo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
}
