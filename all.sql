create database if not exists Estoque;
use Estoque;
create table produtoo(
Posicao int auto_increment primary key,

Produto varchar(50),
Quantidade int,
preco decimal(9,3),
precoV decimal(9,3),
Codigo int
);
create table usuario(
num int auto_increment primary key,

usuari varchar(20),
senha varchar(20)
);
