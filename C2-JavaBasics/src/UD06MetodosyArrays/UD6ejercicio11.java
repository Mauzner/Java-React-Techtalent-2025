package UD06MetodosyArrays;

import java.util.Scanner;

public class UD6ejercicio11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el tamaño del array: ");

		int size = scanner.nextInt();
		System.out.print("Introduce el rango máximo del random: ");
		int range = scanner.nextInt();
		
		// Genera el primer y segundo array con valores random
		int[] randomArray1 = generarRandomArray(size, range);
		int[] randomArray2 = generarRandomArray(size, range);
		
		//Multiplicar los arrays
		int[] randomArray3= multiplicarArrays(randomArray1, randomArray2);
		
		//Imprimir arrays
		System.out.println("Array random 1: ");
		printArray(randomArray1);
		System.out.println("Array random 2: ");
		printArray(randomArray2);
		System.out.println("Multiplicación de los arrays: ");
		printArray(randomArray3);

		scanner.close();
	
	}

		//Método para generar un array e tamaño size y con valores aleatorios en el rango [0,max)
	public static int[] generarRandomArray(int size, int max) {

		int[] array1 = new int[size];

		for (int i = 0; i < size; i++) {
			array1[i] = (int) (Math.random() * max);
		}
		return array1;

	}

	
	//Método para imprimir un array
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println();
	}

	//Método para multiplicar los elementos correspondientes de dos arrays
	public static int[] multiplicarArrays(int[] array1, int[] array2) {
		int[] array3 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i] * array2[i];
		}
		return array3;
	}

}
