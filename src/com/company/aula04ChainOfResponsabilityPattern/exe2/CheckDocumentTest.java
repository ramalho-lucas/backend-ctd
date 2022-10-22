package com.company.aula04ChainOfResponsabilityPattern.exe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckDocumentTest {

    @Test
    void documentoReservado(){
        Gerenciador gerenciador = new GerenciadorDeputados();
        Documento documento = new Documento("MUITO RESERVADO", 3);
        gerenciador.verificar(documento);


        //assertEquals(gerenciador.verificar(documento),mensagem); Não está retornando nada
    }

    @Test
    void documentoSecreto(){
        Gerenciador gerenciador = new GerenciadorDeputados();
        Documento documento = new Documento("SECRETO", 2);
        gerenciador.verificar(documento);
    }

    @Test
    void documentoMuitoSecreto(){
        Gerenciador gerenciador = new GerenciadorDeputados();
        Documento documento = new Documento("RESERVADO", 1);
        gerenciador.verificar(documento);
    }
}