package com.junit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.junit.Geometria;


public class GeometriaTest {

	@Test
	void testAreacuadrado() {
		Geometria geometria = new Geometria();
		assertEquals(25, geometria.areacuadrado(5), 
				"El area del cuadrado con lado 5 debería ser 25");
	}
	
	@Test
	void areaCirculo() {
		Geometria geometria = new Geometria();
		assertEquals(12.5664, geometria.areaCirculo(2), 
				"El area del circulo con radio 2 debería ser 12.5664 ");
	}
	
	@Test
	void testArearectangulo() {
		Geometria geometria = new Geometria();
		assertEquals(10, geometria.arearectangulo(5,2), 
				"El area del rectangulo con base 5 debería ser 10");
	}

}