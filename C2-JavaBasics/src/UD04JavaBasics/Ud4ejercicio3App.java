package UD04JavaBasics;

public class Ud4ejercicio3App {

	    public static void main(String[] args) {
	        // Declaramos las variables
	        int X = 10, Y = 3;
	        double N = 5.5, M = 2.2;

	        // Mostramos los valores de las variables
	        System.out.println("Valor de X = " + X);
	        System.out.println("Valor de Y = " + Y);
	        System.out.println("Valor de N = " + N);
	        System.out.println("Valor de M = " + M);

	        // Realizamos las operaciones y mostramos los resultados
	        System.out.println("X + Y = " + (X + Y));
	        System.out.println("X - Y = " + (X - Y));
	        System.out.println("X * Y = " + (X * Y));
	        System.out.println("X / Y = " + ((double) X / Y));
	        System.out.println("X % Y = " + (X % Y));

	        System.out.println("N + M = " + (N + M));
	        System.out.println("N - M = " + (N - M));
	        System.out.println("N * M = " + (N * M));
	        System.out.println("N / M = " + (N / M));
	        System.out.println("N % M = " + (N % M));

	        System.out.println("X + N = " + (X + N));
	        System.out.println("Y / M = " + (Y / M));
	        System.out.println("Y % M = " + (Y % M));

	        // El doble de cada variable
	        System.out.println("El doble de X = " + (2 * X));
	        System.out.println("El doble de Y = " + (2 * Y));
	        System.out.println("El doble de N = " + (2 * N));
	        System.out.println("El doble de M = " + (2 * M));

	        // Suma de todas las variables
	        System.out.println("Suma de todas las variables = " + (X + Y + N + M));

	        // Producto de todas las variables
	        System.out.println("Producto de todas las variables = " + (X * Y * N * M));
	    }
	}
