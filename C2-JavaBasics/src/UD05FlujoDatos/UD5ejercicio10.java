package UD05FlujoDatos;

import java.util.Scanner;

public class UD5ejercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Ingrese el número de ventas ");
		int numVentas = scanner.nextInt();
		
		double totalVentas = 0;
		
		for (int i = 1; i <= numVentas; i++) {
			System.out.println("Ingrese el valor de la venta " + i);
			double valorVenta = scanner.nextDouble();

			totalVentas += valorVenta;
		}
		
		System.out.println("El total de ventas es: " + totalVentas);
		
		scanner.close();

	}

}
