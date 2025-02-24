package UD05FlujoDatos;

import java.util.Scanner;

public class UD5ejercicio5 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El número " + num + " es par.");
		} else {
			System.out.println("El número " + num + " es impar.");
		}
		
		scanner.close();
	}

}
