package com.company.aula05ProxyPattern.exe1;

public class ServicoDownload implements Download{


    @Override
    public void baixarMusica(Usuario usuario) {
        System.out.println("Usuario "+ usuario.getNomeUsuario()+ " esta baixando a musica");
    }
}
