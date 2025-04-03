package UD08Poo;

public class UD8ejercicio01 {

	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;

	UD8ejercicio01() {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = 'M';
		this.peso = 75.0;
		this.altura = 1.80;
	}

	UD8ejercicio01(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
}