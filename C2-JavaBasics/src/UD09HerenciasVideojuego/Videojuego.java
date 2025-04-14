package UD09HerenciasVideojuego;

public class Videojuego {
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compania;

	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "";
		this.compania = "";
	}

	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "";
		this.compania = "";
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
		this.entregado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public void entregar() {
		this.entregado = true;
	}

	public void devolver() {
		this.entregado = false;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public int compareTo(Object a) {
		Videojuego otro = (Videojuego) a;
		return Integer.compare(this.horasEstimadas, otro.getHorasEstimadas());
	}

	@Override
	public String toString() {
		return "Videojuego{" + "titulo='" + titulo + '\'' + ", horasEstimadas=" + horasEstimadas + ", entregado="
				+ entregado + ", genero='" + genero + '\'' + ", compania='" + compania + '\'' + '}';
	}

}
