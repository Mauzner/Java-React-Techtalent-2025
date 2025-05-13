CREATE DATABASE investigadores;
USE investigadores;

CREATE TABLE facultades(
    cod INT AUTO_INCREMENT,
    nombre VARCHAR(100)NOT NULL,
    PRIMARY KEY (cod)
);

CREATE TABLE investigadores(
    dni VARCHAR(9),
    nomapels VARCHAR(255)NOT NULL,
    codfac INT,
    PRIMARY KEY (DNI),
    FOREIGN KEY (codfac)
    REFERENCE facultades(cod)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE equipos(
    numserie CHAR (4),
    PRIMARY KEY (numserie),
    nombre VARCHAR (100),
    codfac INT,
    FOREIGN KEY (codfac)
    REFERENCE facultades(cod)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE reserva (
    dni VARCHAR (8),
    numserie CHAR (4),
    comienzo DATE,
    fin DATE,
    PRIMARY KEY (dni,numserie),
    FOREIGN KEY (dni) 
    REFERENCE investigadores(dni)
    ON DELETE CASCADE 
    ON UPDATE CASCADE
);

ALTER TABLE 'facultades' CHANGE 'cod' 'cod' INT (11) NOT NULL AUTO_INCREMENT;
