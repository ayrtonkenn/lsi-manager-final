package TestProjeto;

import Aluno.TelaAluno;
import CadastrarUsuario.LoginUsuario;
import Projeto.ProjetoJDBC;


public abstract class Test extends LoginUsuario{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws ClassNotFoundException {
		
		ProjetoJDBC b = new ProjetoJDBC();
		b.conectar();

		new LoginUsuario();
		
		//new TelaAluno();
		
		
		

	}
}