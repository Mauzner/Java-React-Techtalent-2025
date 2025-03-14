package UD06MetodosyArrays;

import java.util.Scanner;

public class UD6ejercicio06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Pedir al usuario un núnmero enetro positivo
		System.out.println("Introduce un número entero positivo: ");
		int num = scanner.nextInt();
		
		//Verificar que el número sea positivo
		if (num <= 0) {
			System.out.println("El número introducido no es positivo.");
		} else {
			// Llamar al método contarCifras y mostrar el resultado
			System.out.println("El número " + num + " tiene " + contarCifras(num) + " cifras.");
		}
		
		scanner.close();
	}
	
	public static int contarCifras(int num) {
		int contador = 0;

		// Mientras el número sea mayor que 0
		while (num > 0) {
			// Dividir el número entre 10
			num = num / 10;
			// Aumentar el contador de cifras
			contador++;
		}
		return contador;
	}
}


