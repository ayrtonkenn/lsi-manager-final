package br.com.lsi;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AtendimentoDao extends Conexao
{	
	public void createAtendimento(Atendimento atendimento, int matricula) throws ClassNotFoundException, SQLException {
	
	    String sql = "insert into Atendimentos(idProfessor, mes, dia, hora_inicio, hora_termino)values(select idProfessor from professores where matricula_professor = ?, ?, ?, ?, ?)";
	    
	    try(java.sql.PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, matricula);
			preparedStatement.setInt(2, atendimento.getMes());
			preparedStatement.setInt(3, atendimento.getDia());
			preparedStatement.setString(4, atendimento.getHora_inicio());
			preparedStatement.setString(5, atendimento.getHora_termino());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void buscarAtendimentos(Professor professor){
		ArrayList<Atendimento> listaAtendimentos = new ArrayList<Atendimento>();
	
		String sql = "select * from Atedimentos where idProfessor = (select idProfessor from Professores where matricula = ?)";
		try(PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql)) {
			preparedStatement.setInt(1, professor.getMatricula());	
			ResultSet result = preparedStatement.executeQuery();
	
			while(result.next()){
				Atendimento atendimento = new Atendimento();
				atendimento.setIdProfessor(result.getInt("idProfessor"));
				atendimento.setMes(result.getInt("mes"));
				atendimento.setDia(result.getInt("dia"));
				atendimento.setHora_inicio(result.getString("hora_inicio"));
				atendimento.setHora_termino(result.getString("hora_termino"));

	
	
				listaAtendimentos.add(atendimento);
			}
	
			professor.setDisponibilidade(listaAtendimentos);
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
	
	}
	public void deleteAtendimento(Professor professor,int dia, int mes, String hora_inicio) throws ClassNotFoundException, SQLException {
			
		    String sql = "delete from Atendimentos where idProfessor = (select idProfessor from Professores where matricula = ?) and dia = ? and mes = ? and hora_inicio = ? ";
		    
		    try(java.sql.PreparedStatement preparedStatement = con.prepareStatement(sql)){
				preparedStatement.setInt(1, professor.getMatricula());
				preparedStatement.setInt(2, dia);
				preparedStatement.setInt(3, mes);
				preparedStatement.setString(4, hora_inicio);
				preparedStatement.execute();
			}catch(SQLException e){
				e.printStackTrace();
			}
	}
}
