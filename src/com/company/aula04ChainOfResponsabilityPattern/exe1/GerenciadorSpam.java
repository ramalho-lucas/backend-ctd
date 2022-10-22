package com.company.aula04ChainOfResponsabilityPattern.exe1;

public class GerenciadorSpam extends Gerenciador{
    @Override
    public void verificar(Mail mail) {
        System.out.println("Email marcado como spam");
    }
}
