package CadastrarUsuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aluno extends Pessoa 
{	
	private Projeto projeto;
	private Professor Orientador;
	
    public void cadastrarCliente(Usuario usuario) throws SQLException {
		
			
		    String sql = "insert into Usuarios(nome, email,curso)values(?, ?, ?)";
		    
		    try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
				preparedStatement.setString(1, Usuario.getNome());
				preparedStatement.setString(2, Usuario.getEmail());
				preparedStatement.setString(3, Usuario.getCurso());
				preparedStatement.execute();
			}catch(SQLException e){
				e.printStackTrace();
			}
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
		
	}
	

}
