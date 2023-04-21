package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	private Calculadora calc, calc2;
	
	// hacemos un @BeforeEach para inicializar en cada método (volver a asignar los valores) para que no hayan conflictos
	@BeforeEach
	void setUp() throws Exception {
		calc = new Calculadora(2,3);
		calc2 = new Calculadora(2,3);
	}
	
	@Test
    public void testDivideix() {

    }

    @Test
    public void testMultiplica() {

    }

    @Test
    public void testResta() {
        calc = new Calculadora(2,3);
	    int resultat = calc.resta();
        assertEquals( -1, resultat, 0, "Error en la resta.");
    }

    @Test
    public void testSuma() {
        calc = new Calculadora(2,3);
	    int resultat = calc.suma();
	    int valorEsperat = 5;
        assertEquals(valorEsperat, resultat, 0, "Error en la resta.");
        
    }
}