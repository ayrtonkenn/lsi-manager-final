package Projeto;

import java.sql.DriverManager;
import java.sql.SQLException;


public class ProjetoJDBC {

	
	protected static java.sql.Connection con = null;
	

	public void conectar() throws ClassNotFoundException {
		String dbURL = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "eusoudejesus";

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
