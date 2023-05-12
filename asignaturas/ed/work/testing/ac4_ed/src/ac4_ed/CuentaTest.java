package ac4_ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	private Cuenta c1;
	private Cuenta c2;

	@BeforeEach
	void setUp() throws Exception {
		c1 = new Cuenta();
		c2 = new Cuenta();
		
		c1.Deposito(0);
		c2.Deposito(0);
	}
	
	@Test
	@DisplayName("Test de deposito.")
	void testDeposito() {
		// ingresar en el deposito
		System.out.println(c1.Balance());
		c1.Deposito(100);
		System.out.println(c1.Balance());
		assertEquals(100, c1.Balance(), 0, "Error...");
	}

	@Test
	@DisplayName("Test de retiro de dinero.")
	void testRetiro() {
		// retirar dinero
		c1.Deposito(100);
		System.out.println(c1.Balance());
		c1.Retiro(50);
		System.out.println(c1.Balance());
		assertEquals(50, c1.Balance(), 0, "Error...");
	}

	@Test
	@DisplayName("Test de transferencia.")
	void testTransferencia() {
		// transferir de c1 a c2
		System.out.println(c1.Balance());
		c1.Transferencia(c2, 25);
		System.out.println(c2.Balance());
		assertEquals(25, c2.Balance(), 0, "Error...");
	}
	
	// assertAll -> para comprobar varios errores
	// assertEquals -> Si este falla, no comprueba el resto de assertsEquals

	
	

}


