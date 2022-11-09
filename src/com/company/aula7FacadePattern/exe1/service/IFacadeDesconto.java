package com.company.aula7FacadePattern.exe1.service;

import com.company.aula7FacadePattern.exe1.model.Cartao;
import com.company.aula7FacadePattern.exe1.model.Produto;

public interface IFacadeDesconto {
    int desconto(Cartao cartao, Produto produto, int quantidade);
}
