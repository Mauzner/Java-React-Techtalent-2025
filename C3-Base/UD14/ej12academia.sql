CREATE DATABASE academia

USE academia

CREATE TABLE profesores(
    dni CHAR(9) NOT NULL,
    nombre VARCHAR (100),
    apellido1 VARCHAR(100),
    apellido2 VARCHAR(100),
    CONSTRAINT unique_nombre UNIQUE (nombre, apellido1, apellido2),
    direccion VARCHAR(100),
    titulo VARCHAR(100),
    gana INT NOT NULL,
    PRIMARY KEY (dni));

CREATE TABLE cursos(
    id_curso INT NOT NULL,
    nombre VARCHAR(100),
    dni_profesor CHAR(9),
    max_alumnos INT,
    fecha_inicio DATE,
    fecha_fin DATE,
    CONSTRAINT fecha_crono CHECK (fecha_inicio < fecha_fin),
    num_horas INT NOT NULL,
    UNIQUE (nombre),
    PRIMARY KEY (id_curso),
    FOREIGN KEY (dni_profesor) REFERENCES profesores (dni)
    ON DELETE NO ACTION
    ON UPDATE CASCADE);

CREATE TABLE alumnos(
    dni CHAR(9) NOT NULL,
    nombre VARCHAR (100),
    apellido1 VARCHAR(100),
    apellido2 VARCHAR(100),
    direccion VARCHAR(100),
    sexo CHAR(1),
    CONSTRAINT sexo_alumno CHECK (sexo IN ('H', 'M')),
    fecha_nacimiento DATE,
    curso INT NOT NULL,
    PRIMARY KEY (dni),
    FOREIGN KEY (curso) REFERENCES cursos(id_curso)
    ON DELETE NO ACTION
    ON UPDATE CASCADE);
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