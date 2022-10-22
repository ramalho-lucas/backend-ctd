package com.company.aula02TamplateMethodPattern.exe1;

public class Contratado extends Funcionario{
    private double valorHora;
    private int horas;

    public Contratado(String nome, String sobrenome, String numConta, String localDeposito, double valorHora, int horas) {
        super(nome, sobrenome, numConta, localDeposito);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horas;
    }
}
