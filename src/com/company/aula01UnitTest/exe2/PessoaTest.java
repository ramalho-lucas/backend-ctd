package com.company.aula01UnitTest.exe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    public void nomeEstaCompleto(){
        Pessoa lucas = new Pessoa();

        lucas.setNome("Lucas");
        lucas.setSobrenome("Ramalho do Nascimento");


        assertEquals(lucas.exibeNomeCompleto(lucas.getNome(), lucas.getSobrenome()), "Lucas Ramalho do Nascimento");
    }

    @Test
    public void ehMaiorDeIdade(){
        Pessoa lucas = new Pessoa();
        Pessoa joao = new Pessoa();

        lucas.setIdade(19);
        joao.setIdade(16);

        assertTrue(lucas.ehMaiorDeIdade());
        assertFalse(joao.ehMaiorDeIdade());
    }



}