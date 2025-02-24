package UD05FlujoDatos;

public class UD5ejercicio6 {

	public static void main(String[] args) {
		// Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%
		double precio = 10.5;
		double iva = 0.21;
		double precioFinal = precio + (precio * iva);
		System.out.println("El precio final con IVA es: " + precioFinal);
		
		
		

	}

}
