package br.cesed.lsi.projectmanager;
import java.util.ArrayList;
import java.util.Date;

public class Professor {
	private String nome;
	private int usuario;
	private ArrayList<Date> disponibilidade = new ArrayList<Date>();
	ArrayList<TarefasHorario> tarefas = new ArrayList<TarefasHorario>();
	
	/*
	 * Notas do posgresql
	 * 
	 */
	
	public void getdata() {
		
	}
	/*
	 * Métodos throws para a janela, 
	 * data já ocupada, data não existente, periodo nao condiz
	 * 
	 */
	public void marcarData () {
		
	}
	public void cancelarData() {
		
	}
	public void inserirSugestaoTema() {
		
	}
	public void inserirMeta() {
		
	}
	/*
	 * ele só pode orientar um projeto
	 * precisa marcar dias disponiveis de orientacao
	 * 
	 * 
	 */
}