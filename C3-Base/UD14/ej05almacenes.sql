CREATE DATABASE almacenes;
USE almacenes;

CREATE TABLE almacenes(
    codigo INT AUTO_INCREMENT,
    lugar VARCHAR (100) NOT NULL,
    capacidad INT,
    PRIMARY KEY (codigo));

CREATE TABLE cajas(
    nref CHAR(5),
    contenido VARCHAR(100) NOT NULL,
    valor FLOAT,
    almacen INT,
    PRIMARY KEY (nref),
    FOREIGN KEY (almacen)
    REFERENCES almacenes (codigo)
    ON DELETE CASCADE 
    ON UPDATE CASCADE);