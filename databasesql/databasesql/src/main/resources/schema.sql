DROP TABLE if EXISTS aluno;

CREATE TABLE aluno(
    id_aluno bigint auto_increment not null,
    fist_name varchar(60) not null,
    nota float not null,
    rg char (10) not null unique,
    primary key (id_aluno)
);