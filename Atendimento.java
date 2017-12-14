package br.com.lsi;

public class Atendimento 
{
	private int dia;
	private int mes;
	private String hora_inicio;
	private String hora_termino;
	private int idProfessor;
	
	
	public int getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public String getHora_inicio() {
		return hora_inicio;
	}
	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
	public String getHora_termino() {
		return hora_termino;
	}
	public void setHora_termino(String hora_termino) {
		this.hora_termino = hora_termino;
	}

}
