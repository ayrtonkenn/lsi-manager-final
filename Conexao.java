package br.com.lsi;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

	static java.sql.Connection con = null;
	private java.sql.Statement stm = null;
	private ResultSet resl = null;
	private String nome;

	public void conectar() throws ClassNotFoundException {
		String dbURL = "jdbc:postgresql://localhost:5432/lsi";
		String username = "postgres";
		String password = "hennrick123";

		try {

			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Connected");
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}
    public void desconectar() {
		try {
			this.con.close();
		} catch (Exception e) {
			System.out.println("erro:" + e.getMessage());
		}
	}
}