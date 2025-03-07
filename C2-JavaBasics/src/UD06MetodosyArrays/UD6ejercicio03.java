package UD06MetodosyArrays;

import javax.swing.JOptionPane;

public class UD6ejercicio03 {

	public static void main(String[] args) {
		int numPrimo = 73; 
		
		numPrimo = Integer.parseInt(JOptionPane.showInputDialog(" Introduce el número ");
		
		if (numeroPrimo(numPrimo)) {
			System.out.printf("El %d es primo ", numPrimo).println();
		} else {
			System.out.printf("El %d no es primo", numPrimo).println(); 
		}
	}
	
	public static boolean numeroPrimo (int valorPrimo) {
		boolean primoSiNo = true;
		
			for (int i = 2; i <= Math.sqrt(valorPrimo); i++) {
            if (valorPrimo % i == 0) {
                return false;
                //equivalente:
                //primoSiNo = false;
                //break;
            }
		}
		return primoSiNo;
	}


}


