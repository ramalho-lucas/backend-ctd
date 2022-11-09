package com.company.aula10PadraoDAO.exe2farmaciaDAO.service;

import com.company.aula10PadraoDAO.exe2farmaciaDAO.dao.IDao;
import com.company.aula10PadraoDAO.exe2farmaciaDAO.dao.impl.MedicamentosDaoH2;
import com.company.aula10PadraoDAO.exe2farmaciaDAO.model.Medicamento;

import java.sql.SQLException;

public class MedicamentoService {
    public Medicamento salvar(Medicamento medicamento) throws SQLException {
        IDao<Medicamento> medicamentoIDao = new MedicamentosDaoH2();
        return medicamentoIDao.salvar(medicamento);
    }
}
