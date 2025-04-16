package UD09HerenciasRaices;

public class CalcularRaices {

	private EcuacionSegundoGrado ecuacion;

	public CalcularRaices(EcuacionSegundoGrado ecuacion) {
		this.ecuacion = ecuacion;
	}

	public double getDiscriminante() {
		double a = ecuacion.getA();
		double b = ecuacion.getB();
		double c = ecuacion.getC();
		return (b * b) - (4 * a * c);
	}

	public boolean tieneUnaRaiz() {
		return getDiscriminante() == 0;
	}

	public boolean tieneDosRaices() {
		return getDiscriminante() > 0;
	}

	public double[] obtenerRaices() {

		double a = ecuacion.getA();
		double b = ecuacion.getB();
		double discriminante = getDiscriminante();
		double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
		double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
		return new double[] { raiz1, raiz2 };

	}

	public double obtenerRaizUnica() {
		double a = ecuacion.getA();
		double b = ecuacion.getB();
		return -b / (2 * a);
	}

}
