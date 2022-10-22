package com.company.aula02TamplateMethodPattern.exe2;

import java.time.LocalDate;

public class CartaoDebito extends Cartao{
    private double saldoDisponivel;

    public CartaoDebito(String numeroFrente, int codSeguranca, LocalDate dataValidade, double saldoDisponivel) {
        super(numeroFrente, codSeguranca, dataValidade);
        this.saldoDisponivel = saldoDisponivel;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    @Override
    public boolean autorizarCartao(double valor) {
        if((this.saldoDisponivel - valor) >= 0){
            this.setSaldoDisponivel(this.saldoDisponivel-valor);
            System.out.println("Debito efetuado com sucesso! Seu saldo atual eh de: "+ this.getSaldoDisponivel());
            return true;
        } else {
            System.out.println("Voce não possui saldo para efetuar a transação! Seu saldo atual eh de: "+ this.getSaldoDisponivel());
            return false;
        }

    }
}
