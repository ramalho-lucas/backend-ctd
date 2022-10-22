package com.company.aula05ProxyPattern.exe1;

public class ServicoDownloadProxy implements Download{
    @Override
    public void baixarMusica(Usuario usuario) {
        if(usuario.getPerfil() == "Premium"){
            new ServicoDownload().baixarMusica(usuario);
        } else {
            System.out.println("Usuario(a) com perfil "+ usuario.getPerfil()+ " não pode baixar músicas");
        }
    }
}
