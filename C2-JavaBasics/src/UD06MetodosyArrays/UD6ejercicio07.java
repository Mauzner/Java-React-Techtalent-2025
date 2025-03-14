package UD06MetodosyArrays;

import java.util.Scanner;

public class UD6ejercicio07 {

	public static void main(String[] args) {


			Scanner valorConsole = new Scanner(System.in);
			String divisa = "";
			int valor = 0;

			System.out.println("Pasa un valor en euros:");
			valor = valorConsole.nextInt();
			valorConsole.nextLine(); 
			
			do {
				System.out.println("Indica a quina divisa vols convertir:");
				System.out.println("libras");
				System.out.println("dolares");
				System.out.println("yenes"); 
				divisa = valorConsole.nextLine();
				divisa = divisa.toLowerCase();
			} while (!divisa.equals("libras") 
					 && !divisa.equals("dolares") 
					 && !divisa.equals("yenes"));

			
			switch (divisa) {
				case "libras":
					convertirEuroLibras(valor);
					break;
				case "dolares":
					convertirEuroDolares(valor);
					break;
				case "yenes":
					convertirEuroYenes(valor);
					break;
				default:
					System.out.println("Divisa no reconocida.");
					break;
			}
			System.out.println("Valor actual a  14/03/2025");
			valorConsole.close();

		}

		private static void convertirEuroLibras(int valor) {
			System.out.println("La conversió de " + valor + " € són £" + (valor * 0.84) 
					+ " (libras)");
		}

		private static void convertirEuroDolares(int valor) {
			System.out.println("La conversió de " + valor + " € són $" + (valor * 1.09) 
					+ " (dólares)");
		}

		private static void convertirEuroYenes(int valor) {
			System.out.println("La conversió de " + valor + " € són ¥" + (valor * 162.09) 
					+ " (yenes)");
		}

}
