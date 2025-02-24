package UD05FlujoDatos;

import java.util.Scanner;

public class UD5ejercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println(" Introduce el radio el círculo: ");
		String input = scanner.nextLine();
		
		double radio = Double.parseDouble(input);
		
		double area = Math.PI * Math.pow(radio, 2);
		
		System.out.println(" El area del circulo es: " + area);
		
		scanner.close();	

	}

}
