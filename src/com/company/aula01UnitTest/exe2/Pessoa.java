package com.company.aula01UnitTest.exe2;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String email;
    private int idade;

    public String exibeNomeCompleto(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        String nomeCompleto = this.nome + " " + this.sobrenome;
        System.out.println(nomeCompleto);
        return nomeCompleto;
    }


    public boolean ehMaiorDeIdade(){
        return this.idade >= 18;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
