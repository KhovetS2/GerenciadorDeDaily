show databases;
create database daily;

use daily;

CREATE TABLE usuario (
	id int auto_increment NOT NULL PRIMARY KEY,
    nome VARCHAR(80) unique,
	cargo varchar(60),
    senha varchar(30)

);
show tables;
CREATE TABLE daily (

id int auto_increment NOT NULL PRIMARY KEY,
conteudo mediumtext,
dataRealizada date,
usuario_id int not null,
constraint fk_usuario_id foreign key (usuario_id) references usuario(id)
);
CREATE TABLE dia_de_trabalho (

id int auto_increment NOT NULL PRIMARY KEY,
dias int,
usuario_id int not null,
constraint fk_usuario_id_dias foreign key (usuario_id) references usuario(id)
);

CREATE TABLE avisos(
id int auto_increment NOT NULL PRIMARY KEY,
conteudo VARCHAR(255),
remetente VARCHAR(80)
);

CREATE TABLE avisos_tem_usuarios (
avisos_id_avisos int not null,
usuario_id_usuarios int not null,
constraint fk_usuario_id_usuarios foreign key (avisos_id_avisos) references usuario(id),
constraint fk_avisos_id_avisos foreign key (usuario_id_usuarios) references avisos(id)
);


