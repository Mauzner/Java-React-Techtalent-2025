CREATE DATABASE academia;
USE academia;

CREATE TABLE profesores(
    dni VARCHAR (9);
    nombre VARCHAR(255),
    apellido1 VARCHAR(255),
    apellido2 VARCHAR(255),
    direccion VARCHAR(100),
    titulacion VARCHAR(50),
    sueldo SMALLINT NOT NULL,
    UNIQUE (nnombre, apellido1,apellido2),
    PRIMARY KEY (dni)
);

CREATE TABLE cursos(
    cod INT,
    nombre VARCHAR(100),
    horas INT NOT NULL,
    fechainicio DATE,
    fechafin DATE,
    maxalumos INT,
    dni VARCHAR(9),
    PRIMARY KEY (cod),
    UNIQUE (nombre),
    CONSTRAINT fechacurso CHECK (fechainicio<fechafin),
    FOREIGN KEY (dni)
    REFERENCE profesores (dni)
    ON DELETE CASCADE
    ON UPDATE CASCADE
    );
    CREATE TABLE alumnos(
        nombre VARCHAR(255),
        apellido1 VARCHAR (255),
        apellido2 VARCHAR (255),
        dni VARCHAR (9),
        direccion VARCHAR(100),
        nace DATE,
        sexo CHAR CHECK (sexo IN('H','M')),
        codalumn INT,
        UNIQUE (nombre),
        PRIMARY KEY (dni),
        FOREIGN KEY (codalumn)
        REFERENCE curso (cod)
        ON DELETE CASCADE
        ON UPDATE CASCADE
    );