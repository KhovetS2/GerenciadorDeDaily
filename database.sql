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
select * from usuario;
CREATE TABLE daily (

id int auto_increment NOT NULL PRIMARY KEY,
conteudo mediumtext,
dataRealizada date,
usuario_id int not null,
constraint fk_usuario_id foreign key (usuario_id) references usuario(id)
);

select daily.id, Conteudo, dataRealizada, nome, cargo from daily inner join usuario on usuario.id = daily.usuario_id;
desc usuario;

CREATE USER 'fatec'@'%' IDENTIFIED BY 'fatec';
GRANT ALL PRIVILEGES ON daily . * TO 'fatec'@'%';