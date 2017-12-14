package br.com.lsi;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class AlunoDaoTest {

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		Aluno aluno = new Aluno();
		aluno.setNome("heroiso");
		aluno.setCurso("sistemas");
		aluno.setSenha("hennrick123");
		aluno.setMatricula(1523080008);
		aluno.setEmail("hennrick@iii.com.br");
		
		AlunoDao dao = new AlunoDao();
		dao.conectar();
		dao.createAluno(aluno);
		Aluno exemplo = dao.buscarAluno(aluno.getMatricula(), aluno.getSenha());
		System.out.println(exemplo.getMatricula() + exemplo.getNome());
	}

}
