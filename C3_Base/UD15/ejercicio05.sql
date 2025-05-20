INSERT INTO facultades (cod, nombre) VALUES
(1, 'Facultad de Ingeniería'),
(2, 'Facultad de Medicina'),
(3, 'Facultad de Ciencias'),
(4, 'Facultad de Derecho'),
(5, 'Facultad de Psicología'),
(6, 'Facultad de Economía'),
(7, 'Facultad de Informática'),
(8, 'Facultad de Arquitectura'),
(9, 'Facultad de Biología'),
(10, 'Facultad de Química');


INSERT INTO equipos (numserie, nombre, codfac) VALUES
(1001, 'Microscopio Óptico', 9),
(1002, 'Resonador Magnético', 2),
(1003, 'Impresora 3D', 1),
(1004, 'Cámara Termográfica', 3),
(1005, 'Servidor HPC', 7),
(1006, 'Estación de Trabajo', 1),
(1007, 'Espectrómetro', 10),
(1008, 'Escáner 3D', 8),
(1009, 'Simulador Económico', 6),
(1010, 'Sensor EEG', 5);


INSERT INTO investigadores (dni, nomapels, codfac) VALUES
('11111111A', 'María González', 1),
('22222222B', 'José Fernández', 2),
('33333333C', 'Lucía Navarro', 3),
('44444444D', 'Pablo Torres', 4),
('55555555E', 'Sofía Morales', 5),
('66666666F', 'David Ruiz', 6),
('77777777G', 'Elena Sánchez', 7),
('88888888H', 'Carlos Ortega', 8),
('99999999I', 'Laura Díaz', 9),
('00000000J', 'Raúl Herrera', 10);


INSERT INTO reserva (dni, numserie, comienzo, fin) VALUES
('11111111A', 1003, '2025-05-01', '2025-05-03'),
('22222222B', 1002, '2025-04-20', '2025-04-25'),
('33333333C', 1004, '2025-05-10', '2025-05-12'),
('44444444D', 1008, '2025-05-05', '2025-05-07'),
('55555555E', 1010, '2025-05-02', '2025-05-04'),
('66666666F', 1009, '2025-04-28', '2025-04-30'),
('77777777G', 1005, '2025-05-11', '2025-05-14'),
('88888888H', 1008, '2025-05-03', '2025-05-06'),
('99999999I', 1001, '2025-04-25', '2025-04-27'),
('00000000J', 1007, '2025-05-08', '2025-05-09');
