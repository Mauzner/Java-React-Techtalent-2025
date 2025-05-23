CREATE DATABASE almacenes2;
USE almacenes2;

CREATE TABLE cajeros (cod INT NOT NULL AUTO_INCREMENT, nomapels VARCHAR (255) NOT NULL, PRIMARY KEY(cod));

CREATE TABLE productos (cod INT NOT NULL AUTO_INCREMENT, nombre VARCHAR (100) NOT NULL, precio INT,PRIMARY KEY(cod));

CREATE TABLE maquinas (cod INT NOT NULL AUTO_INCREMENT, piso INT, PRIMARY KEY(cod));

CREATE TABLE venta (
    cajero INT,
    maquina INT,
    producto INT,
    PRIMARY KEY(cajero, maquina, producto),
    FOREIGN KEY (cajero) 
    REFERENCES cajeros (cod) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    FOREIGN KEY (maquina) 
    REFERENCES productos (cod) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    FOREIGN KEY (producto) 
    REFERENCES maquinas (cod) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE);