package UD07ArrayListHashMap;

import java.util.HashMap;
import java.util.Scanner;



//import com.sun.org.apache.xerces.internal.util.SymbolHash.Entry;

public class UD7ejercicio03 {

	public static void main(String[] args) {
		
		HashMap< String, Integer> stock = new HashMap<>(10);
				
		stock.put("cerveza", 2);
		stock.put("agua", 1);
		stock.put("vino", 7);
		stock.put("refresco", 3);
		stock.put("lechuga", 1);
		stock.put("tomate", 1);
		stock.put("pan", 2);
		stock.put("carne", 5);
		stock.put("pescado", 6);
		stock.put("queso", 4);
		
		Scanner scanner = new Scanner(System.in);
		
		boolean salir = false;
		
		while (!salir) {
			System.out.println("\n Menú de opciones");
			System.out.println("1. Agregar nuevo producto");
			System.out.println("2. Consultar producto");
			System.out.println("3. Lista todos los productos");
			System.out.println("4. Salir");
			System.out.println("Introduce una opción: ");
			
			int opcion = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcion) {
				case 1:
					agregarArticulo(stock, scanner);
					break;
				
				case 2:
					consultarArticulo(stock, scanner);
					break;
					
				case 3:
					listarProductos(stock, scanner);
					break;
				
				case 4:
					System.out.println("Saliendo...");
					salir = true;
					break;
				default:
					System.out.println("Opción no válida, intenta de nuevo");
			}
		}
	}
	
	
		public static void agregarArticulo(HashMap<String, Integer> stock, Scanner scanner) {
			
			System.out.println("Introduce el nombre del producto: ");
			String nombre = scanner.nextLine();
			System.out.println("Introduce el precio del producto");
			int precio = scanner.nextInt();
			scanner.nextLine();
			
			stock.put(nombre, precio);
			System.out.println("Artículo añadido:" + nombre + " - Precio: " + precio);
		}
		
		public static void consultarArticulo(HashMap<String, Integer> stock, Scanner scanner) {
            
            System.out.println("Introduce el nombre del producto: ");
            String nombre = scanner.nextLine();
            
            if (stock.containsKey(nombre)) {
                System.out.println("El precio de " + nombre + " es: " + stock.get(nombre));
            } else {
                System.out.println("El producto no existe");
            }
        }
		
		public static void listarProductos(HashMap<String, Integer> stock, Scanner scanner) {

			int producto= 0;
			for (java.util.Map.Entry<String, Integer> lista: stock.entrySet()) {
				System.out.println(lista + "€");
			}
			
		
		
		
		
			 
		
	}

}
