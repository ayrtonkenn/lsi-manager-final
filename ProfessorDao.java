package br.com.lsi;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfessorDao extends Conexao
{	public void createAluno(Professor professor) throws ClassNotFoundException, SQLException {
	
    	String sql = "insert into Professores(nome, curso, senha, matricula_professor, email)values(?, ?, ?, ?, ?)";
    
	    try(java.sql.PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setString(1, professor.getNome());
			preparedStatement.setString(2, professor.getCurso());
			preparedStatement.setString(3, professor.getSenha());
			preparedStatement.setInt(4, professor.getMatricula());
			preparedStatement.setString(5, professor.getEmail());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	public void deleteAluno(Professor professor) throws ClassNotFoundException, SQLException {
		
	    String sql = "delete from Professores where matricula_professor = ?";
	    
	    try(java.sql.PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, professor.getMatricula());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public Professor buscarAluno(int matricula, String senha)
	{	String sql = "select * from Professores where matricula_professor = ? and senha = ?";
			try(PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql)) {
				preparedStatement.setInt(1, matricula);
				preparedStatement.setString(2, senha);
				ResultSet result = preparedStatement.executeQuery();
				
				if(result.next()){
					Professor professor = new Professor();
					professor.setMatricula(result.getInt("matricula_professor"));
					professor.setCurso(result.getString("curso"));
					professor.setNome(result.getString("nome"));
					professor.setEmail(result.getString("email"));
					professor.setSenha(result.getString("senha"));
				return professor;
				}
				
		} 	catch (SQLException e) {
				e.printStackTrace();
		}
			return null; 
			
		}


}
