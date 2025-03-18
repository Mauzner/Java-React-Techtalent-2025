package UD07ArrayListHashMap;

import java.util.HashMap;

public class UD7ejercicio01 {

	public static void main(String[] args) {
		HashMap< String, Double> notas = new HashMap<>();
		notas.put("Juan", 5.5);
		notas.put("Ana", 7.2);
		notas.put("Luis", 6.8);
		notas.put("Maria", 8.5);
		
		double medio = media(notas);
		
		System.out.println(medio);
		
	}
	
	public static double media(HashMap<String, Double> notas) {
		double suma = 0;
		for (Double nota : notas.values()) {
			suma += nota;
		}
		return suma / notas.size();
	}

}
