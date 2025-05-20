


INSERT INTO despachos (numero, capacidad) VALUES
(101, 2),
(102, 3),
(103, 1),
(104, 4),
(105, 2),
(106, 3),
(107, 1),
(108, 2),
(109, 5),
(110, 3);


INSERT INTO directores (dni, NomApels, DNIJefe, despacho) VALUES
('11111111A', 'Ana Gómez', NULL, 1),
('22222222B', 'Luis Pérez', '11111111A', 2),
('33333333C', 'María López', '11111111A', 3),
('44444444D', 'Carlos Ruiz', '22222222B', 4),
('55555555E', 'Laura Sánchez', '22222222B', 5),
('66666666F', 'Jorge Martínez', '33333333C', 6),
('77777777G', 'Sofía Ramírez', '33333333C', 7),
('88888888H', 'David Torres', '44444444D', 8),
('99999999I', 'Elena Navarro', '55555555E', 9),
('10101010J', 'Pedro Iglesias', '66666666F', 10);
