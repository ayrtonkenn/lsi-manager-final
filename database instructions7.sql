/*
Por favor edite os comandos aqui, nao insira tudo de uma vez

*/

create database lsi-tccmanager;

create table professor (
	idprofessor serial,
	nome varchar(100),
	
	cons
);


create table aluno (
	idaluno serial,
	nome varchar(100),
	curso varchar(100),
	
	constraint idaluno_pk primary key (idaluno)
);

create table usuario (
	
);

create table Projeto (
	idprojeto serial,
	tema varchar(100)
	
	constraint idprojeto_pk primary key (idprojeto)
);

create table TarefasHorario (
	projetochave int,
	aluno int,
	dataproj calendar,
	descricao varchar(100),
	
	..
);

create table Orientacao (

);

/*
Modelos de CRUD : adicao de valores :
insert into 
modelo para recuperar valores :

*/
