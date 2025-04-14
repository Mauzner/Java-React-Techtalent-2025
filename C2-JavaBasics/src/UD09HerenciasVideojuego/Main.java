package UD09HerenciasVideojuego;

public class Main {
	public static void main(String[] args) {
		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];

		series[0] = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
		series[1] = new Serie("Friends", 10, "Comedia", "David Crane");
		series[2] = new Serie("Stranger Things", 4, "Ciencia Ficción", "Hermanos Duffer");
		series[3] = new Serie("Dark", "Baran bo Odar");
		series[4] = new Serie();

		videojuegos[0] = new Videojuego("The Witcher 3", 50, "RPG", "CD Projekt");
		videojuegos[1] = new Videojuego("Minecraft", 100);
		videojuegos[2] = new Videojuego("Fortnite", 30, "Battle Royale", "Epic Games");
		videojuegos[3] = new Videojuego("FIFA 24", 25, "Deporte", "EA");
		videojuegos[4] = new Videojuego();

		series[1].entregar();
		series[3].entregar();
		videojuegos[0].entregar();
		videojuegos[2].entregar();
		videojuegos[3].entregar();

		int seriesEntregadas = 0;
		int videojuegosEntregados = 0;

		for (Serie s : series) {
			if (s.isEntregado()) {
				seriesEntregadas++;
				s.devolver();
			}
		}

		for (Videojuego v : videojuegos) {
			if (v.isEntregado()) {
				videojuegosEntregados++;
				v.devolver();
			}
		}

		System.out.println("Series entregadas: " + seriesEntregadas);
		System.out.println("Videojuegos entregados: " + videojuegosEntregados);

		Serie serieMax = series[0];
		for (int i = 1; i < series.length; i++) {
			if (series[i].compareTo(serieMax) > 0) {
				serieMax = series[i];
			}
		}

		Videojuego videojuegoMax = videojuegos[0];
		for (int i = 1; i < videojuegos.length; i++) {
			if (videojuegos[i].compareTo(videojuegoMax) > 0) {
				videojuegoMax = videojuegos[i];
			}
		}

		System.out.println("\nLa serie con más temporadas es:");
		System.out.println(serieMax);

		System.out.println("\nEl videojuego con más horas estimadas es:");
		System.out.println(videojuegoMax);
	}
}
