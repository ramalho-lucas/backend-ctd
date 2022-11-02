package com.company.aula7FacadePattern.exe1.service;

public class APIQuantidade {
    public int desconto(int quantidade){
        if(quantidade > 12){
            return 15;
        } else {
            return 0;
        }
    }
}
