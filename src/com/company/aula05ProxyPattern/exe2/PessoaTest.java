package com.company.aula05ProxyPattern.exe2;


import org.junit.jupiter.api.Test;

import java.util.Date;

class PessoaTest {

    @Test
    void vacinar1(){
        Date data = new Date(2022,10,19);
        Pessoa pessoa = new Pessoa("Lucas", "Ramalho", "2542545-5",data,"Pfizer");

        new ServicoVacinarProxy().vacinarPessoa(pessoa);
    }

    @Test
    void vacinar2(){
        Date data = new Date(2022,10,22);
        Pessoa pessoa = new Pessoa("Jose", "Silva", "8471855-4",data,"Coronavac");

        new ServicoVacinarProxy().vacinarPessoa(pessoa);
    }

}