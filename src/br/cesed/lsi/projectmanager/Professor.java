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
	 * M�todos throws para a janela, 
	 * data j� ocupada, data n�o existente, periodo nao condiz
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
	 * ele s� pode orientar um projeto
	 * precisa marcar dias disponiveis de orientacao
	 * 
	 * 
	 */
}