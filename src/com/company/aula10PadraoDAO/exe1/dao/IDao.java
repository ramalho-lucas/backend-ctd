package com.company.aula10PadraoDAO.exe1.dao;

import java.util.List;

public interface IDao <T>{
    public T salvar(T t);
    public List<T> buscarTodos();
}
