package com.company.aula9AcessoABancoDeDados.exe1Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoDB {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","");
        Statement statement = connection.createStatement();

        String sqlCreateTable = "DROP TABLE IF EXISTS Teste; " +
                "CREATE TABLE Teste(Id INT PRIMARY KEY, Nome VARCHAR(255))";

        statement.execute(sqlCreateTable);

        String sqlInsert1 = "INSERT INTO Teste(Id, Nome) VALUES (1, 'Lucas')";
        String sqlInsert2 = "INSERT INTO Teste(Id, Nome) VALUES (2, 'Raquel')";
        String sqlInsert3 = "INSERT INTO Teste(Id, Nome) VALUES (3, 'Joao')";
        statement.execute(sqlInsert1);
        statement.execute(sqlInsert2);
        statement.execute(sqlInsert3);

        String sqlRead = "SELECT * FROM Teste";
        ResultSet resultSet = statement.executeQuery(sqlRead);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2));
        }
    }
}
