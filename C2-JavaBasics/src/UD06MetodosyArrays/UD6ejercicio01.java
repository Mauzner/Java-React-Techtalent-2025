package UD06MetodosyArrays;

import java.util.Scanner;

public class UD6ejercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        System.out.println("Área del círculo: " + calcularAreaCirculo(radio));

    
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();
        System.out.println("Área del triángulo: " + calcularAreaTriangulo(base, altura));

    
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        System.out.println("Área del cuadrado: " + calcularAreaCuadrado(lado));

        scanner.close();
    }

   
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    
    public static double calcularAreaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }
}
