package ac4_ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CuentaTest {

	Cuenta c1 = new Cuenta();

	@Test
	void testDeposito() {
		// ingresar en el deposito
		c1.Deposito(100);
	}

	@Test
	void testRetiro() {
		// retirar dinero
		c1.Retiro(50);
	}

	@Test
	void testTransferencia() {
		// transferir a una cuenta
		c1.Transferencia(c1, 2000);
		assertEquals();
	}

	
	void testBalance() {
		// return de balance
		c1.Balance();
	}

}
