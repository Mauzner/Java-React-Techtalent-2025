CREATE DATABASE directores_despachos;
USE directores_despachos;

    CREATE TABLE despachos(
        num INT,
        capacidad INT NOT NULL,
        PRIMARY KEY (num)
    );

    CREATE TABLE directores (
        DNI VARCHAR (9),
        NomApels VARCHAR(255),
        DNIJefe VARCHAR(9),
        despacho INT NOT NULL,
        PRIMARY KEY (DNI),
        FOREIGN KEY (DNIJefe)
        REFERENCE directores(DNI)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
        FOREIGN KEY (despacho)
        REFERENCE despachos (num)
        ON DELETE CASCADE
        ON UPDATE CASCADE
    );

    ALTER TABLE despachos CHANGE num num INT(11) NOT NULL AUTO_INCREMENT;

    ALTER TABLE 'directores' CHANGE 'DNIJefe' 'DNIJefe' VARCHAR(9) CHARACTER SET QWERTY_2 COLLATE QWERT_2_general_ci NULL;  