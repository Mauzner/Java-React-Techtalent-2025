package UD09HerenciasAula;

public class Aula {

	private int id;
	private int maxEstudiantes;
	private String materia;
	private Profesor profesor;
	private Estudiante[] estudiantes;

	public Aula(int id, int maxEstudiantes, String materia, Profesor profesor) {
		this.id = id;
		this.maxEstudiantes = maxEstudiantes;
		this.materia = materia;
		this.profesor = profesor;
		this.estudiantes = new Estudiante[maxEstudiantes];
	}

	public void asignarEstudiantes(Estudiante[] lista) {
		for (int i = 0; i < maxEstudiantes && i < lista.length; i++) {
			estudiantes[i] = lista[i];
		}
	}

	public boolean puedeDarseClase() {
		if (!profesor.estaDisponible()) {
			System.out.println("El profesor no está disponible.");
			return false;
		}

		if (!profesor.getMateria().equalsIgnoreCase(materia)) {
			System.out.println("El profesor no enseña la materia del aula.");
			return false;
		}

		int presentes = 0;
		for (Estudiante e : estudiantes) {
			if (e != null && e.estaDisponible()) {
				presentes++;
			}
		}

		boolean puede = presentes > (maxEstudiantes / 2);
		if (!puede)
			System.out.println("No hay suficientes alumnos presentes.");
		return puede;
	}

	public void mostrarAprobados() {
		int aprobados = 0;

		for (Estudiante e : estudiantes) {
			if (e != null && e.estaDisponible() && e.estaAprobado()) {
				aprobados++;
			}
		}

		System.out.println("Alumnos aprobados: " + aprobados);
	}

	// Getters y setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}

	public void setMaxEstudiantes(int maxEstudiantes) {
		this.maxEstudiantes = maxEstudiantes;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}

}
