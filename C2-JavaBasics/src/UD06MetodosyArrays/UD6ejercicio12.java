package UD06MetodosyArrays;
import java.util.Random;
import java.util.Scanner;

public class UD6ejercicio12 {

	public static void main(String[] args) {
		

		// Crear objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Tamaño del array
		System.out.print("Introduce el tamaño del array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];

		// Pedir al usuario que ingrese el dígito final que desea
		System.out.print("Introduce el dígito final (0-9): ");
		int digitoFinal = scanner.nextInt();

		// Crear objeto Random para generar números aleatorios
		Random random = new Random();

		// Rellenar el array con números aleatorios que terminan en el dígito deseado
		int index = 0;
		while (index < size) {
			// Generar un número aleatorio
			int numero = random.nextInt(301); // Genera un número entre 0 y 300

			// Verificar si el último dígito del número coincide con el dígito final
			if (numero % 10 == digitoFinal) {
				array[index] = numero;
				index++;
			}
		}

		// Mostrar el contenido del array
		System.out.println(size + " Números aleatorios que terminan en " + digitoFinal + " son :");
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}

		scanner.close();
	}
	
	

		
	
		
		
		
		
		
	}


