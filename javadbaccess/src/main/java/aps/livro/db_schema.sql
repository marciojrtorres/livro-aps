CREATE DATABASE agenda;

USE agenda;

CREATE TABLE contatos (
	id_contato int PRIMARY KEY AUTO_INCREMENT,
	nome varchar(50) NOT NULL,
	sobrenome varchar(50) NOT NULL,
	telefone varchar(20)
);