package com.company.aula7FacadePattern.exe1.service;

import com.company.aula7FacadePattern.exe1.model.Produto;

public class APIProduto {
    public int desconto(Produto produto){
        if(produto.getTipo().equals("Lata")){
            return 10;
        } else {
            return 0;
        }
    }
}
