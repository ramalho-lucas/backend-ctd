package com.company.aula02TamplateMethodPattern.exe2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class CartaoTest {

    @Test
    void usuarioDebito1(){
     CartaoDebito cartaodebito = new CartaoDebito("123456789",606,LocalDate.of(2026,10,15),800.00);
     cartaodebito.autorizarCartao(500.00);
    }

    @Test
    void usuarioDebito2(){
        CartaoDebito cartaodebito = new CartaoDebito("123456789",606,LocalDate.of(2026,10,15),800.00);
        cartaodebito.autorizarCartao(900.00);
    }

    @Test
    void usuarioCredito1(){
        CartaoCredito cartaoCredito = new CartaoCredito("123456789",606,LocalDate.of(2026,10,15),800.00, 200.00);
        cartaoCredito.autorizarCartao(500.00);
    }

    @Test
    void usuarioCredito2(){
        CartaoCredito cartaoCredito = new CartaoCredito("123456789",606,LocalDate.of(2026,10,15),800.00, 200.00);
        cartaoCredito.autorizarCartao(900.00);
    }

}