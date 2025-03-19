package UD06MetodosyArrays;

import java.util.Random;
import java.util.Scanner;

public class UD6ejercicio09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Tamaño del array:");
		int tamany = scanner.nextInt();
		int max = 9, min = 0;
		
		int array[] = llenaRandoms(max , min, tamany);
		
		sumaArray(array);
		scanner.close();
		
	}
	
	public static int[] llenaRandoms (int maximo , int minimo, int size) {
		
		int lista[] = new int[size];
		Random random = new Random();
		for (int i = 0; i < lista.length; i++) {
			lista[i] = random.nextInt (maximo - minimo + 1);
			System.out.println( " Para la posición " + i + " el valor es " + lista[i]);
		}
		
		return lista;
	}
	
	public static void sumaArray (int lista[]) {
        
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }
        System.out.println(" La suma de los valores del array es " + suma);
    }
}
