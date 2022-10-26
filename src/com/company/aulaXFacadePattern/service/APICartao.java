package com.company.aulaXFacadePattern.service;

import com.company.aulaXFacadePattern.model.Cartao;

public class APICartao {
    public int desconto(Cartao cartao){
        if(cartao.getBanco().equals("StarBank")){
            return 20;
        } else {
            return 0;
        }
    }
}
