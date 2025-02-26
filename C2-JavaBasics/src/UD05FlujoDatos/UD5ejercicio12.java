package UD05FlujoDatos;

import javax.swing.JOptionPane;

public class UD5ejercicio12 {

	public static void main(String[] args) {
		
		String contraseña = "1234";
		
		int intentos = 3;
		
		while (intentos > 0) {

			String cliente = JOptionPane.showInputDialog("Introduce la contraseña: ");
			
			if (cliente.equals(contraseña)) {
                JOptionPane.showMessageDialog(null, "Contraseña correcta");
                break;
            } else {
                intentos--;
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Te quedan " + intentos + " intentos");
            }
		}
	}

}
