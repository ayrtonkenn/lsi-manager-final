package CadastrarUsuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import Projeto.ProjetoJDBC;

public class Usuario extends ProjetoJDBC {

	private String nome;
	private String login;
	private String email;
	private Object tipo;
	private int codigo;
	
	public String getLogin() {
		return login;
	}

	public String getEmail() {
		return email;
	}

	public Object getTipo() {
		return tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}

	public void setLogin(String login) {
		this.login = login;
		
	}

	public String getNome() {
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

	public void cadastrarCliente(Usuario usuario) {
	
			String sql = "Insert into from Usuario(nome,tipo,codigo)values (?,?,?)";
			
			
			 try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
					preparedStatement.setString(1, usuario.getNome());
					preparedStatement.setNString(2, (String) usuario.getTipo());
					preparedStatement.setInt(3, usuario.getCodigo());
					preparedStatement.execute();
				}catch(SQLException e){
					e.printStackTrace();
				}
			
		}

	private int getCodigo() {
		
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

	public void cadastrarCliente() {
		
	}
		
	}
	


