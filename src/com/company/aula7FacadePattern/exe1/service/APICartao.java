package com.company.aula7FacadePattern.exe1.service;

import com.company.aula7FacadePattern.exe1.model.Cartao;

public class APICartao {
    public int desconto(Cartao cartao){
        if(cartao.getBanco().equals("StarBank")){
            return 20;
        } else {
            return 0;
        }
    }
}
