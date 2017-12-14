package CadastrarUsuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import Projeto.ProjetoJDBC;

public class Usuario extends ProjetoJDBC {

	private static String nome;
	private String login;
	private static String email;
	private static Object tipo;
	private int codigo;
	private static String curso;
	
	public String getLogin() {
		return login;
	}

	public static String getEmail() {
		return email;
	}

	public static Object getTipo() {
		return tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}

	public void setLogin(String login) {
		this.login = login;
		
	}

	public static String getNome() {
		return nome;
	}


	public void setEmail(String email) {
		this.email = email;
		
	}

	public void setTipo(Object object) {
		this.tipo = object;
		
	}
	
	public Usuario(int codigo,String nome,String tipo) {
		this.codigo = codigo;
		this.nome = nome;
		this.tipo = tipo;
	}

	public Usuario() {
	
	}

	public void cadastrarCliente(Usuario usuario) throws SQLException{
		    
			String sql = "Insert into from Usuarios(nome,email,curso,tipo)values ("+Usuario.nome+","+Usuario.email+","+Usuario.curso+","+Usuario.tipo+")";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.execute();
	}

	int getCodigo() {
		return this.codigo;
	}

	public static Usuario pegaClientePelaSenha(int cod) {
		String sql = "select * from Usuario where codigo = ? ";
		
		
		try(PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql)) {
			preparedStatement.setInt(1, cod);
			ResultSet result = preparedStatement.executeQuery();
			
			if(result.next()){
				Usuario aluno = new Usuario();
				aluno.setNome(result.getString("nome"));
				aluno.setTipo(result.getString("tipo"));
				
				return aluno;
				}
		}catch (SQLException e) {
				e.printStackTrace();
		}
		return null;
		
	}

	public void setCurso(String curso) {
		this.curso = curso;
		
	}

	public static String getCurso() {
		
		return curso;
	}

	public void cadastrarCliente() {
		
		
	}
		
	}
	


