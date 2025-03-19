package UD06MetodosyArrays;

import java.util.Random;
import java.util.Scanner;

public class UD6ejercicio10 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        Random random = new Random();

	        System.out.print("Introduce el tamaño del array: ");
	        int tamaño = sc.nextInt();
	        
	        System.out.print("Introduce el valor minimo: ");
	        int minimo = sc.nextInt();
	        
	        System.out.print("Introduce el valor maximo: ");
	        int maximo = sc.nextInt();
	        
	        int[] randomArray = new int[tamaño];
	        int max = 0;
	        
	        for (int i = 0; i < tamaño; i++) {
	            int randomNum = random.nextInt(minimo, maximo);
	            randomArray[i] = randomNum;
	            
	            if (randomNum > max) {
	                max = randomNum;
	            }

	            boolean isPrime = checkPrime(randomNum);
	            if(isPrime){
	               System.out.println("El numero generado : " + randomArray[i] + " es primo!");
	            }else {
	              System.out.println("El numero generado : " + randomArray[i] + " no es primo!");
	            }
	        }
	        System.out.println("El numero generado maximo es: " +max);
	    }

	    public static boolean checkPrime(int num) {
	        boolean prime = true;
	        for (int i = 2; i < num; i++) {
	            if (num % i == 0) {
	                prime = false;
	            }

	        }
	        return prime;

	}

}
