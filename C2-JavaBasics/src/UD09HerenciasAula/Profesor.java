package UD09HerenciasAula;

public class Profesor extends Persona {

	private String materia;

	public Profesor(String nombre, int edad, String materia) {
		super(nombre, edad);
		this.materia = materia;
	}

	@Override
	public boolean estaDisponible() {
		return Math.random() >= 0.2;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

}
