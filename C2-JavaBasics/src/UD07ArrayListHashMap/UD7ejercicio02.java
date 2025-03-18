package UD07ArrayListHashMap;

import java.util.ArrayList;
import java.util.Scanner;

public class UD7ejercicio02 {

	public static void main(String[] args) {
		ArrayList<Double> flujos = new ArrayList<>();

		ventas(flujos);

	}

	public static ArrayList<Double> ventas(ArrayList<Double> flujo) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantas ventas quieres: ");
		int ventas = sc.nextInt();

		double sum = 0;

		for (int i = 1; i < ventas + 1; i++) {
			System.out.println("Introduce el precio para la venta " + i + " : ");
			double precioVenta = sc.nextInt();
			flujo.add(precioVenta);
			sum += precioVenta;
		}
		System.out.println("Que porcentaje quieres: [4/21]");
		int decidir = sc.nextInt();

		if (decidir == 21) {

			System.out.println(
					"Has comprado: " + ventas + " productos por el " + "precio original de: " + sum + " euros.");
			sum *= 1.21;
			System.out.println("El precio final es de: " + sum);

			for (Double recorrer : flujo)
				System.out.println("La lista contiene: " + recorrer);
		} 
		else if (decidir == 4) {
			System.out.println(
					"Has comprado: " + ventas + " productos por el " + "precio original de: " + sum + " euros.");
			sum *= 1.04;
			System.out.println("El precio final es de: " + sum);

			for (Double recorrer : flujo)
				System.out.println("La lista contiene: " + recorrer);
		}
		return flujo;
	}

}
