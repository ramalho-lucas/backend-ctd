package com.company.aula05ProxyPattern.exe2;

import java.util.Date;

public class ServicoVacinar implements Vacinar{

    @Override
    public void vacinarPessoa(Pessoa pessoa) {
        System.out.println("Usuário(a) "+ pessoa.getRg() + " vacinado(a) em: "+ new Date() + " com sucesso");
    }
}
