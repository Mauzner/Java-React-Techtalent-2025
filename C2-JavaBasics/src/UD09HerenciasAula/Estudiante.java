package UD09HerenciasAula;

public class Estudiante extends Persona {
	private double calificacion;

	public Estudiante(String nombre, int edad, double calificacion) {
		super(nombre, edad);
		this.calificacion = calificacion;
	}

	@Override
	public boolean estaDisponible() {
		return Math.random() >= 0.5;
	}

	public boolean estaAprobado() {
		return calificacion >= 5;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		if (calificacion >= 0 && calificacion <= 10) {
			this.calificacion = calificacion;
		}
	}

}
