package UD05FlujoDatos;

public class UD5ejercicio11 {

	public static void main(String[] args) {
		
		String dia = "domingo"; 
		
			switch (dia) {
				case "lunes":
				case "martes":
				case "miércoles":
				case "jueves":
				case "viernes":
					System.out.println("Día laboral");
					break;
				case "sábado":
				case "domingo":
					System.out.println("Día festivo");
					break;
			    default:
					System.out.println("Día no válido");
					break;
			}
 
	}

}
