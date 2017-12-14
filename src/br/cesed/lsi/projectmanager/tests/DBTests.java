package br.cesed.lsi.projectmanager.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.postgresql.Driver;

import br.cesed.lsi.project.Conexao;

public class DBTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test()
	public void ConectarBanco() throws ClassNotFoundException {
		
		Conexao banco = new Conexao();
		banco.conectar();
	}
	@Test()
	public void DesonectarBanco() throws ClassNotFoundException {
		
		Conexao banco = new Conexao();
		banco.conectar();
		banco.desconectar();
	}

}
 