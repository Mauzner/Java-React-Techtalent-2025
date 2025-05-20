INSERT INTO cajeros (cod, nomapels) VALUES
(1, 'Juan Pérez'),
(2, 'Laura Martínez'),
(3, 'Carlos Gómez'),
(4, 'Marta López'),
(5, 'Pedro Sánchez'),
(6, 'Ana Ruiz'),
(7, 'Luis Torres'),
(8, 'Sofía Díaz'),
(9, 'Jorge Romero'),
(10, 'Elena Castro');


INSERT INTO maquinas (cod, piso) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 1),
(5, 2),
(6, 3),
(7, 1),
(8, 2),
(9, 3),
(10, 1);


INSERT INTO productos (cod, nombre, precio) VALUES
(1, 'Agua', 1.00),
(2, 'Refresco', 1.50),
(3, 'Snack', 2.00),
(4, 'Café', 1.20),
(5, 'Té', 1.10),
(6, 'Galletas', 1.80),
(7, 'Chocolate', 2.20),
(8, 'Sandwich', 3.00),
(9, 'Zumo', 1.70),
(10, 'Barra energética', 2.50);


INSERT INTO venta (cajero, maquina, producto) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 4),
(5, 5, 5),
(6, 6, 6),
(7, 7, 7),
(8, 8, 8),
(9, 9, 9),
(10, 10, 10);

