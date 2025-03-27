package UD07ArrayListHashMap;

import javax.swing.*;
import java.util.*;

public class UD7ejercicio04 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Map<String, Double>> inventario = new HashMap<>();
    private static final List<Double> carrito = new ArrayList<>();

    public static void main(String[] args) {
        inicializarInventario();
        elegirModo();
    }

    private static void elegirModo() {
        String[] opciones = { "Administrador", "Usuario", "Salir" };
        switch (JOptionPane.showOptionDialog(null, "Selecciona el modo de acceso:", "Modo de acceso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0])) {
            case 0 -> mostrarMenuStock();
            case 1 -> mostrarMenuCompras();
            case 2 -> System.exit(0);
        }
    }

    private static void inicializarInventario() {
        agregarProducto("Manzana", 0.99, 50);
        agregarProducto("Leche", 1.49, 30);
        agregarProducto("Pan", 2.75, 20);
        agregarProducto("Arroz", 1.20, 100);
        agregarProducto("Huevos", 3.50, 60);
    }

    private static void mostrarMenuStock() {
        while (true) {
            System.out.println("\n===== MODO ADMINISTRADOR =====");
            System.out.println("1. Listar productos\n2. Consultar producto\n3. Añadir/Actualizar producto\n4. Volver");
            switch (solicitarEntero()) {
                case 1 -> listarProductos();
                case 2 -> consultarProducto();
                case 3 -> añadirOActualizarProducto();
                case 4 -> elegirModo();
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private static void mostrarMenuCompras() {
        String[] opciones = { "Agregar producto", "Finalizar compra", "Volver" };
        while (true) {
            switch (JOptionPane.showOptionDialog(null, "Selecciona una opción:", "Compras", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0])) {
                case 0 -> venderProducto();
                case 1 -> finalizarCompra();
                case 2 -> elegirModo();
            }
        }
    }

    private static void agregarProducto(String nombre, double precio, int stock) {
        inventario.put(nombre.toLowerCase(), Map.of("precio", precio, "stock", (double) stock));
    }

    private static void listarProductos() {
        inventario.forEach((producto, info) -> System.out.println(producto + " → Precio: " + info.get("precio") + "€, Stock: " + info.get("stock").intValue()));
    }

    private static void consultarProducto() {
        System.out.print("\nIntroduce el nombre del artículo: ");
        String articulo = scanner.nextLine().toLowerCase();
        System.out.println(inventario.containsKey(articulo) ? "Producto: " + articulo + " Precio: " + inventario.get(articulo).get("precio") + "€, Stock: " + inventario.get(articulo).get("stock").intValue() : "El artículo no está en la base de datos.");
    }

    private static void añadirOActualizarProducto() {
        System.out.print("\nIntroduce el nombre del artículo: ");
        String articulo = scanner.nextLine().toLowerCase();
        if (inventario.containsKey(articulo)) {
            System.out.print("Introduce la cantidad adicional en stock: ");
            inventario.get(articulo).put("stock", inventario.get(articulo).get("stock") + solicitarEntero());
        } else {
            System.out.print("Introduce el precio: ");
            double precio = solicitarDouble();
            System.out.print("Introduce el stock: ");
            agregarProducto(articulo, precio, solicitarEntero());
        }
        System.out.println("Operación realizada correctamente.");
    }

    private static void venderProducto() {
        String producto = JOptionPane.showInputDialog("Introduce el nombre del producto:").toLowerCase();
        if (!inventario.containsKey(producto)) {
            JOptionPane.showMessageDialog(null, "Producto no disponible.");
            return;
        }
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad:"));
        if (cantidad > inventario.get(producto).get("stock")) {
            JOptionPane.showMessageDialog(null, "Stock insuficiente.");
        } else {
            carrito.add(inventario.get(producto).get("precio") * cantidad);
            inventario.get(producto).put("stock", inventario.get(producto).get("stock") - cantidad);
            JOptionPane.showMessageDialog(null, "Producto agregado al carrito.");
        }
    }

    private static void finalizarCompra() {
        if (carrito.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay productos en el carrito.");
            return;
        }
        double suma = carrito.stream().mapToDouble(Double::doubleValue).sum();
        double IVA = JOptionPane.showOptionDialog(null, "Selecciona el IVA:", "IVA", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[]{ "21%", "4%" }, "21%") == 0 ? 0.21 : 0.04;
        double totalConIVA = suma * (1 + IVA);
        double pago = Double.parseDouble(JOptionPane.showInputDialog("Total: " + String.format("%.2f", totalConIVA) + "€. Introduce el pago:"));
        JOptionPane.showMessageDialog(null, pago < totalConIVA ? "Faltan " + String.format("%.2f", totalConIVA - pago) + "€ por pagar." : "Cambio: " + String.format("%.2f", pago - totalConIVA) + "€");
        carrito.clear();
    }

    private static int solicitarEntero() {
        while (!scanner.hasNextInt()) {
            System.out.print("Error. Introduce un número válido: ");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    private static double solicitarDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Error. Introduce un número válido: ");
            scanner.next();
        }
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }
}
