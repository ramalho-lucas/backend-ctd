package com.company.aula7FacadePattern.exe1.service;

import com.company.aula7FacadePattern.exe1.model.Cartao;
import com.company.aula7FacadePattern.exe1.model.Produto;

public class FacadeDesconto implements IFacadeDesconto{
    private APICartao cartao;
    private APIProduto produto;
    private APIQuantidade quantidade;

    public FacadeDesconto(){
        this.cartao = new APICartao();
        this.produto = new APIProduto();
        this.quantidade = new APIQuantidade();
    }

    @Override
    public int desconto(Cartao cartao, Produto produto, int quantidade) {
        int totalDesconto = 0;

        APICartao apicartao = new APICartao();
        totalDesconto += apicartao.desconto(cartao);

        APIProduto apiProduto = new APIProduto();
        totalDesconto += apiProduto.desconto(produto);

        APIQuantidade apiQuantidade = new APIQuantidade();
        totalDesconto += apiQuantidade.desconto(quantidade);

        return totalDesconto;
    }
}
