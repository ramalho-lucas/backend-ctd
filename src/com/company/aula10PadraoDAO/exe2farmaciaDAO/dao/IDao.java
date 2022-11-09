package com.company.aula10PadraoDAO.exe2farmaciaDAO.dao;

import java.sql.SQLException;

public interface IDao <T>{
    public T salvar(T t) throws SQLException;
}
