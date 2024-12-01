package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe User.
 * Responsável por realizar operações relacionadas ao login do usuário.
 */
public class User {

    /**
     * Método que conecta ao banco de dados.
     *
     * @return Um objeto Connection para realizar operações no banco de dados.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carrega o driver de conexão do MySQL
            Class.forName("com.mysql.Driver").newInstance();

            // Configurações de conexão
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);

        } catch (Exception e) {
            // Em caso de erro, a conexão retorna como null
            return conn;
        }
        return conn;
    }

    /**
     * Método que verifica se o usuário existe no banco de dados.
     *
     * @param login O login do usuário.
     * @param senha A senha do usuário.
     * @return True se o login for bem-sucedido, false caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = ""; // Armazena a consulta SQL
        Connection conn = conectarBD(); // Conecta ao banco de dados

        // Criação da consulta SQL para validar usuário
        sql += "select nome from usuarios ";
        sql += "where login = '" + login + "'";
        sql += " and senha = '" + senha + "'";

        try {
            // Executa a consulta no banco de dados
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Verifica se há resultados
            if (rs.next()) {
                result = true; // Login bem-sucedido
                nome = rs.getString("nome"); // Nome do usuário
            }
        } catch (Exception e) {
            // Em caso de erro, nada é alterado
        }

        return result;
    }

    private String nome = ""; // Nome do usuário autenticado
    private boolean result = false; // Resultado da autenticação
}
