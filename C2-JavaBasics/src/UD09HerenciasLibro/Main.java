package UD09HerenciasLibro;

public class Main {

	public static void main(String[] args) {

		Libro libro1 = new Libro("978-3-16-148410-0", "El Quijote", "Miguel de Cervantes", 1000);
		Libro libro2 = new Libro("978-1-234-56789-7", "Cien años de soledad", "Gabriel García Márquez", 500);

		System.out.println(libro1.toString());
		System.out.println(libro2.toString());

		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println(" El libro con más páginas es: " + libro1.getTitulo());
		} else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
			System.out.println(" El libro con más páginas es: " + libro2.getTitulo());
		} else {
			System.out.println(" Ambos libros tienen el mismo número de páginas.");
		}

	}

}
