package com.company.aulaXFacadePattern.service;

import com.company.aulaXFacadePattern.model.Produto;

public class APIQuantidade {
    public int desconto(int quantidade){
        if(quantidade > 12){
            return 15;
        } else {
            return 0;
        }
    }
}
