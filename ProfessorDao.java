package CadastrarUsuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDao extends Conexao
{	public void createProfessor(Professor professor) throws ClassNotFoundException, SQLException {
	
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

	public void deleteProfessor(Professor professor) throws ClassNotFoundException, SQLException {
		
	    String sql = "delete from Professores where matricula_professor = ?";
	    
	    try(java.sql.PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, professor.getMatricula());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public Professor buscarProfessor(int matricula, String senha)
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
	
		public List buscarProfessores() throws ClassNotFoundException, SQLException {
			
	    	String sql = "select nome and matricula_professor from Professores";
			ArrayList<Professor> professores = new ArrayList<Professor>();

		    try(java.sql.PreparedStatement preparedStatement = con.prepareStatement(sql)){
		    	ResultSet result = preparedStatement.executeQuery();
		    	
				while(result.next()){
					Professor professor = new Professor();
					professor.setNome(result.getString("nome"));
					professor.setEmail(result.getString("email"));
					professor.setCurso(result.getString("curso"));
					professor.setMatricula(result.getInt("matricula_professor"));

		
		
					professores.add(professor);
				}
		
			} catch (SQLException e) {
		
				e.printStackTrace();
			}
		return professores;
		}
		
	public List buscarProjetos() throws ClassNotFoundException, SQLException {
				
		    	String sql = "select titulo from Projetos";
				ArrayList<Projeto> projetos = new ArrayList<Projeto>();
	
			    try(java.sql.PreparedStatement preparedStatement = con.prepareStatement(sql)){
			    	ResultSet result = preparedStatement.executeQuery();
			    	
					while(result.next()){
						Projeto projeto = new Projeto();
						projeto.setTitulo(result.getString("titulo"));
			
						projetos.add(projeto);
					}
			
				} catch (SQLException e) {
			
					e.printStackTrace();
				}
			return projetos;
			}
			
	
	}
