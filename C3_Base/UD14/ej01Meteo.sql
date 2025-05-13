CREATE DATABASE meteo;
USE meteo;

CREATE TABLE estacion (
    idestacion MEDIUMINT UNSIGNED NOT NULL,
    lat VARCHAR(14) NOT NULL,
    longitud VARCHAR(15) NOT NULL,
    alt MEDIUMINT NOT NULL,
    PRIMARY KEY (id)   
);

CREATE TABLE muestra (
    idestación MEDIUMINT UNSIGNED NOT NULL,
    fecha DATE NOT NULL,
    tempmin TINYINT,
    tempmax TINYINT,
    precipita SMALLINT UNSIGNED,
    hummmin TINYINT UNSIGNED,
    hummax TINYINT UNSIGNED,
    velmin SMALLINT UNSIGNED,
    velmax SMALLINT UNSIGNED,
    PRIMARY KEY (idestacion), FOREIGN KEY (idestacion) REFERENCES estacion(id) ON DELETE NO ACTION ON UPDATE CASCADE
);