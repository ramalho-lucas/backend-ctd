package com.company.aula10PadraoDAO.exe1.service;

import com.company.aula10PadraoDAO.exe1.dao.IDao;
import com.company.aula10PadraoDAO.exe1.model.Materia;

import java.util.List;


public class MateriaService {
    private IDao<Materia> materiaIDao;

    public MateriaService(IDao<Materia> materiaIDao) {
        this.materiaIDao = materiaIDao;
    }

    public Materia savar(Materia materia){
        return materiaIDao.salvar(materia);
    }

    public List<Materia> buscarTodos(){
        return materiaIDao.buscarTodos();
    }
}
