package com.company.aula04ChainOfResponsabilityPattern.exe2;

public class GerenciadorDeputados extends Gerenciador{
    @Override
    public void verificar(Documento documento) {
        if(documento.getTipo() == 1){
            System.out.println("Conteúdo do Documento RESERVADO. Enviado para Deputados");
            if(this.getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().verificar(documento);
            }
        } else {
            if(this.getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().verificar(documento);
            }
        }
    }
}
