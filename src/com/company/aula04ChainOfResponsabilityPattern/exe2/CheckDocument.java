package com.company.aula04ChainOfResponsabilityPattern.exe2;

public class CheckDocument {
    Gerenciador ministros, deputados, presidente;

    public CheckDocument(){
        this.deputados = new GerenciadorDeputados();
        this.ministros = new GerenciadorMinistros();
        this.presidente = new GerenciadorPresidente();

        this.deputados.setGerenciadorSeguinte(ministros);
        this.ministros.setGerenciadorSeguinte(presidente);
        this.presidente.setGerenciadorSeguinte(null);
    }

    public void verificar(Documento documento){
        deputados.verificar(documento);
    }
}
