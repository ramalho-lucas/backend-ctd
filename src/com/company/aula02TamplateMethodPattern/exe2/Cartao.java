package com.company.aula02TamplateMethodPattern.exe2;

import java.time.LocalDate;

public abstract class Cartao {
    private String numeroFrente;
    private int codSeguranca;
    private LocalDate dataValidade;

    public Cartao(String numeroFrente, int codSeguranca, LocalDate dataValidade) {
        this.numeroFrente = numeroFrente;
        this.codSeguranca = codSeguranca;
        this.dataValidade = dataValidade;
    }

    public abstract boolean autorizarCartao(double valor);

    public String getNumeroFrente() {
        return numeroFrente;
    }

    public void setNumeroFrente(String numeroFrente) {
        this.numeroFrente = numeroFrente;
    }

    public int getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(int codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
