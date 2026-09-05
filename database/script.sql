CREATE DATABASE streaming;
use streaming;

CREATE TABLE conteudo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    tipo VARCHAR(30) NOT NULL,
    genero VARCHAR(50) NOT NULL,
    ano_lancamento INT NOT NULL,
    plataforma VARCHAR(50) NOT NULL
);