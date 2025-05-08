CREATE TABLE clientes(
    dni VARCHAR(20) PRIMARY KEY,
    correo VARCHAR(40),
    nombre VARCHAR(10)
);

CREATE TABLE facturas_venta(
        nfactura INT PRIMARY KEY,
        dni VARCHAR(20),
        fecha DATE,
        FOREIGN KEY(dni) REFERENCES clientes(dni)
);
CREATE TABLE productos (
    num_serie INT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    inventario VARCHAR(50) NOT NULL,
    PRIMARY KEY (num_serie)
);
CREATE TABLE se_compone (
    num_serie INT NOT NULL,
    num_pedido INT NOT NULL,
    cantidad INT NOT NULL,
    PRIMARY KEY (num_serie, num_pedido),
    FOREIGN KEY (num_serie) REFERENCES productos ( num_serie ),
    FOREIGN KEY (num_pedido) REFERENCES ventas_compras (num_pedido)
);
CREATE TABLE vantas_compras (
    num_pedido INT PRIMARY KEY,
    dni VARCHAR(20),
    FOREIGN KEY(dni) REFERENCES clientes (dni)
);
CREATE TABLE facturas_compra(
    num_compra INT PRIMARY KEY,
    fecha date
);
CREATE TABLE proveedores(
    dni VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(25),
    num_pedido INT,
    FOREIGN KEY(num_pedido) REFERENCES ventas_compras(num_pedido)
    );
-- Clientes
INSERT INTO clientes (dni, correo, nombre) VALUES
('12345678A', 'ana@mail.com', 'Ana'),
('23456789B', 'jose@mail.com', 'Jose'),
('34567890C', 'maria@mail.com', 'Maria'),
('45678901D', 'pedro@mail.com', 'Pedro'),
('56789012E', 'laura@mail.com', 'Laura');

-- Ventas_Compras (corregido el nombre de la tabla)
INSERT INTO ventas_compras (num_pedido, dni) VALUES
(1001, '12345678A'),
(1002, '23456789B'),
(1003, '34567890C'),
(1004, '45678901D'),
(1005, '56789012E');

-- Productos
INSERT INTO productos (num_serie, nombre, inventario) VALUES
(2001, 'Teclado', '20 unidades'),
(2002, 'Ratón', '50 unidades'),
(2003, 'Monitor', '15 unidades'),
(2004, 'Portátil', '10 unidades'),
(2005, 'Impresora', '5 unidades');

-- Se_Compone
INSERT INTO se_compone (num_serie, num_pedido, cantidad) VALUES
(2001, 1001, 2),
(2002, 1001, 1),
(2003, 1002, 1),
(2004, 1003, 1),
(2005, 1004, 1);

-- Facturas_Venta
INSERT INTO facturas_venta (nfactura, dni, fecha) VALUES
(3001, '12345678A', '2024-03-01'),
(3002, '23456789B', '2024-03-02'),
(3003, '34567890C', '2024-03-03'),
(3004, '45678901D', '2024-03-04'),
(3005, '56789012E', '2024-03-05');

-- Facturas_Compra
INSERT INTO facturas_compra (num_compra, fecha) VALUES
(4001, '2024-02-01'),
(4002, '2024-02-02'),
(4003, '2024-02-03'),
(4004, '2024-02-04'),
(4005, '2024-02-05');

-- Proveedores
INSERT INTO proveedores (dni, nombre, num_pedido) VALUES
('98765432Z', 'Proveedor A', 1001),
('87654321Y', 'Proveedor B', 1002),
('76543210X', 'Proveedor C', 1003),
('65432109W', 'Proveedor D', 1004),
('54321098V', 'Proveedor E', 1005);
CREATE TABLE facturas_compra(
    num_compra INT PRIMARY KEY,
    fecha date,
    num_pedido INT,
    FOREIGN KEY(num_pedido) REFERENCES ventas_compras(num_pedido)
);
UPDATE clientes
SET correo = 'nuevo_ana@mail.com'
WHERE dni = '12345678A';

UPDATE productos
SET inventario = '18 unidades'
WHERE num_serie = 2001;

UPDATE facturas_venta
SET fecha = '2024-03-10'
WHERE nfactura = 3001;
-
SELECT * FROM facturas_venta
WHERE dni = '12345678A'; 
SELECT * FROM productos
WHERE inventario LIKE '1% unidades';
SELECT * FROM clientes;
-
DELETE FROM facturas_compra
WHERE num_compra = 4005;


DELETE FROM productos
WHERE num_serie = 2005;


DELETE FROM proveedores
WHERE dni = '54321098V';