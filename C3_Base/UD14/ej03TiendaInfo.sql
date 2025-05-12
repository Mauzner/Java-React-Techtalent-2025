CREATE DATABASE tiendainfo;
USE tiendainfo;

CREATE TABLE fabricantes (
    condigo INT,
    nombre NVARCHAR(100),
    PRIMARY KEY (codigo)
);

ALTER TABLE 'fabricantes' CHANGE 'codigo' 'codigo' INT(11) NOT NULL AUTO_INCREMENT;

INSERT INFO 'fabricantes' ('codigo','nombre') VALUES (NULL, 'HP');

CREATE TABLE articulos (
    codart INT NOT NULL AUTO_INCREMENT,
    nombre NVARCHAR (100),
    precio FLOAT,
    fabricante INT,
    PRIMARY KEY (codart),
    FOREIGN KEY (fabricante)
    REFERENCES fabricantes (codigo)
    ON DELETET CASCADE
    ON UPDATE CASCADE
);



