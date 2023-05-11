import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TablaEnteroTest {

	static TablaEntero tE1;
	static TablaEntero tE2;
	static TablaEntero tE3;
	static Integer[] enterosVacio;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		Integer[] enteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		enterosVacio = new Integer[0];
		Integer[] enterosNegativos = { 1, -5, -45, -2002003, -200000 };

		tE1 = new TablaEntero(enteros);
		tE3 = new TablaEntero(enterosNegativos);

	}

	@Test
	void testSumaTabla() {
		assertEquals(55, tE1.sumaTabla(), 0);
		assertEquals(-2202052, tE3.sumaTabla(), 0);
	}

	// Cuando al intentar sumar la array este vacia
	@Test
	void testSumaTablaNull() throws IllegalArgumentException {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			TablaEntero tE2 = new TablaEntero(enterosVacio);
			tE2.sumaTabla();
		});
		assertEquals(exception.getMessage(), "No hay elementos");
	}

	@Test
	void testMayorTabla() {
		assertEquals(10, tE1.mayorTabla(), 0);
		assertEquals(1, tE3.mayorTabla(), 0);
	}

	// Cuando al intentar encontrar el mayor y la array esté vacia.
	@Test
	void testMayorTablaNull() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			TablaEntero tE2 = new TablaEntero(enterosVacio);
			tE2.mayorTabla();
		});
		assertEquals(exception.getMessage(), "No hay elementos");
		
	}
	
	// Cuando no encuentre el elemento que le pasamos
	@Test
	void testPosicionTablaNoSuchElement() {
		int n = 99;
		NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> {
			tE1.posicionTabla(n);
		});
		assertEquals(exception.getMessage(), "No existe: " + n);
	}

	@Test
	void testPosicionTabla() {
		assertEquals(3, tE1.posicionTabla(4), 0);
		assertEquals(1, tE3.posicionTabla(-5),0);
	}

}
