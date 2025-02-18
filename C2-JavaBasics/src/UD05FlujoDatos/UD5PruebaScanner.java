
package UD05FlujoDatos;

import java.util.Scanner;

public class UD5PruebaScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" -- Bienvenida a la consulta --");
		System.out.println(" Indroduce tus sintomas: ");

		String name = sc.nextLine();
		sc.close();

		System.out.println(" Me la pela tu " + name.toLowerCase());

	}

}
