package com.company.aula01UnitTest.exe1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    public void seOAnimalEhPesado(){
        Animal cavalo = new Animal("Cavalo", "Grande", 750);
        Animal cachorro = new Animal("Cachorro", "Pequeno", 8);

        boolean cachorroEhPesado = cachorro.ehPesado();

        assertEquals(true, cavalo.ehPesado());
        assertFalse(cachorroEhPesado);
    }

}