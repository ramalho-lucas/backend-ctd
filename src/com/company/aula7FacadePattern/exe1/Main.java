package com.company.aula7FacadePattern.exe1;

import com.company.aula7FacadePattern.exe1.model.Cartao;
import com.company.aula7FacadePattern.exe1.model.Produto;
import com.company.aula7FacadePattern.exe1.service.FacadeDesconto;

public class Main {
    public static void main(String[] args) {
        FacadeDesconto facadeDesconto = new FacadeDesconto();
        Cartao cartao = new Cartao("11111111","Star Bank");
        Produto produto = new Produto("Refrigerante","Lata");

        int desconto1 = facadeDesconto.desconto(cartao,produto,15);
        System.out.println("O desconto eh de: " + desconto1);

    }
}
