package com.company.aula04ChainOfResponsabilityPattern.exe2;

import com.company.aula04ChainOfResponsabilityPattern.exe1.Mail;

public abstract class Gerenciador {

    Gerenciador gerenciadorSeguinte;

    public Gerenciador getGerenciadorSeguinte() {
        return gerenciadorSeguinte;
    }

    public void setGerenciadorSeguinte(Gerenciador gerenciadorSeguinte) {
        this.gerenciadorSeguinte = gerenciadorSeguinte;
    }

    public abstract void verificar(Documento documento);

}
