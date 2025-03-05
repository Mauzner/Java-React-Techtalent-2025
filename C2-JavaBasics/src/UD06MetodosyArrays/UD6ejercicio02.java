package UD06MetodosyArrays;

import java.util.Scanner;

public class UD6ejercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce la cantidad de números aleatorios que genere: ");
		int cantidad = scanner.nextInt();
		
		System.out.print("Introduce el número mínimo: ");
		int min = scanner.nextInt();
		
		System.out.print("Introduce el número máximo: ");
		int max = scanner.nextInt();
		
		if (min>max) {
			System.out.println("El número mínimo no puede ser mayor que el número máximo.");
        } else {
        	System.out.println("\nNúmeros aleatorios generados: ");
        	            
        	for (int i=0; i<cantidad; i++) {
        		int neumeroAleatorio = generarNumeroAleatorio(min, max);
        		System.out.println(neumeroAleatorio);
        		
        }
            
        
		}
		   
		scanner.close();	

	}
	
	
	public static int generarNumeroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}

}
