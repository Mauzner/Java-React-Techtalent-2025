package UD05FlujoDatos;

import javax.swing.JOptionPane;

public class UD5ejercicio13 {

	public static void main(String[] args) {
		
		int op1 = Integer.parseInt(JOptionPane.showInputDialog( "" + "Introduce el primero operador "));
		int op2 = Integer.parseInt(JOptionPane.showInputDialog( "" + "Introduce el segundo operador "));
		
		String signo = JOptionPane.showInputDialog( "" + "Introduce el signo arimetico ");
		String resultado = "";
		
		switch (signo) {
		case "+":
			resultado = "La suma es: " + (op1 + op2);
			break;
			
		case "-":
			resultado = "La resta es: " + (op1 - op2);
			break;
		
		case "/":
			if (op2 == 0) {
				resultado = "No se puede dividir por 0";
			} else {
				resultado = "La division es: " + (op1 / op2);
			}
			break;
		
		case "^":
			resultado = "La potencia es: " + Math.pow(op1, op2);
			break;
		
		case "%":
            resultado = "El resto es: " + (op1 % op2);
            break;
		
		case "*":
			resultado = "La multiplicacion es: " + (op1 * op2);
			break;
		
		default:
			break;
		
		}
		
		JOptionPane.showMessageDialog(null, resultado);
	}

}
