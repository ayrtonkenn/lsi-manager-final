/*
Por favor edite os comandos aqui, nao insira tudo de uma vez

*/

create database lsi-tccmanager;

create table Professores(
	idProfessor serial not null,
	matricula_professor int,
	cpf int,
	curso varchar (20),
	senha varchar (12),
	
	constraint professor_pk primary key (idProfessor)
);



create table Alunos (
	idaluno serial,
	nome varchar(100),
	curso varchar(100),
	
	constraint idaluno_pk primary key (idaluno)
);

create table usuario (
	codigo serial,
	nome varchar(100),
	email varchar(50),
	curso varchar(50),
	tipo int,
	
	constraint iduser_pk primary key (codigo)
);

/* acoplamento forte
*/

create table Projeto (
	idprojeto serial,
	tema varchar(100),
	
	constraint data_professor_fk foreign key (idProfessor) references Professores(idProfessor)
);

create table TarefasHorario (
	projetochave int,
	aluno int,
	dataproj calendar,
	descricao varchar(100),
	
	constraint thAlun_fk foreign key references aluno(idaluno) ON DELETE cascade,
	
);

create table Orientacao (

);


/*
Modelos de CRUD : adicao de valores :
insert into 
modelo para recuperar valores :


anotacoes
delete table cr
*/
