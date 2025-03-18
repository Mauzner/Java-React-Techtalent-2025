package UD06MetodosyArrays;

import java.util.Scanner;

public class UD6ejercicio08 {

	public static void main(String[] args) {
		
		int size = 10;
		int [] miArray= llenarArray(size);
		imprimirArray(miArray);
			
	}
	
	public static int[] llenarArray(int size) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Introduce un número: ");
			array[i] = scanner.nextInt();
						
		}
		return array;
		
	}
	
	public static void imprimirArray (int[] array) {
		System.out.println( " \nValores del array: ");
		for (int num : array) {
			System.out.println(num + " ");
		}
	}
	
}
		 
		 
