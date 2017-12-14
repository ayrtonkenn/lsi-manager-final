package Aluno;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import CadastrarUsuario.Usuario;
import Professor.Professor;
import Projeto.ProjetoJDBC;

public class Aluno extends ProjetoJDBC{
	
	public static int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public static int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public static int getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(int hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public static int getHora_termino() {
		return hora_termino;
	}

	public void setHora_termino(int hora_termino) {
		this.hora_termino = hora_termino;
	}

	public static Professor getProfessor() {
		return professor;
	}

	public static String getNome() {
		return nome;
	}

	public static Professor professor;
	public static String nome;
    public static int dia;
    public static int mes;
    public static int hora_inicio;
    public static int hora_termino;
    
	public void setProfessor(Professor professor) {
		Aluno.professor = professor;
		
	}

	public void setNome(String nome) {
		Aluno.nome = nome;
	}

	public static void cadastrarTcc() {
		  String sql = "insert into datas_orienta(mes,dia,hora_inicio,hora_termino)values(?, ?, ?, ?)";
		    
		    try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
				preparedStatement.setInt(1, Aluno.getMes());
				preparedStatement.setInt(2, Aluno.getDia());
				preparedStatement.setInt(3, Aluno.getHora_inicio());
				preparedStatement.setInt(4, Aluno.getHora_termino());
				preparedStatement.execute();
			}catch(SQLException e){
				e.printStackTrace();
			}
	}

}