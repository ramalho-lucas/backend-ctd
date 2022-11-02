package com.company.aula10PadraoDAO.exe1.testeMateriaService;

import com.company.aula10PadraoDAO.exe1.dao.ConfiguracaoJDBC;
import com.company.aula10PadraoDAO.exe1.dao.impl.MateriaDaoH2;
import com.company.aula10PadraoDAO.exe1.model.Materia;
import com.company.aula10PadraoDAO.exe1.service.MateriaService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MateriaServiceTest {
    private MateriaService materiaService = new MateriaService(new MateriaDaoH2(new ConfiguracaoJDBC()));

    @Test
    public void salvarMateriaTest(){
        Materia materia = new Materia("BackEnd");

        Materia materiaRegistrada = materiaService.savar(materia);

        assertTrue(materiaRegistrada.getId() != null);
    }

    @Test
    public void buscarTodosTest(){
        Materia materia = new Materia("BackEnd");
        materiaService.savar(materia);

        List<Materia> materias = materiaService.buscarTodos();
        assertEquals(1,materias.size());
    }

}