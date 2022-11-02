package com.company.aulaXTransacoes.exeContaAula;

import com.company.aulaXTransacoes.exeContaAula.jdbc.ConnectionJDBC;
import com.company.aulaXTransacoes.exeContaAula.model.Conta;

import javax.jws.soap.SOAPBinding;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {


    private static final String SQLCREATE = "DROP TABLE IF EXISTS Conta; " +
            "CREATE TABLE Conta " +
            "( id INT PRIMARY KEY, " +
            "nome VARCHAR(100) NOT NULL, " +
            "numConta VARCHAR(20) NOT NULL, " +
            "saldo NUMERIC(15,2) );";

    private static final String SQLINSERT = "INSERT INTO Conta (id,nome,numConta,saldo) VALUES (?,?,?,?)";

    private static final String SQLUPDATE = "UPDATE Conta SET saldo = ? WHERE id = ?;";

    public static void main(String[] args) throws SQLException {
        //System.out.println(SQLCREATE);
        Conta conta = new Conta(1,"Lucas","5555-5",10);
        Connection conncetion = null;

        try{
            conncetion = ConnectionJDBC.getConnection();
            Statement statement = conncetion.createStatement();

            statement.execute(SQLCREATE);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            conncetion.close();
        }
    }
}
