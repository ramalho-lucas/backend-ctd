package com.company.aula05ProxyPattern.exe1;

public class Usuario {
    private String nomeUsuario;
    private String perfil;

    public Usuario(String nomeUsuario, String perfil) {
        this.nomeUsuario = nomeUsuario;
        this.perfil = perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
