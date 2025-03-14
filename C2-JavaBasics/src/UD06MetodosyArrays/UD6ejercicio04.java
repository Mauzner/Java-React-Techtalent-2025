package UD06MetodosyArrays;

import java.util.Scanner;

public class UD6ejercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un número entero: ");
		int numero = scanner.nextInt();
		
		if (numero < 0) {
			System.out.println("El número es negativo.");
		} else {
			long resultado = calcularFactorial(numero);
			System.out.println("El factorial de " + numero + " es " + resultado);
		}
		
		scanner.close();

	}
	
	//Método para calcular el factorial de un número
	public static long calcularFactorial(int numero) {
		long resultado = 1;

		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}

		return resultado;
	}

}
