INSERT INTO piezas (idpiez, nombre) VALUES
(1, 'Tornillo'),
(2, 'Tuerca'),
(3, 'Arandela'),
(4, 'Clavo'),
(5, 'Remache'),
(6, 'Pasador'),
(7, 'Engranaje'),
(8, 'Rodamiento'),
(9, 'Eje'),
(10, 'Perno');


INSERT INTO proveedores (idprov, nombre) VALUES
(1, 'Proveedora del Norte'),
(2, 'Suministros López'),
(3, 'Ferretería Central'),
(4, 'Industrias Reunidas'),
(5, 'Metalúrgica Sur'),
(6, 'TecnoSuministros'),
(7, 'Comercial Bravo'),
(8, 'Distribuidora Delta'),
(9, 'Grupo Tornex'),
(10, 'Industrial Prime');


INSERT INTO suministra (idpiez, idprov, precio) VALUES
(1, 1, 0.10),
(2, 2, 0.15),
(3, 3, 0.05),
(4, 4, 0.08),
(5, 5, 0.20),
(6, 6, 0.18),
(7, 7, 1.50),
(8, 8, 2.00),
(9, 9, 3.00),
(10, 10, 2.50);
