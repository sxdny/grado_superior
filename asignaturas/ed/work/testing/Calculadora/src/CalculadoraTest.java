<<<<<<< HEAD
=======
import static org.junit.Assert.assertEquals;

>>>>>>> clase
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testDivideix() {

    }

    @Test
    public void testMultiplica() {

    }

    @Test
    public void testResta() {
<<<<<<< HEAD

=======
        // crear la calculadora
        Calculadora calc = new Calculadora(2,3);
	    int resultat = calc.resta();
        // crear assert
        assertEquals("Error en la resta.", -1, resultat, 0);
        /* 
        El 0 es el delta, que es el margen del resultado.
        0 en este caso significa que tienen que ser iguales.
        */ 
>>>>>>> clase
    }

    @Test
    public void testSuma() {
<<<<<<< HEAD

=======
        // crear la calculadora
        Calculadora calc = new Calculadora(2,3);
	    int resultat = calc.suma();
        // crear assert
        assertEquals("Error en la suma", 5, resultat, 0);
        /* 
        El 0 es el delta, que es el margen del resultado.
        0 en este caso significa que tienen que ser iguales.
        */ 
>>>>>>> clase
    }
}
