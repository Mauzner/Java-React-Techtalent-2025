package UD05FlujoDatos;

import javax.swing.JOptionPane;

public class UD5PruebaJOptionPane {

	public static void main(String[] args) {

		int precioProducto = 1000;

		final double IVA = 0.21;

		JOptionPane.showMessageDialog(null,
				"El precio de producto, incluido el IVA es " + (precioProducto + (precioProducto * IVA)));

	}

}
