create database progestao;

create table usuarios(
	cod int primary key auto_increment,
    tipo varchar(15),
    nome varchar(60),
    maezinha varchar(60),
    sexo varchar(20),
    nascimento date,
    cpf varchar(15),
    cnh varchar(20),
    fone varchar(15),
    logradouro varchar(60),
    numero int,
    complemento varchar(20),
    bairro varchar(15),
    senha text
);

select * from usuarios;