package com.company.aulaXFacadePattern.service;

import com.company.aulaXFacadePattern.model.Cartao;
import com.company.aulaXFacadePattern.model.Produto;

public interface IFacadeDesconto {
    int desconto(Cartao cartao, Produto produto, int quantidade);
}
