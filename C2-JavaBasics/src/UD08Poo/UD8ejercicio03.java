package UD08Poo;

public class UD8ejercicio03 {
	
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	
	private static final String COLOR_DEFAULT = "blanco";
	private static final char CONSUMO_ENERGETICO_DEFAULT = 'F';
	private static final double PESO_DEFAULT = 5.0;
	private static final double PRECIO_BASE_DEFAULT = 100.0;
	
	public UD8ejercicio03() {
		this.precioBase = PRECIO_BASE_DEFAULT;
        this.color = COLOR_DEFAULT;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
        this.peso = PESO_DEFAULT;
	}
	
	public UD8ejercicio03(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	public UD8ejercicio03(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
	}

}
