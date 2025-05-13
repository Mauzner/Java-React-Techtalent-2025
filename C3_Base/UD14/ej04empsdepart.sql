CREATE DATABASE empsdepart;
USE empsdepart;

CREATE TABLE departamentos(
    codigo INT AUTO_INCREMENT,
    nombre NVARCHAR(100) NOT NULL,
    presupuesto INT,
    PRIMARY KEY (codigo)
);

CREATE TABLE empleados(
    dni NVARCHAR(9) NOT NULL,
    nombre NVARCHAR(100) NOT NULL,
    apellidos NVARCHAR(255),
    departamento INT,
    PRIMARY KEY (dni),
    FOREIGN KEY (departamento)
    REFERENCE departamentos (codigo)
    ON DELETE CASCADE 
    ON UPDATE CASCADE
);