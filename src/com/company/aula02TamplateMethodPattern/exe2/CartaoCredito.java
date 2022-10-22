package com.company.aula02TamplateMethodPattern.exe2;

import java.time.LocalDate;

public class CartaoCredito extends Cartao{
    private double limite;
    private double saldoUtilizado;

    public CartaoCredito(String numeroFrente, int codSeguranca, LocalDate dataValidade, double limite, double saldoUtilizado) {
        super(numeroFrente, codSeguranca, dataValidade);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(double saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }

    @Override
    public boolean autorizarCartao(double valor) {
        if((this.limite - this.saldoUtilizado  - valor) >= 0){
            this.setSaldoUtilizado(this.saldoUtilizado+valor);
            System.out.println("Credito efetuado com sucesso! Seu saldo utilizado eh de: "+ this.getSaldoUtilizado());
            return true;
        } else {
            System.out.println("Voce não possui limite para efetuar a transação! Seu limite atual eh de: "+ this.getLimite());
            return false;
        }
    }
}
