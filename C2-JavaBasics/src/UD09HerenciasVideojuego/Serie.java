package UD09HerenciasVideojuego;


public class Serie  {
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
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
		Serie otra = (Serie) a;
		return Integer.compare(this.numeroTemporadas, otra.getNumeroTemporadas());
	}

	@Override
	public String toString() {
		return "Serie{" + "titulo='" + titulo + '\'' + ", numeroTemporadas=" + numeroTemporadas + ", entregado="
				+ entregado + ", genero='" + genero + '\'' + ", creador='" + creador + '\'' + '}';
	}
	
	
}
