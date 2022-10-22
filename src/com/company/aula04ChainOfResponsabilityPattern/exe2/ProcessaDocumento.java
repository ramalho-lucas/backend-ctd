package com.company.aula04ChainOfResponsabilityPattern.exe2;

import javax.print.Doc;

public class ProcessaDocumento {
    public static void main(String[] args) {
        Documento documentoReservado = new Documento("Aprovação Lei", 1);
        Documento documentoSecreto = new Documento("Verba Vacina", 2);
        Documento documentoMuitoSecreto = new Documento("Guerra Nuclear", 3);

        CheckDocument documento = new CheckDocument();

        System.out.println("=== Verificação documento RESERVADO ===");
        documento.verificar(documentoReservado);
        System.out.println("=== Verificação documento SECRETO ===");
        documento.verificar(documentoSecreto);
        System.out.println("=== Verificação documento MUITO SECRETO ===");
        documento.verificar(documentoMuitoSecreto);


    }
}
