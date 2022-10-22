package com.company.aula04ChainOfResponsabilityPattern.exe2;

public class GerenciadorPresidente extends Gerenciador{
    @Override
    public void verificar(Documento documento) {
        switch (documento.getTipo()){
            case 1:
                System.out.println("Conteudo de documento RESERVADO. Enviado para Presidente");
                if(this.getGerenciadorSeguinte() != null) {
                    this.getGerenciadorSeguinte().verificar(documento);
                }
                break;

            case 2:
                System.out.println("Conteudo de documento SECRETO. Enviado para Presidente");
                if(this.getGerenciadorSeguinte() != null) {
                    this.getGerenciadorSeguinte().verificar(documento);
                }
                break;

            case 3:
                System.out.println("Conteudo de documento MUITO SECRETO. Enviado para Presidente");
                if(this.getGerenciadorSeguinte() != null) {
                    this.getGerenciadorSeguinte().verificar(documento);
                }
                break;

            default:
                if(this.getGerenciadorSeguinte() != null){
                    this.getGerenciadorSeguinte().verificar(documento);
                }
        }
    }
}
