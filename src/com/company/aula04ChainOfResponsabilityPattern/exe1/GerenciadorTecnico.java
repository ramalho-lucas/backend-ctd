package com.company.aula04ChainOfResponsabilityPattern.exe1;

public class GerenciadorTecnico extends Gerenciador{
    @Override
    public void verificar(Mail mail) {
        if(mail.getDestino().equalsIgnoreCase("tecnia@comeia.com") ||
            mail.getAssunto().equalsIgnoreCase("Tecnica")){
            System.out.println("Enviado ao departamento Tecnica");
        } else {
            if(this.getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().verificar(mail);
            }
        }
    }
}
