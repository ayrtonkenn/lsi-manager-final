package CadastrarUsuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlunoDao extends Conexao
{	public void createAluno(Aluno aluno) throws ClassNotFoundException, SQLException {
	
    String sql = "insert into Alunos(nome, curso, senha, matricula, email)values(?, ?, ?, ?, ?)";
    
    try(java.sql.PreparedStatement preparedStatement = con.prepareStatement(sql)){
		preparedStatement.setString(1, aluno.getNome());
		preparedStatement.setString(2, aluno.getCurso());
		preparedStatement.setString(3, aluno.getSenha());
		preparedStatement.setInt(4, aluno.getMatricula());
		preparedStatement.setString(5, aluno.getEmail());
		preparedStatement.execute();
	}catch(SQLException e){
		e.printStackTrace();
	}
}
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
	public void deleteAluno(Aluno aluno) throws ClassNotFoundException, SQLException {
		
	    String sql = "delete from Alunos where matricula = ?";
	    
	    try(java.sql.PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, aluno.getMatricula());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
		public Aluno buscarAluno(int matricula, String senha)
	{	String sql = "select * from Alunos where matricula = ? and senha = ?";
			try(PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql)) {
				preparedStatement.setInt(1, matricula);
				preparedStatement.setString(2, senha);
				ResultSet result = preparedStatement.executeQuery();
				
				if(result.next()){
					Aluno aluno = new Aluno();
					aluno.setMatricula(result.getInt("matricula"));
					aluno.setCurso(result.getString("curso"));
					aluno.setNome(result.getString("nome"));
					aluno.setEmail(result.getString("email"));
					aluno.setSenha(result.getString("senha"));
				return aluno;
				}
				
		} 	catch (SQLException e) {
				e.printStackTrace();
		}
			return null; 
			
		}
		public void cadastrarCliente() {
			// TODO Auto-generated method stub
			
		}

}
