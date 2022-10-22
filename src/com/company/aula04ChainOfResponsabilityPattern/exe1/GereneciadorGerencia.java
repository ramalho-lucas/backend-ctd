package com.company.aula04ChainOfResponsabilityPattern.exe1;

public class GereneciadorGerencia extends Gerenciador{

    @Override
    public void verificar(Mail mail) {
        if(mail.getDestino().equalsIgnoreCase("gerencia@colmeia.com") ||
            mail.getAssunto().equalsIgnoreCase("Gerencia")){
            System.out.println("Enviado ao departamento Gerencial");
        } else {
            if(this.getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().verificar(mail);
            }
        }
    }
}
