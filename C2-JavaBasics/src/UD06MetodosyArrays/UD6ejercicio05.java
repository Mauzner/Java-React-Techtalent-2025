package UD06MetodosyArrays;

import java.util.Scanner;

public class UD6ejercicio05 {

	public static void main(String[] args) {
		 
	        Scanner scanner= new Scanner(System.in); 
	        System.out.println("Introduce un número");  
	        String num = scanner.nextLine();
	        
	        int numero =Integer.parseInt(num);
	        System.out.println(Binario(numero));
	        
	        scanner.close();
	    }

	   public static String Binario(int n1) {
	       String result =""; 
	        int resto; 
	        do {
	            resto= n1%2; 
	            n1= n1/2; 
	            result = resto + result; 
	        }while (n1>0); 
	        
	        return result; 
	    

	}

}
