package UD08Poo;

public class UD8ejercicio04 {


	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	private static final int TEMPORADAS_DEFECTO = 3;
	private static final boolean ENTREGADO_DEFECTO = false;

	public UD8ejercicio04() {
		this.titulo = "";
		this.temporadas = TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = "";
	}

	public UD8ejercicio04(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = creador;
	}

	public UD8ejercicio04(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = creador;
	}
}
