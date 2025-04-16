package UD09HerenciasRaices;

public class RaicesApp {

	public static void main(String[] args) {

		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(1, -3, 2);
		CalcularRaices calcularRaices = new CalcularRaices(ecuacion);

		System.out.println("Discriminante: " + calcularRaices.getDiscriminante());

		if (calcularRaices.tieneDosRaices()) {
			System.out.println("Tiene dos raíces: ");
			double[] raices = calcularRaices.obtenerRaices();
			System.out.println("Raíz 1: " + raices[0]);
			System.out.println("Raíz 2: " + raices[1]);

		} else if (calcularRaices.tieneUnaRaiz()) {
			System.out.println("Tiene una raíz: ");
			System.out.println("Raíz única: " + calcularRaices.obtenerRaizUnica());
		} else {
			System.out.println("No tiene raíces reales.");
		}

	}

}
