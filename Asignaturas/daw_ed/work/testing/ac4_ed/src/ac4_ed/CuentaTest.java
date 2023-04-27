package ac4_ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaTest {

	Cuenta c1 = new Cuenta();
	Cuenta c2 = new Cuenta();

	@Test
	void testDeposito() {
		// ingresar en el deposito
		System.out.println(c1.Balance());
		c1.Deposito(100);
		System.out.println(c1.Balance());
		assertEquals(100, c1.Balance(), 0, "Error...");
	}

	@Test
	void testRetiro() {
		// retirar dinero
		c1.Deposito(100);
		System.out.println(c1.Balance());
		c1.Retiro(50);
		System.out.println(c1.Balance());
		assertEquals(50, c1.Balance(), 0, "Error...");
	}

	@Test
	void testTransferencia() {
		// transferir de c1 a c2
		System.out.println(c1.Balance());
		c1.Transferencia(c2, 25);
		System.out.println(c2.Balance());
		assertEquals(25, c2.Balance(), 0, "Error...");
	}

	
	

}


