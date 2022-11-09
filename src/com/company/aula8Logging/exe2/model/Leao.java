package com.company.aula8Logging.exe2.model;

import com.company.aula8Logging.exe2.inter.IFelino;
import org.apache.log4j.Logger;

public class Leao implements IFelino {

    private static final Logger logger = Logger.getLogger(Leao.class);

    private String nome;
    private int idade;
    private boolean eAlfa;

    public Leao(String nome, int idade, boolean eAlfa) {
        this.nome = nome;
        this.idade = idade;
        this.eAlfa = eAlfa;
    }



    public boolean iseAlfa() {
        return eAlfa;
    }

    public void seteAlfa(boolean eAlfa) {
        this.eAlfa = eAlfa;
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
    logger.info("O leao " + nome+ " esta correndo");
    }

    @Override
    public void eMaiorQue10() throws Exception {
        if(idade > 10 && iseAlfa()){
            logger.info("O leao " +nome+ " é maior que 10 anos!");
        }
        if (idade < 0){
            logger.error("A idade não pode ser negativa");
            throw new Exception();
        }
    }
}
