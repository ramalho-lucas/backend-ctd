package com.company.aula8Logging.exe2;

import com.company.aula8Logging.exe2.model.Leao;
import com.company.aula8Logging.exe2.model.Tigre;

public class Main {
    public static void main(String[] args){
        Leao leao = new Leao("Mufasa",18,true);
        Tigre tigger = new Tigre("Chitara",-1);

        leao.correr();
        try{
            leao.eMaiorQue10();
        } catch (Exception e){
            throw new RuntimeException(e);
        }

        tigger.correr();
        try {
            tigger.eMaiorQue10();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
