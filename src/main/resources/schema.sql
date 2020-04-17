drop table if exists contato;
create table contato (
    id IDENTITY PRIMARY KEY,
    nome varchar(255) not null,
    telefone varchar(255) not null,
    email varchar(255) not null
);