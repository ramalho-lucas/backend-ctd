package com.company.aulaXFacadePattern;

import com.company.aulaXFacadePattern.model.Cartao;
import com.company.aulaXFacadePattern.model.Produto;
import com.company.aulaXFacadePattern.service.FacadeDesconto;

public class Main {
    public static void main(String[] args) {
        FacadeDesconto facadeDesconto = new FacadeDesconto();
        Cartao cartao = new Cartao("11111111","Star Bank");
        Produto produto = new Produto("Refrigerante","Lata");

        int desconto1 = facadeDesconto.desconto(cartao,produto,15);
        System.out.println("O desconto eh de: " + desconto1);

    }
}
