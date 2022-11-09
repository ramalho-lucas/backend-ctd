package com.company.aula8Logging.exe2.model;

import com.company.aula8Logging.exe2.inter.IFelino;
import org.apache.log4j.Logger;


public class Tigre implements IFelino {

    private static final Logger logger = Logger.getLogger(Tigre.class);
    private String nome;
    private int idade;

    public Tigre(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void correr() {
        logger.info("O tigre esta correndo");
    }

    @Override
    public void eMaiorQue10() throws Exception {
        if(idade > 10){
            logger.info("O tigre é maior que 10 anos!");
        }
        if(idade < 0){
            logger.error("A idade nao pode ser negativa");
            throw new Exception();
        }
    }
}
