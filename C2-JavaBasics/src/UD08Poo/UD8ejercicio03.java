package UD08Poo;

public class UD8ejercicio03 {

    // Constantes por defecto
    protected static final double PRECIO_BASE_DEF = 100.0;
    protected static final String COLOR_DEF = "blanco";
    protected static final char CONSUMO_ENERGETICO_DEF = 'F';
    protected static final double PESO_DEF = 5.0;

    // Colores permitidos
    private static final String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};

    // Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    // Constructor por defecto
	public UD8ejercicio03() {
		this(PRECIO_BASE_DEF, PESO_DEF, COLOR_DEF, CONSUMO_ENERGETICO_DEF);
	}

    // Constructor con precio y peso
    public UD8ejercicio03(double precioBase, double peso) {
        this(precioBase, peso, COLOR_DEF, CONSUMO_ENERGETICO_DEF);
    }

    public UD8ejercicio03(double precioBase2, double peso2, String colorDef, char consumoEnergeticoDef) {
		// TODO Auto-generated constructor stub
	}

	// Métodos de comprobación
    private char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        }
        return CONSUMO_ENERGETICO_DEF;
    }

    private String comprobarColor(String color) {
        color = color.toLowerCase();
        for (String c : COLORES_DISPONIBLES) {
            if (c.equals(color)) {
                return c;
            }
        }
        return COLOR_DEF;
    }

    // Getters
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    // Método para calcular el precio final
    public double precioFinal() {
        double precioFinal = precioBase;

        // Sumar según consumo energético
        switch (consumoEnergetico) {
            case 'A': precioFinal += 100; break;
            case 'B': precioFinal += 80; break;
            case 'C': precioFinal += 60; break;
            case 'D': precioFinal += 50; break;
            case 'E': precioFinal += 30; break;
            case 'F': precioFinal += 10; break;
        }

        // Sumar según peso
        if (peso > 0 && peso <= 19) {
            precioFinal += 10;
        } else if (peso <= 49) {
            precioFinal += 50;
        } else if (peso <= 79) {
            precioFinal += 80;
        } else if (peso >= 80) {
            precioFinal += 100;
        }

        return precioFinal;
    }
}


