package com.company.aula02TamplateMethodPattern.exe1;

public abstract class Funcionario {
    private String nome;
    private String sobrenome;
    private String numConta;
    private String localDeposito;


    public Funcionario(String nome, String sobrenome, String numConta, String localDeposito) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numConta = numConta;
        this.localDeposito = localDeposito;
    }

    public void pagamentoSalario(){
        double salario;
        salario = calcularSalario();
        imprimirRecibo(salario);
        depositarSalario(salario);
    }

    public abstract double calcularSalario();

    public void imprimirRecibo(double salario){
        System.out.println("O salario calculado para funcionario : " +this.nome + " é de: " + salario);
    }

    public void depositarSalario(double salario){
        System.out.println("O valor de " + salario + " foi depostado ma conta " + this.numConta + " no nome de: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getLocalDeposito() {
        return localDeposito;
    }

    public void setLocalDeposito(String localDeposito) {
        this.localDeposito = localDeposito;
    }
}
