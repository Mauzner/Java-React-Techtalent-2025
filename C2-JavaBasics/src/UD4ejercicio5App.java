
public class UD4ejercicio5App {

	    public static void main(String[] args) {
	        // Declaramos las cuatro variables y les asignamos un valor
	        int A = 10, B = 20, C = 30, D = 40;

	        // Mostramos los valores iniciales de las variables
	        System.out.println("Valor inicial de A = " + A);
	        System.out.println("Valor inicial de B = " + B);
	        System.out.println("Valor inicial de C = " + C);
	        System.out.println("Valor inicial de D = " + D);

	        // Realizamos los intercambios de valores
	        B = C;
	        C = A;
	        A = D;
	        D = B;

	        // Mostramos los valores finales de las variables
	        System.out.println("\nValor final de A = " + A);
	        System.out.println("Valor final de B = " + B);
	        System.out.println("Valor final de C = " + C);
	        System.out.println("Valor final de D = " + D);
	    }
	}
