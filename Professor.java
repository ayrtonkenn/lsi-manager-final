package CadastrarUsuario;

import java.util.ArrayList;



public class Professor extends Pessoa{
	
	private ArrayList<Atendimento> disponibilidade = new ArrayList<Atendimento>();
	private boolean status;

	public ArrayList<Atendimento> getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(ArrayList<Atendimento> disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
}