package com.company.aula10PadraoDAO.exe2farmaciaDAO.teste;

import com.company.aula10PadraoDAO.exe2farmaciaDAO.model.Medicamento;
import com.company.aula10PadraoDAO.exe2farmaciaDAO.service.MedicamentoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MedicamentoServiceTest {

    MedicamentoService medicamentoService;

    @BeforeEach
    void doBefore(){
        medicamentoService = new MedicamentoService();
    }

    @Test
    public void guardarMedicamento() throws SQLException {
        Medicamento medicamento = new Medicamento();
        medicamento.setPreco(30.50);
        medicamento.setQuantidade(10);
        medicamento.setNome("Ibuprofeno");
        medicamento.setLaboratorio("ACHE");

        medicamentoService.salvar(medicamento);

        Assertions.assertTrue(medicamento.getId() > 0);
        System.out.println(medicamento.getId());
    }

}