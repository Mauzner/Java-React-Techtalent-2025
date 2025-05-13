CREATE DATABASE priezprov;
USE priezprov;

CREATE TABLE piezas(
    idpiez INT AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    PRIMARY KEY (idpiez)
);

CREATE TABLE proveedores (
    idprov INT AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    PRIMARY KEY (idprov)
);

CREATE TABLE suminisrtra (
    idpiez INT,
    idprov INT,
    precio FLOAT NOT NULL,
    PRIMARY KEY (idpiez,idprov),
    FOREIGN KEY (idpiez)
    REFERENCE piezas (idpiez)
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    FOREIGN KEY (idprov)
    REFERENCE proveedores (idprov)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);