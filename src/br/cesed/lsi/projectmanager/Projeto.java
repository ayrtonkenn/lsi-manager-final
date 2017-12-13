package br.cesed.lsi.projectmanager;

import java.util.ArrayList;
import java.util.Date;

public class Projeto {
			private Professor orient;
			private String tema, descricao;
			private ArrayList<Aluno> alunos;
			private Date dataInicio;
			private ArrayList<String> sugestoesTema;
			private ArrayList<TarefasHorario> tarefas;
			
			/*
			 * ele é composto por alunos que irão ver a composicao
			 * 
			 * 
			 */
			public void sugestoesTema(String tema) {
				sugestoesTema.add(tema);
			}
			public boolean ifOrientable() {
				return false;
			}
			
			public void OrientProject () {
				
			}
			
		}