/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class ModuloConexao {
    // Método responsável por estabelecer a conexão com o banco
    public static Connection conector() {
        Connection conexao = null;

        // Informações do banco de dados
       
        String url = "jdbc:mysql://localhost:3306/dbinfox"; // Substitua "seu_banco" pelo nome do banco
        String user = "root"; // Usuário do banco
        String password = "Lucas.1995"; // Senha do banco

        // Tentativa de conexão
        try {
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão com o banco de dados foi bem-sucedida!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados:");
            e.printStackTrace(); // Exibe o erro detalhado no console
        }

        return conexao; // Retorna a conexão (ou null, caso tenha falhado)
    }
}
