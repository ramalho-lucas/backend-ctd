package com.company.aula02TamplateMethodPattern.exe1;

import org.junit.jupiter.api.Test;

class FuncionarioTest {

    @Test
    void contratado(){
        Contratado contratado = new Contratado("Lucas", "Ramalho", "5554-5","Conta-Corrente", 100,350);

        contratado.pagamentoSalario();
    }

    @Test
    void efetivo(){
        Efetivo efetivo = new Efetivo("Raquel", "Souza", "54854-5","Conta-Corrente", 100,350, 450);

        efetivo.pagamentoSalario();
    }

}