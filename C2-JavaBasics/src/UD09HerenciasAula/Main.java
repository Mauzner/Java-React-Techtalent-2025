package UD09HerenciasAula;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();

		Profesor profesor = new Profesor("Juan", 40, "matematicas");
		Aula aula = new Aula(1, 10, "matematicas", profesor);

		Estudiante[] estudiantes = new Estudiante[10];
		for (int i = 0; i < estudiantes.length; i++) {
			String nombre = "Est" + (i + 1);
			int edad = rand.nextInt(5) + 15;
			double nota = Math.round((rand.nextDouble() * 10) * 10.0) / 10.0;
			estudiantes[i] = new Estudiante(nombre, edad, nota);
		}

		aula.asignarEstudiantes(estudiantes);

		System.out.println("¿Se puede dar clase?");
		if (aula.puedeDarseClase()) {
			System.out.println("Sí, se puede dar clase.");
			aula.mostrarAprobados();
		} else {
			System.out.println("No, no se puede dar clase.");
		}
	}
}
