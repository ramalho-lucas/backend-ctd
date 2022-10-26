package com.company.aulaXFacadePattern.service;

import com.company.aulaXFacadePattern.model.Produto;

public class APIProduto {
    public int desconto(Produto produto){
        if(produto.getTipo().equals("Lata")){
            return 10;
        } else {
            return 0;
        }
    }
}
