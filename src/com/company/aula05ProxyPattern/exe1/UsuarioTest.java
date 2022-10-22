package com.company.aula05ProxyPattern.exe1;

import org.junit.jupiter.api.Test;

class UsuarioTest {

    @Test
    void usuarioFree(){
        Usuario usuario = new Usuario("Lucas","Free");

        new ServicoDownloadProxy().baixarMusica(usuario);
    }

    @Test
    void usuarioPremium(){
        Usuario usuario = new Usuario("Raquel","Premium");

        new ServicoDownloadProxy().baixarMusica(usuario);
    }

}